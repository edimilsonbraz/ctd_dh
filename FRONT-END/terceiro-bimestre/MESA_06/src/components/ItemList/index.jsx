import styles from './styles.modules.css'

export function ItemList({item}) {
  const { country, city, population, color } = item;

  if(country === "BRA") {
    <>
      <h2>{country}</h2>
      <p><span>Cidade: {city} </span></p>
      <p><span>População: {population} </span></p>
      <p><span>Cor: {color} </span></p>
    </>
  }else {
    return(
      <>
      </>
    )
  }
  
  return (
    <ul style={{ background: color }}>
      <li>
        <h2>{country}</h2>
        <p><span>Cidade: {city} </span></p>
        <p><span>População: {population} </span></p>
        <p><span>Cor: {color} </span></p>
      </li>
    </ul> 
  );
}

