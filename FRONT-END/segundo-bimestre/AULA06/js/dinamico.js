// 1- Adiciona ao cartão, o atributo "class" com o valor "card"
let card = document.getElementById('tarjeta')
card.setAttribute('class', 'card')

// 2- Adicione o atributo "src" à imagem com o valor "https://www.youtube.com/img/desktop/yt_1200.png"
let logo = document.getElementById('logo')
logo.setAttribute('src', 'https://www.youtube.com/img/desktop/yt_1200.png')

// 3- Remova a classe "titulo-feio" do título do documento
let titulo = document.querySelector('h1')
titulo.removeAttribute('class')


// 4- Verifique se o link para o YouTube tem o atributo href ou não, e imprima esse resultado no console
let youtube = document.getElementById('link_youtube')
console.log(youtube.hasAttribute('src'))

// 5- Capture o valor de href do link do Wikipedia e exiba no console
let wiki = document.getElementById('link_wikipedia')
console.log(wiki.getAttribute('href'))
