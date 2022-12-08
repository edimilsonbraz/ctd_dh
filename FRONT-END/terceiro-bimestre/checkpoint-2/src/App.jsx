import { BrowserRouter, Route, Routes } from 'react-router-dom'
import Card from './Components/Card'
import { Contato } from './pages/Contato'
import Detail from './pages/Detail'
import Home from './pages/Home'
import Navbar from './Components/Navbar/index.jsx'
import Footer from './Components/Footer'
import { DentistaProvider } from './contexts/DentistaProvider'

export function App() {
  return (
    <DentistaProvider>
      <BrowserRouter>
        <Navbar />
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/home" element={<Home />} />
          <Route path="/dentist/:id" element={<Detail />} />
          <Route path="/contato" element={<Contato />} />
          <Route path="/destacados" element={<Card />} />
        </Routes>
        <Footer />
      </BrowserRouter>
    </DentistaProvider>
  )
}
