import axios from 'axios'
import { useEffect, useState } from 'react'

import './styles.css'
//API => http://127.0.0.1:5173/api/products

export function App() {
  const [products, setProducts] = useState([{}])
  const [idProduct, setIdProduct] = useState("")
  const [loading, setLoading] = useState(true)
  const [formData, setFormData] = useState({
    title: '',
    description: '',
    price: '',
    stock: '',
    category: '',
    image: ''
  })

  useEffect(() => {
    getAllProducts()
  }, [])

  //All produtos
  async function getAllProducts() {
    try {
      const response = await axios.get('http://127.0.0.1:5173/api/products')

      setProducts(response.data.products)

      setLoading(false)
    } catch (error) {
      alert('Erro ao buscar produtos! ' + error)
    }
  }

  //Cria produto
  async function createProduct() {
    try {
      const newProduct = await axios.post('http://127.0.0.1:5173/api/products', {
        title: formData.title,
        description: formData.description,
        price: formData.price,
        stock: formData.stock,
        category: formData.category,
        image: formData.image,
      })

      setProducts([...products, newProduct])

      clear()

      getAllProducts()

    } catch (error) {
      alert('Erro ao cadastrar produto! ' + error)
    }
  }

  //Editar produto
  async function editProduct(product) {
    try {
      setFormData({
        title: product.title,
        description: product.description,
        price: product.price,
        stock: product.stock,
        category: product.category,
        image: product.image
      })

      setIdProduct(product.id)
    }catch(error){
      alert("Erro ao editar produto! " + error)
    }
  }

  //Atualizar produto
  async function updateProduct() {
    try {
      await axios.put(`http://127.0.0.1:5173/api/products/${idProduct}`, {
        title: formData.title,
        description: formData.description,
        price: formData.price,
        stock: formData.stock,
        category: formData.category,
        image: formData.image
      })

      alert("Usuário atualizado com sucesso!")

      clear()

      getAllProducts()
    } catch (error) {
      alert("Erro ao atualizar produto: " + error)
    }
  }

  async function deleteProduct(idProduct) {
    try {
      alert("Deletando um produto: " + idProduct)
      await axios.delete(`http://127.0.0.1:5173/api/products/${idProduct}`)
      
      getAllProducts()

    }catch (error) {
      alert("Erro ao deletar produto: " + error)
    }

  }

  function clear() {
    setFormData({
      title: "",
      description: "",
      price: "",
      stock: "",
      category: "",
      image: ""
    })
  }

  function submitForm() {
    
    if(formData.title || formData.image || formData.price !== "") {
      if(idProduct) {
        updateProduct()
      }else{
        createProduct()
      }
    }else{
      alert("Preencha os campos solicitados")
    }
  }

  return (
    <div className="container">
      <div className="form-data">
        <form>
          <div>
            <input
              placeholder="Nome do produto"
              value={formData.title}
              onChange={(event) =>
                setFormData({ ...formData, title: event.target.value })
              }
            />
            <input
              placeholder="Descrição do produto"
              value={formData.description}
              onChange={(event) =>
                setFormData({ ...formData, description: event.target.value })
              }
            />
            <input
              placeholder="preço do produto"
              value={formData.price}
              onChange={(event) =>
                setFormData({ ...formData, price: event.target.value })
              }
            />
          </div>
          <div>
            <input
              placeholder="Qtd em estoque"
              type="number"
              value={formData.stock}
              onChange={(event) =>
                setFormData({ ...formData, stock: event.target.value })
              }
            />
            <input
              placeholder="Categoria"
              value={formData.category}
              onChange={(event) =>
                setFormData({ ...formData, category: event.target.value })
              }
            />
            <input
              placeholder="url da imagem"
              value={formData.image}
              onChange={(event) =>
                setFormData({ ...formData, image: event.target.value })
              }
            />
          </div>
          <button type="button" onClick={submitForm}>
            Salvar
          </button>
        </form>
      </div>
      <h1>Produtos</h1>
      <ul>
        {loading ? (
          <h1>Carregando...</h1>
        ) : (
          products.map((product) => (
            <li key={product.id}>
              <img src={product.image} width="100" alt="" />
              <h2>{product.title}</h2>
              <p>Valor R${product.price}</p>
              <button type="button" onClick={() => editProduct(product)}>Editar</button>
              <button type="button"onClick={() => deleteProduct(product.id)}>Excluir</button>
            </li>
          ))
        )}
      </ul>
    </div>
  )
}
