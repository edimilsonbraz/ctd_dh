import React, { createContext, useEffect, useState } from 'react'
import api from '../services/api';

export const PacienteContext = createContext();

export function PacienteProvider({children}) {
  const [pacientes, setPacientes] = useState([]);

  useEffect(() => {
    getAllPacientes();
  }, [])

  async function getAllPacientes() {
    try {
      const response = await api.get('/paciente')
      setPacientes(response.data.body)
    } catch (error) {
      alert("Erro ao buscar dentistas " + error)
    }
  } 

  return (
    <PacienteContext.Provider value={{pacientes, getAllPacientes}}>
      {children}
    </PacienteContext.Provider>
  )
}

