import { useState } from "react";
import Card from "./components/Card";
import Dentista from "./components/Dentista";

import "./styles.css";

const dentistas = [
  {
    nome: "Wesley",
  },
  {
    nome: "Ana",
  },
  {
    nome: "Maria",
  },
];

function App() {
  const [theme, setTheme] = useState("light");

  function handleTheme() {
    if (theme === "light") {
      setTheme("dark");
    } else {
      setTheme("light");
    }
  }

  return (
    <div className={theme} data-testId="app">
      <h1>Hello world</h1>
      <Card description="Descricao do card" />

      <button onClick={handleTheme}>Alterar tema</button>

      {dentistas.map((dentista) => (
        <Dentista key={dentista.nome} nome={dentista.nome} />
      ))}
    </div>
  );
}

export default App;
