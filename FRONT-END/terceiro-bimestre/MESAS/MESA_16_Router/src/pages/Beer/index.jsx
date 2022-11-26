import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'

import "./styles.css"

//Esta página irá renderizar cada bebida individualmente

function Beer() {
  const [beer, setBeer] = useState([])

  const navigate = useNavigate()
  const { id } = useParams()

  useEffect(() => {
    getBeer()
  })

  const getBeer = async () => {
    //Você deve completar esta busca com o parâmetro necessário
    const res = await fetch(`https://api.punkapi.com/v2/beers/${id}`)
    const data = await res.json()
    setBeer(data[0])
  }
  

  function handleNavigate() {
    navigate(-1)
  }

  return (
    <div>
      <h2 className='title'>Cerveja número: {id}</h2>
      <div className="card">
        <img src={beer.image_url} alt="beer-detail" />
        <p>{beer.tagline}</p>
        <p>{beer.description}</p>
        <p>{beer.brewers_tips} </p>
      </div>
      <button
        onClick={handleNavigate}>
        Voltar
      </button>
    </div>
  )
}

export default Beer
