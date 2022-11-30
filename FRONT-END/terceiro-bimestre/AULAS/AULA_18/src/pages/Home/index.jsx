import { useEffect, useState } from 'react'
import { Link } from 'react-router-dom'
import api from '../../services/api'

import './styles.css'

export function Home() {
  const [products, setProducts] = useState([])
  const [idProduct, setIdProduct] = useState("")
  const [loanding, setLoanding] = useState(true)
  const [formData, setFormData] = useState({
    name: '',
    description: '',
    price: '',
    manufacturer: '',
    image: ''
  })

  useEffect(() => {
    getProducts()
  }, [])

  async function getProducts() {
    try {
      const response = await api.get('/products')

      setProducts(response.data)

      setLoanding(false)
    } catch (error) {
      alert('Erro ao buscar produtos' + error)
    }
  }

  async function newProduct() {
    const { name, description, price, manufacturer, image } = formData

    try {
      await api.post('/products', {
        name,
        description,
        price,
        manufacturer,
        image
      })

      getProducts()
      empty()
      alert("Produto cadastrado com sucesso!")
    } catch (error) {
      alert('Não foi possivel cadastrar o produto' + error)
    }
  }

  function editProduct(product) {
    setFormData({
      name: product.name,
      description: product.description,
      price: product.price,
      manufacturer: product.manufacturer,
      image: product.image
    })
    setIdProduct(product._id)
   
  }

  async function updateProduct() {
    try {
      await api.put(`products/${idProduct}`, {
        name: formData.name,
        description: formData.description,
        price: formData.price,
        manufacturer: formData.manufacturer,
        image: formData.image
      })

      alert("Produto atualizado com sucesso!")

      getProducts()

      empty()
    } catch (error) {
      alert("Erro ao editar produto" + error)
    }
  }

  async function deleteProduct(idProduct) {
    try {
      await api.delete(`/products/${idProduct}`)

      alert("Produto deletado com sucesso!")

      getProducts()

    } catch (error) {
      alert("Erro ao deletar produto" + error)
    }
  }

  function empty() {
    setFormData({
      name: '',
      description: '',
      price: '',
      manufacturer: '',
      image: ''
    })
  }

  function submitForm() {
    
    if(formData.name || formData.image || formData.price !== "") {
      if(idProduct) {
        updateProduct()
      }else{
        newProduct()
      }
    }else{
      alert("Preencha os campos solicitados")
    }
  }

  return (
    <div className="container">
      <form>
        <h2>Cadastrar Produto</h2>
        <input
          placeholder="Nome"
          value={formData.name}
          onChange={(event) =>
            setFormData({ ...formData, name: event.target.value })
          }
        />
        <input
          placeholder="Preço"
          value={formData.price}
          onChange={(event) =>
            setFormData({ ...formData, price: event.target.value })
          }
        />
        <input
          placeholder="Fabricante"
          value={formData.manufacturer}
          onChange={(event) =>
            setFormData({ ...formData, manufacturer: event.target.value })
          }
        />
        <input
          placeholder="Image"
          value={formData.image}
          onChange={(event) =>
            setFormData({ ...formData, image: event.target.value })
          }
        />
        <textarea
          placeholder="Descrição"
          value={formData.description}
          onChange={(event) =>
            setFormData({ ...formData, description: event.target.value })
          }
        />
        <button type="button" onClick={submitForm}>
          Salvar
        </button>
      </form>

      <div className="products">
        <h1>Produtos</h1>
        <div className="content">
          {loanding ? (
            <h1>Carregando...</h1>
          ) : (
            products.map((product) => (
              <div className="container-item" key={product._id}>
                <Link to={`/details/${product._id}`} >
                  <img src={product.image} alt="" />
                  <h3>{product.name}</h3>
                  <p>R$ {product.price}</p>
                </Link>
                <div className="buttons">
                  <button onClick={() => editProduct(product)}>editar</button>
                  <button onClick={() => deleteProduct(product._id)}>excluir</button>
                </div>
              </div>
            ))
          )}
        </div>
      </div>
    </div>
  )
}
