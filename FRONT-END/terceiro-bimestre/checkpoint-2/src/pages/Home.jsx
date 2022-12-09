import { useContext } from 'react'
import Card from '../Components/Card'
import { DentistaContext } from '../contexts/DentistaProvider'

const Home = () => {
  const { dentistas } = useContext(DentistaContext)

  return (
    <>
      <h1>Home</h1>
      <div className="card-grid container">
        {dentistas.map((dentista) => (
          <div key={dentista.matricula}>
            <Card dentista={dentista}/>
          </div>
        ))}
      </div>
    </>
  )
}

export default Home
