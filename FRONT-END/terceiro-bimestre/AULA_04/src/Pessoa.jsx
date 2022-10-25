export function Pessoa({nome, idade, peso}) {

  if(peso) {
    <>
      <h2>{idade}</h2>
      <h3>{idade >= 18 ? "Maior de idade" : "Menor de idade"}</h3>
    </>
  }else{
    return(
      <>
      </>
    )
  }
  return ( 
    <>
      <h1>{nome}</h1>
      <h2>{idade}</h2>
    </>
   );
}

