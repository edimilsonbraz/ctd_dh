import { useEffect, useState } from 'react'
import Card from '../../components/Card'

import './styles.css'

function Home() {
  const [beers, setBeers] = useState([])

  const getBeers = async () => {
    const res = await fetch('https://api.punkapi.com/v2/beers')
    const data = await res.json()
    setBeers(data)
  }

  useEffect(() => {
    getBeers()
  })

  return (
    <div className="grid-home">
      <h1>Home page</h1>
      {/* <h1><h1>Mais do que bebidas, vamos celebrar o encontro!!</h1> </h1> */}
      {/* {beers.length 
           ? beers.map(beer => (<Card data={beer} />))
           : null
        } */}
    </div>
  )
}

export default Home
