import React, { createContext, useEffect, useState } from 'react'
import { useLocation, useNavigate } from 'react-router-dom'
import api from '../services/api'

export const DentistaContext = createContext()

export function DentistaProvider({ children }) {
  const [dentistas, setDentistas] = useState([])
  const [userToken, setUserToken] = useState('')

  const navigate = useNavigate();
  const location = useLocation();


  useEffect(() => {
    getAllDentistas()
  }, [])

  async function getAllDentistas() {
    try {
      const response = await api.get('/dentista')
      setDentistas(response.data)
    } catch (error) {
      alert('Erro ao buscar dentistas ' + error)
    }
  }

  function saveToken(token) {
    //Salvando em localStorage
    localStorage.setItem('@DH_Odonto', JSON.stringify(token))

    setUserToken(token)
  }

  function emptyToken() {
    setUserToken('')
  }

  useEffect(() => {
    const response = localStorage.getItem("@DH_Odonto");

    let token;

    if (response) {
      token = JSON.parse(response)

      saveToken(token); 

      navigate(location?.pathname);
    }
  }, []);

  return (
    <DentistaContext.Provider
      value={{
        dentistas,
        getAllDentistas,
        userToken,
        saveToken,
        emptyToken
      }}
    >
      {children}
    </DentistaContext.Provider>
  )
}
