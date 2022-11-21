import { useState, memo } from 'react'


//useMemo retorna o valor da função
function ShowValue({ params }) {
  console.log(`ShowValue render, ${params.value}`)

  return <div className="value">{params.value}</div>
}

const MemoShowValue = memo(ShowValue)

export function UseMemo() {
  const [counter, setCounter] = useState(0)
  const [value, setValue] = useState('ON')

  console.log(`App re-render, ${counter}`)

  const changeCounter = () => {
    setCounter(counter + 1)
  }

  const changeValue = () => {
    setValue(value === 'ON' ? 'OFF' : 'ON')
  }

  return (
    <div className="container">
      <h1>Exemplo de useMemo</h1>
      <div className="items">
        <MemoShowValue params={{ value }} />
      </div>
      <div className="actions">
        <button onClick={changeCounter} className="btn btn-teal">
          Re-render
        </button>

        <button onClick={changeValue} className="btn btn-sky">
          Change Value
        </button>
      </div>
    </div>
  )
}


