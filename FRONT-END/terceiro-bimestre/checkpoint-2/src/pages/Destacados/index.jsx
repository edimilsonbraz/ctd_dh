import { useContext } from 'react'
import Card from '../../Components/Card'
import { PacienteContext } from '../../contexts/PacienteProvider'

export function Destacados() {
  const {userData, emptyUserData} = useContext(PacienteContext);

  function clearFavorite() {
    localStorage.removeItem('@DH_Favoritos')
    emptyUserData()
  }
 
  return (
    <ul>
      <h1>Dentista favoritos</h1>
      <button onClick={clearFavorite}>desfavoritar</button>
      {userData ? (
        <li>
          <div className="card-grid container">
            <Card dentista={userData} />
          </div>
        </li>
      ) : (
        <li>
          <h1> Nenhum favorito por aqui...</h1>
        </li>
      )}
    </ul>
  )
}
