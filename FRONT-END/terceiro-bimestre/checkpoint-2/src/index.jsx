import React from 'react'
import ReactDOM from 'react-dom/client'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap/dist/js/bootstrap.min.js'
import { ThemeProvider } from './contexts/ThemeProvider'
import { BrowserRouter } from 'react-router-dom'
import { DentistaProvider } from './contexts/DentistaProvider'
import { PacienteProvider } from './contexts/PacienteProvider'
import Navbar from './Components/Navbar'
import Footer from './Components/Footer'
import { AppRoutes } from './Routes'

import './index.css'
import 'react-toastify/dist/ReactToastify.css';

const root = ReactDOM.createRoot(document.getElementById('root'))

root.render(
  <React.StrictMode>
    <ThemeProvider>
      <BrowserRouter>
        <DentistaProvider>
          <PacienteProvider>
            <Navbar />
              <AppRoutes />
            <Footer />
          </PacienteProvider>
        </DentistaProvider>
      </BrowserRouter>
    </ThemeProvider>
  </React.StrictMode>
)
