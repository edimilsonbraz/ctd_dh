import { useContext } from 'react'
import Card from '../../Components/Card'
import { DentistaContext } from '../../contexts/DentistaProvider'

import styles from './styles.modules.css'

const Home = () => {
  const { dentistas } = useContext(DentistaContext);

  return (
    <div className={styles.content}>
      <h1>Home</h1>
      <div className="card-grid container">
        {dentistas.map((dentista) => (
          <div key={dentista.matricula}>
            <Card dentista={dentista}/>
          </div>
        ))}
      </div>
    </div>
  )
}

export default Home
