//1. CONVERTE EM MAIUSCULAS

let filmes = ["star wars", "totoro",  "rocky", "pulp fiction",  "la vida es bella"]

function converteEmMaiusculas(arr) {
  for(let i = 0; i < filmes.length; i++) {
    arr[i] = arr[i].toUpperCase()
  }
  return arr
}
console.log("CONVERTE ARRAY EM MAIUSCULAS")
console.log(converteEmMaiusculas(filmes))


//2. PASSAR ELEMENTOS DE UM ARRAY PARA OUTRO ARRAY
console.log("===========================")
console.log("PASSAR UM ARRAY PARA UM OUTRO ARRAY")
let filmesESeries = ["star wars", "matrix",  "mr. robot", "o preço do amanhã",  "a vida é bela"]

let filmesAnimados = ["Toy Story", "Procurando Nemo", "Kung-fu Panda", "Wally", "Fortnite"]

function passagemDeElementos(arr1, arr2) {
  let qtd = arr2.length;
  for(let i=0; i < qtd; i++) {
    arr1.push(arr2.shift());
  }
  return arr1
}

console.log(passagemDeElementos(filmesESeries, filmesAnimados) )
console.log(filmesAnimados.length)


//3. SALVAR O ITEM DELETADO DO ARRAY EM UMA VARIAVEL
function passagemDeElementos(arr1, arr2) {
  let invalido = arr2.pop();
  let qtd = arr2.length;

  for(let i=0; i < qtd; i++) {
    arr1.push(arr2.pop().toUpperCase())
  }
  console.log("Esse filme é invalido :", invalido)
  return arr1
}

console.log(passagemDeElementos(filmesESeries, filmesAnimados))

// 4.