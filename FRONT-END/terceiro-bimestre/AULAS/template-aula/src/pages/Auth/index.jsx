import { useContext, useState } from 'react'
import { useNavigate } from 'react-router-dom'
import { AuthContext } from '../../providers/AuthContex'
import api from '../../services/api'
import { FiEye, FiEyeOff } from 'react-icons/fi'

import styles from './styles.module.css'
import { ToastContainer, toast } from 'react-toastify';

const Auth = () => {
  const navigate = useNavigate()

  const { userData, fillUserDataState } = useContext(AuthContext)

  const [isVisible, setIsVisible] = useState(false)

  const [emailForm, setEmailForm] = useState('teste@teste.com')
  const [password, setPassword] = useState('abc123')

  function submitForm(event) {
    event.preventDefault()

    auth()

  }

  //validados os dados que vem do form
  async function auth() {
    try {
      const response = await api.post('/auth', {
        email: emailForm,
        password
      });
      navigate("/products")

      fillUserDataState({
        name: response.data.name,
        token: response.data.token,
        user: response.data.user
      })
    } catch (error) {
      toast('Erro ao autenticar: ', {type: "error"})
    }
  }

  function handleVisible() {
    setIsVisible(!isVisible)
  }

  return (
    <div className={styles.container}>
      <div className={styles.card}>
        <h1>Login {userData.token}</h1>

        <p>Entre com seus dados corretamente para acessar o sistema</p>

        <form onSubmit={submitForm}>
          <input
            value={emailForm}
            onChange={(event) => setEmailForm(event.target.value)}
            placeholder="Digite seu e-mail"
            type="email"
          />

          <div className={styles.container_input}>
            <input
              type={isVisible ? "text" : "password"}
              value={password}
              onChange={(event) => setPassword(event.target.value)}
              placeholder="Digite sua senha"
              className={styles.second}
            />
            <div className={styles.icon} onClick={handleVisible}>
              {isVisible ? <FiEye /> : <FiEyeOff/>
              }
              
            </div>
          </div>
          <button className={styles.button}>Salvar</button>
        </form>
      </div>
      <ToastContainer />
    </div>
  )
}

export default Auth
