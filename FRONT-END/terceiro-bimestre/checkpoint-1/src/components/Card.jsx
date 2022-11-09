import styles from './styles.css'

export function Card({ nome, cor }) {
  return (
    <div className="Card">
      <p>{nome}</p>
      <h2>{cor}</h2>
    </div>
  )
}
