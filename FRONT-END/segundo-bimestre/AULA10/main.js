function selectId(id) {
  return document.getElementById(id);
}

const submit = document.querySelector('button');
const firstName = selectId('name');
const LastName = selectId('lastname');
const lista = selectId('lista');

function upperCase(input) {
  return String(input).toUpperCase();
}

function fullName(first, last) {
  return first + ' ' + last
}


submit.addEventListener('click', (event) => {
  
  event.preventDefault()

  let createTagli1 = document.createElement('li')
  let textName = document.createTextNode(upperCase(firstName.value))
  createTagli1.appendChild(textName)

  let createTagli2 = document.createElement('li')
  let textLastName = document.createTextNode(upperCase(LastName.value))
  createTagli2.appendChild(textLastName)

  let createTagli3 = document.createElement('li')
  let textFullName = document.createTextNode(fullName(textName, textLastName))
  console.log(textFullName)
  createTagli3.appendChild(textFullName)


  // const fullName = textName + " " + textLastName;
  // console.log(`${textName} + "eu aqui"`)
  // let totalName = document.createElement('li')
  // let textFullName = document.createTextNode(fullName)
  // totalName.appendChild(textFullName)

  //Setando na Div
  lista.appendChild(createTagli1)
  lista.appendChild(createTagli2)
  lista.appendChild(createTagli3)
  
})

