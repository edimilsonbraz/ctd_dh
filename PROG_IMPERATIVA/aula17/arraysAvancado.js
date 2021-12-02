//Micro desafios I
// 1. Crie um array de números pares, e utilizando a função .map() nesse array, 
// crie um novo array com apenas números ímpares.

let numerosPares = [2, 4, 6, 8, 10]
 
  let numerosImpares = numerosPares.map((item) => {
    return item + 1;
  })

console.log(numerosImpares)

//2. Crie um array de nomes, que possua dois índices com o nome Maria. 
// Utilize o .filter() para obter apenas esses dois índices com o nome Maria.

let nomes = ["Maria", "Joana", "Cleito", "Maria", "Diego"]

  nomeSolicitado = nomes.filter((nome, indice) => {
    return nome == "Maria"
  })
console.log(nomeSolicitado)

//3. Crie um array de números e utilize a função .reduce() para devolver uma string 
//com os números formatados.
//Exemplo [1,5,9,3,7] => “1 – 5 – 9 – 3 – 7”

let numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

  let newNumeros = numeros.reduce((numAnterior, numAtual) => {
    return numAnterior + "-" + numAtual
  })
  console.log(newNumeros)

// 4. Crie um array de animais, após isso passe por cada índice utilizando 
// o .forEach() e imprima a frase “O animal é NOME_DO_ANIMAL”.
let animais = ["Leão", "Urso", "Ovelha", "Sucuri", "Girafa", "Peixe"]

animais.forEach((item) => {
  console.log("O animal é " + item + " " )
})

