import { useEffect, useState } from 'react'
import { useNavigate , useParams } from 'react-router-dom'
import api from '../../services/api'

import './styles.css'

export function Details() {
  const { id } = useParams()
  const navigate = useNavigate()
  const [product, setProduct] = useState({})

  useEffect(() => {
    getProduct()
  }, [])

  async function getProduct() {
    try {
      const response = await api.get(`/products/${id}`)

      setProduct(response.data)
    } catch (error) {
      alert('Erro ao buscar produto' + error)
    }
  }

  function handleNavigate() {
    navigate(-1)
  }
  return (
    <>
      <h1>Detalhes do produto</h1>
      <div className="content-details">
        <h2>{product.name}</h2>
        <img src={product.image} alt="" />
        <p>Fabricante: {product.manufacturer}</p>
        <h4>Característica: </h4>
        <p>{product.description}</p>
        <h2>R$ {product.price}</h2>
        <button className='button' onClick={handleNavigate}>Voltar</button>
      </div>
    </>
  )
}
