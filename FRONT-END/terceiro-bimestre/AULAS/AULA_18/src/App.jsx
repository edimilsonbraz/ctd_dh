import { BrowserRouter, Route, Routes } from "react-router-dom"
import { Details } from "./pages/Details"
import { Home } from "./pages/Home"

import './styles.css'

function App() {
  return (
    <BrowserRouter>
    <Routes>
      <Route path="/" element={<Home />}/>
      <Route path="/details/:id" element={<Details />}/>
      <Route path="*" element={<h1>PAGE NOT FOUND</h1>}/>
    </Routes>
    </BrowserRouter> 
  )
  
}

export default App
