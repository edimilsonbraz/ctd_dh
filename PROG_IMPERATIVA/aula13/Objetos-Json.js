let users = {
  "id": 1,
  "name": "Jhon Jones",
  "avatar": "https://jon.com.br",
  "city": "Brasília"
}

console.log(users)
console.log(users.avatar)

let usersConvertido = JSON.stringify(users)
console.log(usersConvertido)

let tenista = {
  nome: 'Roger', 
  sobrenome: 'Federer', 
  saudacao: function() {
    return 'Olá me chamo ' + this.sobrenome
  }
}
console.log(tenista.saudacao())


function Carro(marca, modelo, ano) {
  this.marca = marca;
  this.modelo = modelo;
  this.ano = ano;
}
let meuCarro = new Carro('Fiat', 'Cronos', '2020')
console.log(meuCarro)


let apiGitHub = fetch("https://api.github.com/users/edimilsonbraz")
  .then((response) => {
    // const resposta = JSON.stringify(response)
    console.log(response)
  })
  .catch((erro) => console.log(erro))