import { useState } from 'react'
import { Card } from './components/Card'

import './App.css'

export function App() {
  const [error, setError] = useState("")
  const [nome, setNome] = useState('');
  const [cor, setCor] = useState('');

  const [card, setCard] = useState([]);

  function handleSubmit(event) {
    event.preventDefault();
    // alert("Entrei")
    
    if(nome.trim().length < 3 || nome === "") {
      setError("Por favor, verifique os dados inseridos no formulário")
      
      setTimeout(() => {
        clearInputs()
      }, 3000);
      return;
    }

    if((/\d/.test(cor)) ) {
      // cor.trim().length > 2 || cor.length >= 6
      setCard([...card, [nome, cor] ])
      
    }else {
      setError("Por favor, verifique os dados inseridos no formulário")

      setTimeout(() => {
        clearInputs()
      }, 3000);
      return;
    }
    
  }

  function isHexaValido(cor) {
    const regexColor = /^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})|^([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$/;
    
    return regexColor.test(cor)
  }  

  function clearInputs() {
    setNome("")
    setCor("")
    setError("")
  }

  return (
    <div className="App">
      <div className='container-form'>
        <h1>Adicionar nova cor</h1>

        <form onSubmit={handleSubmit}>
          <div className='content-form'>
            <fieldset>
              <label htmlFor="">Nome</label>
              <input 
                type="text" 
                placeholder="nome" 
                onChange={(e) => setNome(e.target.value)}
              />
            </fieldset>
            <fieldset>
              <label htmlFor="">Cor</label>
              <input
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
          card.map(() => ( 
            <Card key={nome} nome={nome} cor={cor}/>
          ))
        }
      </div>
    </div>
  )
}
