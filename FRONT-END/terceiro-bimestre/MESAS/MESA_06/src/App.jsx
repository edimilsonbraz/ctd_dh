import './App.css'
import React from 'react'

import { cities } from './mock/cities'
import { ItemList } from './components/ItemList'

/* Array de cidades que deve ser utilizado na atividade */


export function App() {
  // const bra = cities.filter(cities=> cities.country = bra); console.log(bra) 
  return (
    <div className='App'>
      <React.Fragment>
        {
          cities.map(citie => {
            return(
              <ItemList key={citie.id} item={citie}/>
            )
          })

        }

       
      </React.Fragment>
    </div>
  )
}

