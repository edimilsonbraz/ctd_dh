import styles from './styles.modules.css'

export function ItemList({ item }) {
  const { marca, modelo, descricao, cor, img } = item

  return (
    <li className={styles.item_list} style={{ background: cor }}>
      <h2>{modelo}</h2>
      <h3>{marca}</h3>
      <p>{descricao}</p>
      <img src={img} width={100} />
    </li>
  )
}
