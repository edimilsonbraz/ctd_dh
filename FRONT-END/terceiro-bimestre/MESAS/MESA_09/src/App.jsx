import { useState } from 'react';
import './styles.css'


function App() {
  // const [selectValue, setSelectValue] = useState(1);  

  const [selectValue, setSelectValue] = useState(''); 
  const [qtdAlunosBd, setQtdAlunosBd] = useState(0);
  const [qtdAlunosBe, setQtdAlunosBe] = useState(0);
  const [qtdAlunosFe, setQtdAlunosFe] = useState(0);

  function handleSubmit(event) {
    event.preventDefault()

    if(selectValue === "database") {
      setQtdAlunosBd(qtdAlunosBd + 1);
    }else if(selectValue === "frontend"){
      setQtdAlunosFe(qtdAlunosFe + 1);
    }else if(selectValue === "backend") {
      setQtdAlunosBe(qtdAlunosBe + 1)
    }else{
      alert("A disciplina selecionada não é válida")
    }
   

  }

  return (
    <div className="container">
      <h1>Média de Alunos por Disciplina</h1>
      <form className="form" onSubmit={handleSubmit}>
        <div className="container_input">
          <select onChange={e => setSelectValue(e.target.value)}>
            <option selected disabled>
              Selecione uma disciplina
            </option>
            <option 
              value="database"
              >Banco de Dados
            </option>
            <option value="backend">Desenvolvimento Backend</option>
            <option value="frontend">Desenvolvimento Frontend</option>
            <option value="devops">Devops</option>
          </select>
          <input />
        </div>
        <input type="submit" value="Salvar" />
      </form>

      <div className="container">
        <table border="1" className="line_title">
          <thead>
            <tr>
              <th>Disciplina</th>
              <th>Quantidade de Alunos</th>
              <th>Média das notas dos alunos</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>Banco de Dados</td>
              <td>{qtdAlunosBd}</td>
              <td>0</td>
            </tr>

            <tr>
              <td>Desenvolvimento Frontend</td>
              <td>{qtdAlunosFe}</td>
              <td>0</td>
            </tr>

            <tr>
              <td>Desenolvimento Backend</td>
              <td>{qtdAlunosBe}</td>
              <td>0</td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  )
}

export default App;
