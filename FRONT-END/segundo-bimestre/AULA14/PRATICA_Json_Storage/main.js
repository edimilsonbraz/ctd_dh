/*
REQUISITOS
OK - Crie um formulário para capturar um texto inserido. 

OK - Implemente o evento "submit", use-o para salvar o comentário em um array.

OK - Cada vez que um novo comentário é adicionado, renderize-o em uma tag "p" 

- (remova o código permanente do HTML e torne-o dinâmico).

- Salve constantemente as informações no localStorage, caso a página seja recarregada os comentários devem ser mantidos.
*/

const form = document.getElementById('myForm')
const fraseInput = document.getElementById('frase')
const content = document.getElementById('content')


let frases = [];

function removeText() {
  let selectP = document.querySelector('p')
  if(selectP != null) {
    selectP.innerHTML = '';
  }
}

form.addEventListener('submit', (event) => {
  event.preventDefault()
  //inserindo dentro do array
  frases.push(fraseInput.value)
  
  //criando a tag p
  let fraseHtml = document.createElement('p')
  //Passa sempre o ultimo elemento do array
  fraseHtml.innerText = `${frases[frases.length - 1]} `
  //jogando ele no html
  content.appendChild(fraseHtml)
  
  console.log(frases)
})

content.addEventListener('click', removeText)
// console.log(newArray)
