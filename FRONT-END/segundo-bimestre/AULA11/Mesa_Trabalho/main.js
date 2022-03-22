const submit = document.querySelector('button');

submit.addEventListener('click', (event) => {
  const firstName = document.getElementById('name').value;
  const LastName = document.getElementById('lastname').value;
  const content = document.querySelector('form');
  
  event.preventDefault()

  let createTagP1 = document.createElement('p')
  let textName = document.createTextNode(firstName)
  createTagP1.appendChild(textName)
  

  let createTagP2 = document.createElement('p')
  let textLastName= document.createTextNode(LastName)
  createTagP2.appendChild(textLastName)


  // const fullName = name.concat(" ", surName);
  // console.log(fullName)
  // let totalName = document.createElement('p')
  // let textFullName = document.createTextNode(fullName)
  // totalName.appendChild(textFullName)

  //Setando na Div
  content.appendChild(createTagP1)
  content.appendChild(createTagP2)
  // content.appendChild(totalName)
  
})

