import './styles.css'

export function Card({ nomeCor, cor }) {
  return (
    <div className="Card" style={{ background: cor }}>
      <p>{nomeCor}</p>
      <h2>{cor}</h2>
    </div>
  )
}
