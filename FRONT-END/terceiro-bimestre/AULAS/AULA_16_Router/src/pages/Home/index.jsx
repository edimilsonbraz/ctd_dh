import { Link } from 'react-router-dom'

export function Home() {
  return (
    <div>
      <Link to="/contact">Ir para Contact</Link> <br />
      <Link to="/details/10">Ir para Details</Link>
      <h1>Hello Home page</h1>
    </div>
  )
}
