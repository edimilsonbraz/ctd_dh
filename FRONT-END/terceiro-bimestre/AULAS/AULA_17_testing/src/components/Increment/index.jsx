import { useState } from 'react'

function Increment() {
  const [number, setNumber] = useState(0);

  function incrementValue() {
    setNumber(number + 1)
  }

  return (
    <div>
      <h1>{number}</h1>
      <button onClick={incrementValue}>incrementar</button>
    </div>
  )
}

export default Increment