import { useContext } from 'react'
import Card from '../../Components/Card'
import { PacienteContext } from '../../contexts/PacienteProvider'

import styles from './styles.module.css'

export function Destacados() {
  const {userData, emptyUserData} = useContext(PacienteContext);

  function clearFavorite() {
    localStorage.removeItem('@DH_Favoritos')
    emptyUserData()
  }
 
  return (
    <ul className={`lista ${styles.lista}`}>
      <h1>Dentista favoritos</h1>
      <button onClick={clearFavorite}>desfavoritar</button>
      {userData.nome !== "" || userData.sobrenome !== "" ? (
        <li >
          <div className="card-grid container">
            <Card dentista={userData} />
          </div>
        </li>
      ) : (
        <li>
          <h1> Nenhum favorito ainda...</h1>
        </li>
      )}
    </ul>
  )
}
