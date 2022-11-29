import { BrowserRouter, Route, Routes } from "react-router-dom"
import { Details } from "./pages/Details"
import { Home } from "./pages/Home"

function App() {
  return (
    <BrowserRouter>
    <Routes>
      <Route path="/" element={<Home />}/>
      <Route path="/details" element={<Details />}/>
      <Route path="*" element={<h1>NOT FOUND</h1>}/>
    </Routes>
    </BrowserRouter> 
  )
  
}

export default App
