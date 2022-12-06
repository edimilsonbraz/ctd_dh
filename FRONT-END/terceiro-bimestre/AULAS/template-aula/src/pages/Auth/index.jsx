import { useContext, useState } from 'react'
import { useNavigate } from 'react-router-dom'
import { AuthContext } from '../../providers/AuthContex'
import api from '../../services/api'

import styles from './styles.module.css'

const Auth = () => {
  const navigate = useNavigate()

  const { userData, fillUserDataState } = useContext(AuthContext)

  const [emailForm, setEmailForm] = useState('')
  const [password, setPassword] = useState('')

  function submitForm(event) {
    event.preventDefault()

    auth()

    navigate('/home')
  }

  //validados os dados que vem do form
  async function auth() {
    try {
      const response = await api.post('/auth', {
        email: emailForm,
        password
      })

      fillUserDataState({
        name: response.data.name,
        token: response.data,
        user: response.data.user
      })

    } catch (error) {
      alert('Erro ao autenticar: ' + error)
    }
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
          <input
            value={password}
            onChange={(event) => setPassword(event.target.value)}
            placeholder="Digite sua senha"
          />

          <button className={styles.button}>Salvar</button>
        </form>
      </div>
    </div>
  )
}

export default Auth
