import { useState } from 'react'
import { Card } from './components/Card'

import './App.css'

export function App() {
  const [nome, setNome] = useState('');
  const [cor, setCor] = useState('');

  const [card, setCard] = useState([]);

  function handleSubmit(event) {
    event.preventDefault();
    // alert("Entrei")
    setNome('')
    setCor('')
    if(nome.length < 3 || nome === " ") {
      alert("Por favor, insira no mínimo 3 caractere")
      
    }
    setCard([...card, [nome, cor] ])

    
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
                placeholder="Insita sua cor no formato Hexadecimal"
                onChange={(e) => setCor(e.target.value)}
              />            
            </fieldset>
          </div>
          <div className='button'>
            <input type="submit" value="Adicionar " />   
          </div>
        </form>        
      </div>

      {/* <div className='container-error'>
        <span>Por favor, verifique os dados inseridos no formulário</span>
      </div> */}

      <h1>CORES FAVORITAS</h1>

      <div className='cards'>
        {
          card.map((item) => ( 
            <Card nome={nome} cor={`# ${cor}`}/>
          ))
        }
      </div>
    </div>
  )
}
