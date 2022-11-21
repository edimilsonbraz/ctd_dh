import { useEffect, useState } from 'react'
// import { Button } from './Button';
import { UseMemo } from './UseMemo';

export function App() {
  const [vetor, setVetor] = useState([])

  //Função para chamar os dados da API
  const getData = async () => {
    const data = await fetch('https://jsonplaceholder.typicode.com/comments')
    const convert = await data.json();

    setVetor(convert)

  }
  // console.log(vetor)

  //useEffect
  useEffect(() => {
    // getData();
  });


  return (
    <div>
      <h1>Dados da API</h1>
      <ul>
        {vetor.map(object => {
          return(<li key={object.email}>{object.email}</li>)
        })}
      </ul>

      {/* <h1>useCallback</h1>
        <Button /> */}

      <h1>useMemo</h1>
      <UseMemo />
    </div>

  )
}
