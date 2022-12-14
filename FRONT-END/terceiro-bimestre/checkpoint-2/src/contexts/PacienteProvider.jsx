import React, { createContext, useEffect, useState } from 'react'
import api from '../services/api'

export const PacienteContext = createContext()

export function PacienteProvider({ children }) {
  const [userData, setUserData] = useState({})
  const [pacientes, setPacientes] = useState([])

  useEffect(() => {
    getAllPacientes()
  }, [])

  async function getAllPacientes() {
    try {
      const response = await api.get('/paciente')
      setPacientes(response.data.body)
    } catch (error) {
      alert('Erro ao buscar dentistas ' + error)
    }
  }

  function saveFavoritos({ nome, sobrenome, matricula }) {
    //Salvando card em localStorage
    localStorage.setItem(
      '@DH_Favoritos',
      JSON.stringify({ nome, sobrenome, matricula })
    )

    setUserData({ ...userData, nome, sobrenome, matricula })
  }

  function emptyUserData() {
    alert("Foi desfavoritado")
    setUserData({nome:"", sobrenome:"", matricula: ""})
  }

  useEffect(() => {
    const response = localStorage.getItem('@DH_Favoritos')

    let data

    if (response) {
      data = JSON.parse(response)

     setUserData({
        nome: data.nome,
        sobrenome: data.sobrenome,
        matricula: data.matricula
      })
    }
  }, [])

  return (
    <PacienteContext.Provider
      value={{ pacientes, getAllPacientes, userData, saveFavoritos, emptyUserData }}
    >
      {children}
    </PacienteContext.Provider>
  )
}
