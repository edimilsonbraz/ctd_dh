import { useContext, useState } from 'react'
import api from '../../services/api'
import { DentistaContext } from '../../contexts/DentistaProvider'
import { themeContext } from '../../contexts/ThemeProvider'
import { useNavigate } from 'react-router-dom'
import { ToastContainer, toast } from 'react-toastify';
import { FaUserAlt } from 'react-icons/fa'

import styles from './styles.module.css'

const LoginForm = () => {
  const { theme } = useContext(themeContext);
  const {saveToken} = useContext(DentistaContext);
  const navigate = useNavigate();

  const [user, setUser] = useState('dentistaAdmin')
  const [password, setPassword] = useState('admin123')

  const handleSubmit = (e) => {
    e.preventDefault()

    auth()
  }

  async function auth() {
    try {
      const response = await api.post('/auth', {
        "username": user,
        "password": password
      })
      
      saveToken(response.data.token)

      toast('Bem-vindo a DH Odonto! ', {type: "success", autoClose: 2000})

      setTimeout(() => {
        navigate("/home")

      }, 3000)

    } catch (error) {
      
      toast('Erro ao autenticar: ', {type: "error", autoClose: 2000})
    }
  }

  return (
    <>
      {/* //Na linha seguinte deverá ser feito um teste se a aplicação
        // está em dark mode e deverá utilizar o css correto */}
      <div className={theme === "light"
            ? `text-center card container ${styles.card}`
            : `text-center card container dark ${styles.card} ${styles.cardDark}`}>
        <div className={`card-body ${styles.CardBody}`}>
          <h1>
            <FaUserAlt />
            Login
          </h1>
          <form onSubmit={handleSubmit}>
            <input
              className={`form-control ${styles.inputSpacing}`}
              value={user}
              onChange={(event) => setUser(event.target.value)}
              placeholder="digite o usuario"
              name="login"
              required
            />
            <input
              className={`form-control ${styles.inputSpacing}`}
              value={password}
              onChange={(event) => setPassword(event.target.value)}
              placeholder="senha"
              name="password"
              type="password"
              required
            />
            <button className=" btn btn-primary" type="submit">
              Enviar
            </button>
          </form>
        </div>
      </div>
      <ToastContainer />
    </>
  )
}

export default LoginForm
