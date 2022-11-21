// import { useCallback, useState } from 'react'

// export function Button() {
//   const Button = React.memo(({ handleClick, name }) => {
//     console.log(`${name} rendered`)
//     return <button onClick={handleClick}>{name}</button>
//   })

//   const Counter = () => {
//     console.log('counter rendered')
//     const [countOne, setCountOne] = useState(0)
//     const [countTwo, setCountTwo] = useState(0)

//     return (
//       <>
//         {countOne} {countTwo}
//         <Button handleClick={() => setCountOne(countOne + 1)} name="button1" />
//         <Button handleClick={() => setCountTwo(countTwo + 1)} name="button1" />
//       </>
//     )
//   }
// }
