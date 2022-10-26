import { Container } from './Container'
import { ListaCompras } from './ListaCompras'

export function App() {
  return (
    <>
      <h1>Hello!!!</h1>

      <Container>
        <h1>Container 1</h1>
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit.</p>
      </Container>

      <ListaCompras />
    </>
  )
}
