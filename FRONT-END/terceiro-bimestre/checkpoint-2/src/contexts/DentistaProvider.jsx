import React, { createContext, useEffect, useState } from 'react'
import api from '../services/api';

export const DentistaContext = createContext();

export function DentistaProvider({children}) {
  const [dentistas, setDentistas] = useState([]);

  useEffect(() => {
    getAllDentistas();
  }, [])

  async function getAllDentistas() {
    try {
      const response = await api.get('/dentista')
      setDentistas(response.data)
    } catch (error) {
      alert("Erro ao buscar dentistas " + error)
    }
  } 

  return (
    <DentistaContext.Provider value={{dentistas, getAllDentistas,}}>
      {children}
    </DentistaContext.Provider>
  )
}

