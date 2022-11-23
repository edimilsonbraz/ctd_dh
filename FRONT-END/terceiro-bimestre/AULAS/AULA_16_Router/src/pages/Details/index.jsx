import { Link, useParams } from "react-router-dom";

export function Details() {
  const {idProduct} = useParams();

  return ( 
    <>
      <Link to="/" >Ir para Home</Link>
      <div>
        <h1>Hello Details page</h1>
        <h2>{idProduct}</h2>
      </div>
    </>
   );
}

