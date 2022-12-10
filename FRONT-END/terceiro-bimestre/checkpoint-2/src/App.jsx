import { BrowserRouter, Route, Routes } from 'react-router-dom'
import { Contato } from './pages/Contato'
import Detail from './pages/Detail'
import Home from './pages/Home'
import Navbar from './Components/Navbar/index.jsx'
import Footer from './Components/Footer'
import LoginForm from './Components/LoginForm'
import { DentistaProvider } from './contexts/DentistaProvider'
import { Destacados } from './pages/Destacados'
import { PacienteProvider } from './contexts/PacienteProvider'

export function App() {
  return (
    <DentistaProvider>
      <PacienteProvider>
        <BrowserRouter>
          <Navbar />
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/home" element={<Home />} />
            <Route path="/dentist/:id" element={<Detail />} />
            <Route path="/contato" element={<Contato />} />
            <Route path="/login" element={<LoginForm />} />
            <Route path="/destacados" element={<Destacados />} />
            <Route path="*" element={<h1>PAGE NOT FOUND</h1>} />
          </Routes>
          <Footer />
        </BrowserRouter>
      </PacienteProvider>
    </DentistaProvider>
  )
}
