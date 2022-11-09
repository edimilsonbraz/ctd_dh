import { Card } from './components/Card'

import './App.css'

export function App() {
  return (
    <div className="App">
      <div className='container-form'>
        <h1>Adicionar nova cor</h1>

        <form action="">
          <div className='content-form'>
            <group>
              <label htmlFor="">Nome</label>
              <input type="text" placeholder="nome" />
            </group>
            <group>
              <label htmlFor="">Cor</label>
              <input
                type="text"
                placeholder="Insita sua cor no formato Hexadecimal"
              />            
            </group>
          </div>
          <div className='button'>
            <button type="submit">Adicionar</button> 
          </div>
        </form>
      </div>

      <Card />
    </div>
  )
}
