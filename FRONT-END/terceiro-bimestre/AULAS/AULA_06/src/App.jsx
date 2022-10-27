import { ItemList } from './components/ItemList'


import { carros } from './mock/carros'

export function App() {
  return (
    <ul>
      {carros.map((carro) => (
        <ItemList key={`list-item-${carro.id}`} item={carro} />
      ))}
    </ul>
  )
}
