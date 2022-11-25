import './styles.css'

import { Link } from 'react-router-dom'

function NavBar() {
  return (
    <nav>
      <div className="navbar">
        <h2>Beer</h2>
        <ul>
          <li>
            <Link to="/">Home</Link>
          </li>
          <li>
            <Link to="/contact">Contato</Link>
          </li>
        </ul>
      </div>
    </nav>
  )
}

export default NavBar
