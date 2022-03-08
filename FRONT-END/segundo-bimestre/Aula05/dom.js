const body = document.querySelector('body')
const button = document.querySelector('button')
const h1 = document.querySelector('h1')
const item = document.querySelectorAll('.item')

button.addEventListener('click', () => {
  body.classList.toggle('dark')
  h1.classList.toggle('dark')
  item.forEach(lista => {
    lista.classList.toggle('dark')
  })
})
