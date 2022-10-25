// ESTRUTURA DE REPETIÇÃO FOR

//1.Repetir como um papagaio

// Crie um loop utilizando for que se repita 5 vezes. Dentro de cada repetição se deve mostrar no console a mensagem “Olá mundo”.
for(let contador = 1; contador <= 5; contador++) {
  console.log("Olá mundo" + " ", contador)
}

console.log("======================")
console.log("NUMEROS ÍMPARES")
// 2.Contando números ímpares

// Crie um loop for de 1 a 10, em que exiba no console apenas o valor das repetições de números ímpares.

for(let contador = 0; contador <= 10; contador = contador+3) {
  
  console.log(contador)
}

console.log("======================")
console.log("TABUADA")
//3.Criando a tabuada

//Crie uma tabuada utilizando o for. Dica: Para essa tarefa você irá precisar utilizar /////dois loops (for).
function tabuada(number) {
  for(let i=1; i<= 10; i++) {
    let calc = i * number
    console.log(number, "x", i, "=", calc)
  }
}
tabuada(3)



// ESTRUTURA DE REPETIÇÃO WHILE 
console.log("======================")
console.log("CONTADOR DE 2 em 2")
//ESTRUTURA DE REPETIÇÃO
for(let i = 0; i <= 10; i= i+2) {
  console.log("Contador == ", i)
}

console.log("======================")
console.log("ARRAY")
//ESTRUTURA DE REPETI
let nomes = ["Marcos", "Fulano", "Ciclano", "Edimilson"];
for(let i =0; i < nomes.length; i++) {
  console.log(nomes[i])
}