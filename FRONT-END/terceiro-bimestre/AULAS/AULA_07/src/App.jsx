import { useState } from 'react'
import './App.css'

function App() {
  const [items, setItems] = useState([]);

  function addItem() {
    setItems([...items, items.length + 1]);
    console.log(items)
  }

  return (
    <div className="App">
      <h1>Lista de items</h1>
      <ul>
        {items.map((item) => (
          <li>{`O item ${item} foi adicionado à lista!`}</li>
        ))}
      </ul>
      <button onClick={addItem}>Aperte</button>
    </div>
  )
}

export default App;
