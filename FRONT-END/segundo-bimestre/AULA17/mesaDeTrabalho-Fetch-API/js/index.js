// Aqui realizamos a consulta da promisse, esperando sua resposta assíncrona
async function getImagesApi() {
  await fetch('https://randomuser.me/api/')
  .then(response => {
    return response.json()
  })
  .then(data => {
    //manipulamos a resposta
    renderizarDadosUsuario(data)
  })
  .catch(error => {
    console.log(error)
  })
}
    
function renderizarDadosUsuario(dados) {
  /* -------------------------------- Tarefa 1 -------------------------------- */
  let urlImage = dados.results[0].picture.large
  let userName = `${dados.results[0].name.first} ${dados.results[0].name.last}`
  let userEmail = dados.results[0].email

  const card = document.querySelector('.card');

  card.innerHTML = `
  <img src="${urlImage}">
  <div>
    <h2>${userName}</h2>
    <p>${userEmail}</p>
  </div>
  `
}

/* --------------------------- Tarefa 2 (extra) --------------------------- */

const btnRandom = document.getElementById('random')
btnRandom.addEventListener('click', () => {
  getImagesApi()
})