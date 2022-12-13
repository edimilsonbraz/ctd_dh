import { useContext } from 'react'
import { DentistaContext } from '../../contexts/DentistaProvider'
import { themeContext } from '../../contexts/ThemeProvider'
import { Link, useNavigate } from 'react-router-dom'

import styles from './styles.module.css'

const Navbar = () => {
  const { theme, handleTheme } = useContext(themeContext)
  const { userToken, emptyToken } = useContext(DentistaContext)

  const navigate = useNavigate()

  function logout() {
    localStorage.removeItem('@DH_Odonto')
    emptyToken()
    navigate('/')
  }

  return (
    <header className="sticky-top">
      {/* //Na linha seguinte deverá ser feito um teste se a aplicação
        // está em dark mode e deverá utilizar navbar-dark bg-dark ou navbar-light bg-light*/}
      <nav
        className={`${theme} === 'light' ? 'bg-light' : 'bg-dark' navbar navbar-expand-sm navbar-light `}
        aria-label="Third navbar example"
      >
        <div className="container">
          <Link to="/home" className={`navbar-brand ${styles.navbarBrand}`}>
            DH Odonto
          </Link>
          <button
            className="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarsExample03"
            aria-controls="navbarsExample03"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span className="navbar-toggler-icon"></span>
          </button>

          <div
            className="collapse navbar-collapse justify-content-end"
            id="navbarsExample03"
          >
            <ul className="navbar-nav mb-2 mb-sm-0">
              <li className={`nav-item ${styles.navBarLink}`}>
                <Link to="/home" className="nav-link">
                  Home
                </Link>
              </li>
              <li className={`nav-item ${styles.navBarLink}`}>
                <Link to="/destacados" className="nav-link">
                  Fav
                </Link>
              </li>

              {/* 
                O botão de logout deverá ser testado darkmode
                se sim, btn-dark, se não, btn-light */}
              {userToken ? (
                <li
                  className={`nav-item ${styles.navBarLink}`}
                  onClick={logout}
                >
                  <button className={`btn btn-light ${styles.button}`}>
                    logout
                  </button>
                </li>
              ) : (
                <li className={`nav-item ${styles.navBarLink}`}>
                  <Link to="/login" className="nav-link">
                    Login
                  </Link>
                </li>
              )}

              <li className={`nav-item`}>
                {/* Ao ser clicado, esse botão mudará a aplicação para dark mode ou light mode.
                 Lembre-se de usar um estado no contexto para fazer essa alteração.
                 Na linha seguinte deverá ser feito um teste se a aplicação
                 está em dark mode e deverá utilizar o icone ☀ ou 🌙 e btn-dark ou btn-light*/}
                <button 
                  onClick={handleTheme}
                  className={`${theme} === ${'light'} ? ${'btn-light'} : ${'btn-dark'} btn  ${styles.btnStyle}`}>
                    {theme === "light" ? '🌙' : '☀' } 
                </button>
              </li>
            </ul>
          </div>
        </div>
      </nav>
    </header>
  )
}

export default Navbar
