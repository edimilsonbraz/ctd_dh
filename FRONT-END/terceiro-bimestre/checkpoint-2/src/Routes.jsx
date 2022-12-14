import { Navigate, Route, Routes } from 'react-router-dom'
import { Destacados } from './pages/Destacados'
import { Contato } from './pages/Contato'
import Detail from './pages/Detail'
import Home from './pages/Home'
import LoginForm from './Components/LoginForm'
import { DentistaContext } from './contexts/DentistaProvider'
import { useContext } from 'react'
import { themeContext } from './contexts/ThemeProvider'

const PrivateRoute = ({ children }) => {
  const { userToken } = useContext(DentistaContext)

  return userToken ? children : <Navigate to="/" />
}

export function AppRoutes() {
  const { theme } = useContext(themeContext);
  return (
    <div className={theme === "light" ? `app light` : `app dark`}>
    <Routes>
      <Route path="/" element={<LoginForm />} />
      <Route
        path="/home"
        element={
          <PrivateRoute>
            <Home />
          </PrivateRoute>
        }
      />
      <Route
        path="/destacados"
        element={
          <PrivateRoute>
            <Destacados />
          </PrivateRoute>
        }
      />
      <Route path="/dentist/:id" element={<Detail />} />
      <Route path="/contato" element={<Contato />} />
      <Route path="/login" element={<LoginForm />} />
      <Route path="*" element={<h1>PAGE NOT FOUND</h1>} />
    </Routes>
</div>
  )
}
