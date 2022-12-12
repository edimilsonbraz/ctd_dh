import { useContext, useState } from 'react'
import api from '../../services/api'
import { DentistaContext } from '../../contexts/DentistaProvider'
import { useNavigate } from 'react-router-dom'
import { FaUserAlt } from 'react-icons/fa'

import styles from './styles.module.css'

const LoginForm = () => {
  const {saveToken} = useContext(DentistaContext);
  const navigate = useNavigate();

  const [user, setUser] = useState('')
  const [password, setPassword] = useState('')

  const handleSubmit = (e) => {
    //Nesse handlesubmit você deverá usar o preventDefault,
    e.preventDefault()

    auth()
  }

  //enviar os dados do formulário e enviá-los no corpo da requisição
  //para a rota da api que faz o login /auth
  async function auth() {
    try {
      const response = await api.post('/auth', {
        "username": user,
        "password": password
      })
      //lembre-se que essa rota vai retornar um Bearer Token e o mesmo deve ser salvo
      //no localstorage para ser usado em chamadas futuras
      saveToken(response.data.token)

      //Com tudo ocorrendo corretamente, o usuário deve ser redirecionado a página principal,com react-router
      navigate("/home")

      alert("Bem-vindo a DH Odonto!")

    } catch (error) {
      //Lembre-se de usar um alerta para dizer se foi bem sucedido ou ocorreu um erro
      alert('Erro ao logar ' + error)
    }
  }

  return (
    <>
      {/* //Na linha seguinte deverá ser feito um teste se a aplicação
        // está em dark mode e deverá utilizar o css correto */}
      <div className={`text-center card container ${styles.card}`}>
        <div className={`card-body ${styles.CardBody}`}>
          <h1>
            <FaUserAlt />
            Login
          </h1>
          <form onSubmit={handleSubmit}>
            <input
              className={`form-control ${styles.inputSpacing}`}
              value={user}
              onChange={(event) => setUser(event.target.value)}
              placeholder="digite o usuario"
              name="login"
              required
            />
            <input
              className={`form-control ${styles.inputSpacing}`}
              value={password}
              onChange={(event) => setPassword(event.target.value)}
              placeholder="senha"
              name="password"
              type="password"
              required
            />
            <button className="btn btn-primary" type="submit">
              Enviar
            </button>
          </form>
        </div>
      </div>
    </>
  )
}

export default LoginForm
