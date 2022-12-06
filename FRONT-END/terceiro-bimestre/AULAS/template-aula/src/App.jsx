import { BrowserRouter, Routes, Route, Navigate } from 'react-router-dom'

import Auth from './pages/Auth'
import Home from './pages/Home'
import Details from './pages/Details'
import Contact from './pages/Contact'
import NotFound from './pages/NotFound'
import Navbar from './components/Navbar'
import { AuthContext, AuthProvider } from './providers/AuthContex'
import { useContext } from 'react'

const PrivateRoute = ({ children }) => {
  const {userData} = useContext(AuthContext)

  return userData.token ? children : <Navigate to="/" />
}

const App = () => (
  <AuthProvider>
    <BrowserRouter>
      <Navbar />
      <Routes>
        <Route path="/" element={<Auth />} />
        {/* <Route path="/home" element={<Home />} /> */}
        {/* <Route path="/details/:id" element={<Details />} /> */}
        <Route path="/contact" element={<Contact />} />
        <Route path="*" element={<NotFound />} />

        <Route
          path="/home"
          element={
            <PrivateRoute>
              <Home />
            </PrivateRoute>
          }
        />
      </Routes>
    </BrowserRouter>
  </AuthProvider>
)

export default App
