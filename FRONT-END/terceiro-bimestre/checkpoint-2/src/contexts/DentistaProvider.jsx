import React, { createContext, useState } from 'react'
import api from '../services/api';

export const DentistaContext = createContext();

export function DentistaProvider({children}) {
  const [dentistas, setDentistas] = useState([]);

  async function getDentistas() {
    try {
      const response = await api.get('/dentista')

      console.log(response.data)
      setDentistas(response.data)
    } catch (error) {
      alert("Erro ao buscar dentistas " + error)
    }
  } 
  return (
    <DentistaContext.Provider value={{dentistas, getDentistas}}>
      {children}
    </DentistaContext.Provider>
  )
}

