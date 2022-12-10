import { useEffect, useState } from 'react'
import { useParams } from 'react-router-dom';
import DetailCard from '../Components/DetailCard'
import api from '../services/api';

const Detail = () => {
  const { id } = useParams()
  const [dentista, setDentista] = useState({});

  useEffect(() => {
    getDentista();
  }, [])
 
  async function getDentista() {
    try {
      const response = await api.get(`/dentista?matricula=${id}`)
      setDentista(response.data)
    } catch (error) {
      console.log("Erro ao buscar dentista " + error)
    }
  }
  
  return (
    <>
      <DetailCard dentista={dentista}/>
    </>
  )
}

export default Detail
