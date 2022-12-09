import React, { createContext, useEffect, useState } from 'react'
import api from '../services/api';
import { useParams } from 'react-router-dom'

export const DentistaContext = createContext();

export function DentistaProvider({children}) {
  const { id } = useParams()
  const [dentistas, setDentistas] = useState([]);
  const [dentista, setDentista] = useState({});

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

  useEffect(() => {
    // getDentista();
    //Nesse useEffect, você vai fazer um fetch na api passando o
    //id do dentista que está vindo do react-router e carregar os dados em algum estado
  }, [])

  async function getDentista() {
    try {
      const response = await api.get(`/dentista/${id}`)
      console.log(response)
      setDentista(response.data)
    } catch (error) {
      console.log("Erro ao buscar dentista " + error)
    }
  }

  return (
    <DentistaContext.Provider value={{dentistas, dentista, getAllDentistas, getDentista}}>
      {children}
    </DentistaContext.Provider>
  )
}

