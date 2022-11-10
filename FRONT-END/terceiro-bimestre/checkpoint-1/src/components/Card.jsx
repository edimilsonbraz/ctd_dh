import './styles.css'

export function Card({ nome, cor }) {
  return (
    <div className="Card" style={{ background: cor }}>
      <p>{nome}</p>
      <h2>{cor}</h2>
    </div>
  )
}
