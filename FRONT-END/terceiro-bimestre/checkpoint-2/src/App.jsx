import { BrowserRouter, Route, Routes } from 'react-router-dom'
import Card from './Components/Card'
import { Contato } from './pages/Contato'
import Detail from './pages/Detail'
import Home from './pages/Home'
import Navbar from './Components/Navbar.jsx'
import Footer from './Components/Footer'

export function App() {
  return (
    // <>
    //   {/* //Na linha seguinte deverá ser feito um teste se a aplicação
    //     // está em dark mode e deverá utilizar a classe dark ou light */}
    //   <div className={`app light}`}>
    //     <Navbar />
    //     <main>
    //       <Outlet />
    //     </main>
    //     <Footer />
    //   </div>
    // </>
    <BrowserRouter>
      <Navbar />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/dentist/:id" element={<Detail />} />
        <Route path="/contato" element={<Contato />} />
        <Route path="/destacados" element={<Card />} />
      </Routes>
      <Footer />
    </BrowserRouter>
  )
}
