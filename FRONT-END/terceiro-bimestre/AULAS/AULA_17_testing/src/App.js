import Card from "./components/Card";
import Increment from "./components/Increment";

function App() {
  const user = {
   nome: "Edimilson braz",
   profissao: "Dev Front-End"
  }
  return (
    <div>
      <h1>Hello App</h1>

      <Card {...user}/>

      <Increment />
    </div>
  );
}

export default App;
