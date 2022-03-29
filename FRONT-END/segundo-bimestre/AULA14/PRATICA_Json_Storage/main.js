/*
REQUISITOS
OK - Crie um formulário para capturar um texto inserido. 

OK - Implemente o evento "submit", use-o para salvar o comentário em um array.

OK - Cada vez que um novo comentário é adicionado, renderize-o em uma tag "p" 

- (remova o código permanente do HTML e torne-o dinâmico).

- Salve constantemente as informações no localStorage, caso a página seja recarregada os comentários devem ser mantidos.
*/

const content = document.getElementById('content')
const inputElement = document.getElementById('frase')
const buttonElement = document.getElementById('btn-submit')

let tarefas = JSON.parse(localStorage.getItem('list_tarefas')) || [];

//Function Limpa os Campos dos inputs
function mostraTarefas() {
  content.innerHTML = '';

  for(let item of tarefas) {
    //Criando o elemento p com seu texto
    let itemElement = document.createElement('p')
    let itemText = document.createTextNode(item)
    itemElement.appendChild(itemText)
    content.appendChild(itemElement)

    //Pegando posiçao dos elementos do array  
    const index = tarefas.indexOf(item)
    console.log(index)
  }
}
// mostraTarefas()

function addTarefa(event) {
  event.preventDefault()

  //pegando valor do input digitado
  const tarefa = inputElement.value

  //add no array tarefas
  tarefas.push(tarefa)
  //limpando o input
  inputElement.value = '';
  mostraTarefas()
  salvarNoLocalStorage()
}

function salvarNoLocalStorage() {
  localStorage.setItem('list_tarefas', JSON.stringify(tarefas))
}

buttonElement.addEventListener('click', addTarefa)

// function removeText() {
//   let selectP = document.querySelectorAll('p')
//   selectP.item.innerHTML = '';
  
//   //Pegando o index do array em localStorage
//   // const index = arrayFrases.indexOf(frase)
//   // if(index != -1) {
//   //   arrayFrases.splice(index, 1)
//   // }else {
//   //   console.log("Posição não existe")
//   // }
// }


// form.addEventListener('submit', (event) => {
//   event.preventDefault()

//   //inserindo dentro do array
//   const frase = inputElement.value
//   arrayFrases.push(frase)

//   //criando a tag p
//   let fraseHtml = document.createElement('p')
//   //Passa sempre o ultimo elemento do array
//   fraseHtml.innerText = `${arrayFrases[arrayFrases.length - 1]} `
//   //jogando ele no html
//   content.appendChild(fraseHtml)

//   //Salvando em localStorage
//   localStorage.setItem('text', JSON.stringify(arrayFrases))

  

//   //Limpa o input
//   clearInput()
  
// })

// content.addEventListener('click', removeText)




