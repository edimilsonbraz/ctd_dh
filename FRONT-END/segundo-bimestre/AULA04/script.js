function escrevendoTexto(titulo, texto) {
  const body = document.getElementById('body');
  const myTemplate = 
    ` 
    <h1>${titulo}</h1>
    <p>${texto}</p>
    `;
  body.innerHTML += myTemplate;
}

escrevendoTexto('Olá', 'É um exemplo de um template string em HTML' )
escrevendoTexto('É dinâmico', 'Podemos inserir elementos HTML mediante o <b>Javascript</b>' )
escrevendoTexto('Facilita a programação', 'Evita escrever muito código e reutilizar o que escrevemos!')


let personagem = {
  nome: "Michael",
  sobrenome: "Scott",
  nascimento: {
    data: "15/04/1965",
    cidade: "Scranton",
    estado: "Pensilvânia"
  },
  imagenUrl : "https://upload.wikimedia.org/wikipedia/en/thumb/d/dc/MichaelScott.png/220px-MichaelScott.png",
  trabalho: {
    cargo: "manager regional",
    empresa: "Dunder Mifflin"
  }
};

escrevendoTexto(`${personagem.nome} ${personagem.sobrenome}`, `${personagem.trabalho.cargo}`)