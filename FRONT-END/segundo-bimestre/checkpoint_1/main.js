const modal = document.querySelector('.modal-wrapper');
// const sendButton = document.getElementById('send');


//Function que abre e fecha a Modal
function changeModal() {
  modal.classList.toggle('active')
  clearInput()
  event.preventDefault()
}

//Function Limpa os Campos dos inputs
function clearInput() {
  document.getElementById('form1').reset();
}

//Function que Cria todo o Card das pizzas
function createCard() {
  // Pegando valores do input com value
  event.preventDefault()
  const titleValue = document.getElementById('title').value;
  const ingredientValue = document.getElementById('ingredient').value;
  const urlValue = document.getElementById('url').value;
  
  //Validação dos inputs
  if(titleValue && ingredientValue && urlValue !== '') {

    //Criando a tag img e atributo src
    let img = document.createElement('img')
      img.setAttribute('src', urlValue)

    //Criando a tag h3 e seu texto
    let h3 = document.createElement('h3')
    let textH3 = document.createTextNode(titleValue)
      h3.appendChild(textH3)

    //Criando o p descricao e seu texto
    let description = document.createElement('p')
    let textDescription = document.createTextNode(ingredientValue)
      description.appendChild(textDescription)

    // Criando a tag a link e seu texto
    let link = document.createElement('a')
    let textLink = document.createTextNode('Valor R$ 49,90')
      link.appendChild(textLink)
    
    //Criando a div card e sua class
    let card = document.createElement('div')
      card.setAttribute('class', 'card')
      card.appendChild(img)
      card.appendChild(h3)
      card.appendChild(description)
      card.appendChild(link)

    //Setando na Div card 
    let cards = document.getElementById('cards')
      cards.appendChild(card)

    //Chamando function Fecha a modal  
    changeModal()

  }else{
    alert('Todos os campos devem ser preenchidos')
  }
}



