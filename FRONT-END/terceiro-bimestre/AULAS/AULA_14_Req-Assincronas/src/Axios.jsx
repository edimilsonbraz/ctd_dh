import axios from "axios";
import { useEffect, useState } from "react";

export function Axios() {
  const [res, setRes] = useState([])

  async function getDataByServer() {

    try {
      const response = await axios.get('https://jsonplaceholder.typicode.com/posts')
      console.log(response.data)
    } catch (error) {
      console.log("Houve um erro na solicitação!")
    }
  }

  useEffect(() => {
    getDataByServer();
  },[]);

  async function newUser() {
    await axios("")
  }

  return ( 
    <div>

    </div>
   );
}
