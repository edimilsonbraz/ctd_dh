const submit = document.querySelector('button');

submit.addEventListener('click', (event) => {
  const firstName = document.getElementById('name').value;
  const LastName = document.getElementById('lastname').value;
  const content = document.querySelector('form');
  
  event.preventDefault()

  let name = document.createElement('p')
  let textName = document.createTextNode(firstName)
  name.appendChild(textName)

  let surName = document.createElement('p')
  let textSurName= document.createTextNode(LastName)
  surName.appendChild(textSurName)


  const fullName = name.concat(" ", surName);
  console.log(fullName)
  // let totalName = document.createElement('p')
  // let textFullName = document.createTextNode(fullName)
  // totalName.appendChild(textFullName)

  //Setando na Div
  content.appendChild(name)
  content.appendChild(surName)
  // content.appendChild(totalName)
  
})

