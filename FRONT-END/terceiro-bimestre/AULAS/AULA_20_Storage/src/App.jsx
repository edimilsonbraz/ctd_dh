import { useContext, useState } from 'react'
import { UserContext } from './contexts/Context'
import './App.css'

function App() {
  // Acessamos o contexto criado
  const userContext = useContext(UserContext)

  // Obtemos as informações do usuário e a função de atualização.
  const { user, changeUser } = userContext

  // Criamos um estado para controlar o input que nos permitirá
  // pesquisar um usuário do Github
  const [input, setInput] = useState(user.username)

  //Criaremos o controller do evento “click”, que será responsável por obter os dados da API do github e invocar a função de atualização dentro do nosso contexto.
  async function onClick() {
    const data = await fetch(`https://api.github.com/users/${input}`)
    const json = await data.json()
    console.log(json)
    //Espalhando os dados que vem da API
    const { name, bio, avatar_url, html_url, login } = json

    changeUser({ name, bio, avatar_url, html_url, username: login })
  }

  return (
    <div className="App">
      <h1>Perfil do Github</h1>

      <div>
        <input
          placeholder="Insira nome de usuário"
          defaultValue={user.username}
          onChange={(e) => setInput(e.target.value)}
        />
        <button onClick={onClick}>Ver Perfil</button>

        <section className='user-container'>
          <h3>{user.name}</h3>
          <img src={user.avatar_url} width="100" alt={user.name} />
          <p>{user.bio}</p>
          <a href={user.html_url} target="_blank" rel="noreferrer">
            Ver perfil completo
          </a>
        </section>
      </div>
    </div>
  )
}

export default App
