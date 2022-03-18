const modal = document.querySelector('.modal-wrapper');
const sendButton = document.getElementById('send');


//Abre e fecha a Modal
function changeModal() {
  modal.classList.toggle('active')
  clearInput()
  event.preventDefault()
}

//Limpar Campo do input
function clearInput() {
  document.getElementById('form1').reset();
}


function createCard() {
  
  // Pegando valores do input com value
  event.preventDefault()
  const titleValue = document.getElementById('title').value;
  const ingredientValue = document.getElementById('ingredient').value;
  const urlValue = document.getElementById('url').value;
  const valorPizza = document.getElementById('valor').value;

  //Criando a tag img e atributo src
  let img = document.createElement('img')
  img.setAttribute('src', urlValue)

  //Criando a tag h3 e seu texto
  let h3 = document.createElement('h3')
  let textH3 = document.createTextNode(titleValue)
    h3.appendChild(textH3)

  //Criando o p descricao e seu texto
  let descricao = document.createElement('p')
  let textP = document.createTextNode(ingredientValue)
    descricao.appendChild(textP)

  // Criando a tag a link
  let link = document.createElement('a')
  let textA = document.createTextNode(valorPizza)
    link.appendChild(textA)
  
  //Criando a div card e sua class
  let card = document.createElement('div')
    card.setAttribute('class', 'card')
    card.appendChild(img)
    card.appendChild(h3)
    card.appendChild(descricao)
    card.appendChild(link)

  //Setando na Div card 
  let cards = document.getElementById('cards')
    cards.appendChild(card)

  //Limpa input 
  clearInput()
  //Fecha a modal  
  changeModal()
}



