import { BrowserRouter, Navigate, Route, Routes } from 'react-router-dom'
import { Contato } from './pages/Contato'
import Detail from './pages/Detail'
import Home from './pages/Home'
import Navbar from './Components/Navbar/index.jsx'
import Footer from './Components/Footer'
import LoginForm from './Components/LoginForm'
import { DentistaContext, DentistaProvider } from './contexts/DentistaProvider'
import { Destacados } from './pages/Destacados'
import { PacienteProvider } from './contexts/PacienteProvider'
import { useContext } from 'react'

const PrivateRoute = ({ children }) => {
  const { userToken } = useContext(DentistaContext)

  return userToken ? children : <Navigate to="/" />
}


export function AppRoutes() {
  return (
    <BrowserRouter>
      <DentistaProvider>
        <PacienteProvider>
          <Navbar />
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
            {/* <Route path="/destacados" element={<Destacados />} /> */}
            <Route path="/contato" element={<Contato />} />
            <Route path="/login" element={<LoginForm />} />
            <Route path="*" element={<h1>PAGE NOT FOUND</h1>} />
          </Routes>
          <Footer />
        </PacienteProvider>
      </DentistaProvider>
    </BrowserRouter>
  )
}

