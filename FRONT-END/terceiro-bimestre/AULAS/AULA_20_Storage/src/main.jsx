import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App'
import { UserContextProvider } from './contexts/Context'
import './index.css'

ReactDOM.createRoot(document.getElementById('root')).render(
//Envolvemos a nossa aplicação no provedor, para podermos, depois, usar o contexto nos nossos componentes
  <React.StrictMode>
    <UserContextProvider>
      <App />
    </UserContextProvider>
  </React.StrictMode>
)
