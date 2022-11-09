import { useState } from 'react';
import './styles.css'


function App() {
  const [selectValue, setSelectValue] = useState(''); 

  const [notas, setNotas] = useState(0);
  const [notaDataBase, setNotaDataBase] = useState(0);
  const [notaFronEnd, setNotaFronEnd] = useState(0);
  const [notaBackEnd, setNotaBackEnd] = useState(0);

  const [qtdDataBase, setQtdDataBase] = useState(0);
  const [qtdBackEnd, setQtdBackEnd] = useState(0);
  const [qtdFrontEnd, setQtdFrontEnd] = useState(0);

  function handleSubmit(event) {
    event.preventDefault()

    if(selectValue === "") {
      alert("Selecione uma disciplina!")
      return;
    }

    // if(notas < 0 || notas > 10 || notas === "" || typeof notas === "string") {
    //   alert("Informe uma nota válida!");
    //   return;
    // }

    if(selectValue === "database") {
      setQtdDataBase(qtdDataBase + 1);
      
    }else if(selectValue === "frontend"){
      setQtdFrontEnd(qtdFrontEnd + 1);
      setNotaFronEnd(parseFloat(notas) + parseFloat(notaFronEnd))
    }else if(selectValue === "backend") {
      setQtdBackEnd(qtdBackEnd + 1)
      setNotaBackEnd(parseFloat(notas) + parseFloat(notaBackEnd))
    }else{
      alert("A disciplina selecionada não é válida")
      return;
    }
  }

  function handleMedia() {
    console.log("entrei")
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
          <input onChange={e => setNotas(e.target.value)}/>
        </div>
        <input type="submit" value="Salvar" onChange={handleMedia} disabled={selectValue === "devops" || notas === 0}/>
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
              <td>{qtdDataBase}</td>
              <td>{notaDataBase}</td>
            </tr>

            <tr>
              <td>Desenvolvimento Frontend</td>
              <td>{qtdFrontEnd}</td>
              <td>{notaFronEnd}</td>
            </tr>

            <tr>
              <td>Desenolvimento Backend</td>
              <td>{qtdBackEnd}</td>
              <td>{notaBackEnd}</td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  )
}

export default App;
