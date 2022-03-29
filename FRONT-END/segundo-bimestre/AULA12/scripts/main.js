let nomeSobrenome = document.getElementById('nome')
let idade = document.getElementById('idade');
let altura = document.getElementById('altura');
let email = document.getElementById('email');
let biografia = document.getElementById('biografia');
let listaItens = document.getElementById('listaItens');
let termosDeUso = document.getElementById('termosUso');
let genero = document.getElementById('genero');

let botaoSalvar = document.getElementById('salvar');

let dadosUsuario = {
  nome: '',
  idade: '',
  altura: '',
  email: '',
  biografia: '',
  itens: '',
  termosDeUso: '',
  genero: '',
}

botaoSalvar.addEventListener('click', (event) => {
  event.preventDefault();

  dadosUsuario.nome = nomeSobrenome.value
  dadosUsuario.idade = idade.value
  dadosUsuario.altura = altura.value
  dadosUsuario.email = email.value
  dadosUsuario.biografia = biografia.value
  dadosUsuario.itens = listaItens.value
  dadosUsuario.termosDeUso = termosDeUso.value
  // dadosUsuario.genero = genero.value

  carregaDadosEmTela(dadosUsuario)
})

function carregaDadosEmTela(dadosRecebidoUsuario) {

  let nomeDom = document.getElementById('nomeUsuario')
  let sobrenomeDom = document.getElementById('sobrenomeUsuario')
  let idadeDom = document.getElementById('idadeUsuario')
  let alturaDom = document.getElementById('alturaUsuario')
  let emailDom = document.getElementById('emailUsuario')
  let biografiaDom = document.getElementById('biografiaUsuario')
  
  nomeDom.innerText = dadosRecebidoUsuario.nome;
  sobrenomeDom.innerText = dadosRecebidoUsuario.sobrenome;
  idadeDom.innerText = dadosRecebidoUsuario.idade;
  alturaDom.innerText = dadosRecebidoUsuario.altura;
  emailDom.innerText = dadosRecebidoUsuario.email;
  biografiaDom.innerText = dadosRecebidoUsuario.biografia
}