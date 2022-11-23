import { Route, Routes } from "react-router-dom";
import { Contact } from "./pages/Contact";
import { Details } from "./pages/Details";
import { Home } from "./pages/Home";

export function Router() {
  return ( 
    <Routes>
      <Route path="/" element={<Home />}/>
      <Route path="/contact" element={<Contact />}/>
      <Route path="/details/:idProduct" element={<Details />}/>
    </Routes>
   );
}

