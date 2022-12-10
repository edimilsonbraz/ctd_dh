import { useContext, useState } from 'react'
import { DentistaContext } from '../../contexts/DentistaProvider'
import { PacienteContext } from '../../contexts/PacienteProvider'
import styles from './styles.module.css'

const ScheduleForm = () => {
  const { dentistas } = useContext(DentistaContext);
  const { pacientes } = useContext(PacienteContext);

  const [dentistaForm, setDentistaForm] = useState("");
  const [pacienteForm, setPacienteForm] = useState("");
  const [dataConsulta, setDataConsulta] = useState("")

  const handleSubmit = (event) => {
    //Nesse handlesubmit você deverá usar o preventDefault,
    event.preventDefault();

    //obter os dados do formulário e enviá-los no corpo da requisição
    //para a rota da api que marca a consulta
    const dataForm = {
      dentistaForm,
      pacienteForm,
      dataConsulta
    }
    console.log(dataForm)
    

    //lembre-se que essa rota precisa de um Bearer Token para funcionar.
    //Lembre-se de usar um alerta para dizer se foi bem sucedido ou ocorreu um erro
  }

  return (
    <>
      {/* //Na linha seguinte deverá ser feito um teste se a aplicação
        // está em dark mode e deverá utilizar o css correto */}
      <div className={`text-center container}`}>
        <form onSubmit={handleSubmit}>
          <div className={`row ${styles.rowSpacing}`}>
            <div className="col-sm-12 col-lg-6">
              <label htmlFor="dentist" className="form-label">
                Dentista
              </label>
              <select 
                className="form-select" 
                name="dentist" 
                id="dentist"
                onChange={(event) => setDentistaForm(event.target.value)}
              >
                {dentistas.map((dentista) => (
                  <option key={dentista.matricula} value={dentista.matricula}>
                    {`${dentista.nome} ${dentista.sobrenome}`}
                  </option>
                ))}
              </select>
            </div>
            <div className="col-sm-12 col-lg-6">
              <label htmlFor="patient" className="form-label">
                Paciente
              </label>
              <select 
                className="form-select" 
                name="patient" 
                id="patient"
                onChange={(event) => setPacienteForm(event.target.value)}
              >                
                {pacientes.map((paciente) => (
                  <option key={paciente.matricula} value={paciente.matricula}>
                    {`${paciente.nome} ${paciente.sobrenome}`}
                  </option>
                ))}
              </select>
            </div>
          </div>
          <div className={`row ${styles.rowSpacing}`}>
            <div className="col-12">
              <label htmlFor="appointmentDate" className="form-label">
                Data
              </label>
              <input
                className="form-control"
                id="appointmentDate"
                name="appointmentDate"
                type="datetime-local"
                onChange={(event) => setDataConsulta(event.target.value)}
              />
            </div>
          </div>
          <div className={`row ${styles.rowSpacing}`}>  
            {/* //Na linha seguinte deverá ser feito um teste se a aplicação
            // está em dark mode e deverá utilizar o css correto */}
            <button className={`btn btn-light ${styles.button}`} >
              Agendar
            </button>
          </div>
        </form>
      </div>
    </>
  )
}

export default ScheduleForm
