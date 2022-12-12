import styles from './styles.module.css'
import { AiOutlineStar } from 'react-icons/ai'
import { useContext } from 'react'
import { PacienteContext } from '../../contexts/PacienteProvider'

const Card = (props) => {
  const { saveFavoritos } = useContext(PacienteContext)

  const { dentista } = props

  function favoritarCard() {
    //Fazer aqui um toggle para desfavoritar
    saveFavoritos({
      nome: dentista.nome,
      sobrenome: dentista.sobrenome,
      matricula: dentista.matricula
    })
  }

  return (
    <>
      {/* //Na linha seguinte deverá ser feito um teste se a aplicação
        // está em dark mode e deverá utilizar o css correto */}
      <div className={`card`}>
        <img
          className="card-img-top"
          src="/images/doctor.jpg"
          alt="doctor placeholder"
        />
        <div className={`card-body ${styles.CardBody}`}>
          <a href={`/dentist/${dentista.matricula}`}>
            <h5 className={`card-title ${styles.title}`}>{dentista.nome}</h5>
          </a>
          <p className={`card-title ${styles.title}`}>{dentista.sobrenome}</p>
          <button
            onClick={favoritarCard}
            className={`btn btn-light ${styles.button}`}
          >
            <AiOutlineStar />
            Favoritar
          </button>
        </div>
      </div>
    </>
  )
}

export default Card
