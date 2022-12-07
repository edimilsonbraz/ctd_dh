import { BrowserRouter, Routes, Route, Navigate } from 'react-router-dom'

import Auth from './pages/Auth'
import Home from './pages/Home'
import Details from './pages/Details'
import Contact from './pages/Contact'
import NotFound from './pages/NotFound'
// import Navbar from './components/Navbar'
import { AuthContext, AuthProvider } from './providers/AuthContex'
import { useContext } from 'react'
import ProductsRouterTemplate from './templates/ProductsRouterTemplate'

const PrivateRoute = ({ children }) => {
  const { userData } = useContext(AuthContext)

  return userData.token ? children : <Navigate to="/" />
}

const App = () => (
  <BrowserRouter>
    <AuthProvider>
      {/* <Navbar /> */}
      <Routes>
        <Route path="/" element={<Auth />} />
        <Route path="/contact" element={<Contact />} />

        <Route path="/products" element={<ProductsRouterTemplate />} >
          <Route
            path=""
            element={
              <PrivateRoute>
                <Home />
              </PrivateRoute>
            }
          />

          <Route
            path=":id"
            element={
              <PrivateRoute>
                <Details />
              </PrivateRoute>
            }
          />
        </Route>
        <Route path="*" element={<NotFound />} />
      </Routes>
    </AuthProvider>
  </BrowserRouter>
)

export default App
