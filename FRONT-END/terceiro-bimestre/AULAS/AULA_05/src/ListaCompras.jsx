const items = [
  {
    id: 1,
    name: "Coca Cola"
  },
  {
    id: 2,
    name: "Coxinha"
  },
  {
    id: 3,
    name: "Pizza"
  },
  {
    id: 4,
    name: "Pão"
  }
]

export function ListaCompras() {

  return ( 
    <ul>
      {
        items.map(item => {
          return(
            <li key={item.id}>{item.name}</li>
          )
        })
      }
    </ul>
   );
}
