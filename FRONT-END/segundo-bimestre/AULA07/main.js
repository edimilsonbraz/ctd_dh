/*
Posso a passo para executar o desafio - Aula 07
1 - Criar a opção de escolha do felino
2 - Verificar qual foi a escolha do
3 - Definir uma url da internet 
4 - Alterar o atributo "src"
*/

function changeImg() {
  let listaFelinos = document.querySelectorAll('img')

  let escolha = parseInt(prompt('Escolha um felino \n 1)Tigre\n 2)Leão\n 3)Leopardo\n 4) Pantera negra\n 5)Jaguar\n 6) Tigre\n') -1);
  let url = prompt('Insira a URL da imagem que deseja');
  listaFelinos[escolha].setAttribute('src', url);
}