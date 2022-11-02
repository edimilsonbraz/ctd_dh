import { useState } from "react";


function App() {
  const [pessoas, setPessoas] = useState([])
  const [nomes, setNomes] = useState("");
  const [idade, setIdade] = useState(0);
  const [pokemon, setPokemon] = useState("")

  function handleSubmit(event) {
    event.preventDefault();

    if(nomes.trim()) {
      setPessoas([...pessoas, [nomes, idade, pokemon]])
    }else{
      alert("Informe ao menos o nome!");
    }

    setNomes('')
    setIdade(0)
    setPokemon('')
    
  }

  return (
    <div>
      <h1>Formulário de registro</h1>

      <form onSubmit={handleSubmit}>
        <input 
          type="text"
          value={nomes} 
          placeholder="nome completo"
          onChange={(event) => setNomes(event.target.value)}
        /> <br/><br/>
        <input 
          type="text" 
          value={idade}
          placeholder="idade"
          onChange={(event) => setIdade(event.target.value)}
        /> <br/><br/>
        <input 
          type="text" 
          value={pokemon}
          placeholder="pokemon favorito"
          onChange={(event) => setPokemon(event.target.value)}
        /> <br/><br/>
        <button type="submit">Registrar</button>
      </form>

      {
        pessoas.map((item) => <h2>{item}</h2>)
      }
    </div>
  )
}

export default App
