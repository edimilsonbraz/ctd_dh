import { useState } from 'react'
import { Card } from './components/Card'

import './App.css'

export function App() {
  const [nomeCor, setNomeCor] = useState("");
  const [cor, setCor] = useState("");
  const [error, setError] = useState("")
  const [cardColor, setCardColor] = useState([]);

  function handleSubmit(event) {
    event.preventDefault();
    
    if(nomeCor.trim().length < 3 || nomeCor === "") {
      setError("Por favor, verifique os dados inseridos no formulário")
      
      setTimeout(() => {
        setError("")
      }, 3000);
      return;
    }
    
    if(!(/\d/.test(cor)) ) {
      setError("Por favor, verifique os dados inseridos no formulário")

      setTimeout(() => {
        setError("")
      }, 3000);
      return;
    }

    setCardColor([...cardColor, {nome: nomeCor, cor: cor}])

    setNomeCor("")
    setCor("")

  }

  return (
    <div className="App">
      <div className={error ? "container-form error" : "container-form"}>
        <h1>Adicionar nova cor</h1>

        <form onSubmit={handleSubmit}>
          <div className='content-form'>
            <fieldset>
              <label htmlFor="">Nome</label>
              <input
                style={error ? { background: '#473434 '} : null}
                value={nomeCor} 
                type="text" 
                placeholder="nome" 
                onChange={(e) => setNomeCor(e.target.value)}
              />
            </fieldset>
            <fieldset>
              <label htmlFor="">Cor</label>
              <input
                style={error ? { background: '#473434 '} : null}  
                value={cor}
                type="text"
                placeholder="Insita sua cor no formato Hexadecimal (#000000)"
                onChange={(e) => setCor(e.target.value)}
              />            
            </fieldset>
          </div>
          <div className='button'>
            <input type="submit" value="Adicionar " />   
          </div>
        </form>        
      </div>

      <div className='container-error'>
        <span>{error}</span>
      </div>
     
      <h1 className='title-cores'>CORES FAVORITAS</h1>

      <div className='cards'>
        {
          cardColor.map((item) => {
            return ( 
              <Card key={item.cor} nomeCor={item.nome} cor={item.cor}/>
            )
          })
        }
      </div>
    </div>
  )
}
