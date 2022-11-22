import { useEffect, useState } from 'react'
import { Axios } from './Axios';
// import { Button } from './Button';
import { UseMemo } from './UseMemo';

export function App() {
  const [vetor, setVetor] = useState([])

  //Função para chamar os dados da API
  async function getData() {
    const data = await fetch('https://jsonplaceholder.typicode.com/comments')
    const convert = await data.json();

    setVetor(convert)

  }
  // console.log(vetor)

  //useEffect
  useEffect(() => {
    // getData();
  },[]);


  return (
    <div>
      <h1>Dados da API</h1>
      <ul>
        {vetor.map(object => {
          return (
            <li 
              key={object.email}>{vetor.length > 0 ? object.email : "Carregando..."}
            </li>)
        })}
      </ul>

      {/* <h1>useCallback</h1>
        <Button /> */}

      <h1>useMemo</h1>
      <UseMemo />

      <h1>Axios</h1>
      <Axios />
    </div>

  )
}
