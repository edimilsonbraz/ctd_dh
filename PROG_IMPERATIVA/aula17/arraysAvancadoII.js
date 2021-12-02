//Micro desafios II

// 1)  Crie uma função que receba um array composto por números e retorna uma nova matriz (array) com todos os valores divididos pela soma de toda a matriz, usando map() e reduce()

let numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

let somaTotal = numbers.reduce((numAnterior, numAtual) => {
  return numAnterior + numAtual
})

console.log(somaTotal)

let newNumbers = numbers.map((number) => {
  return (number / somaTotal).toFixed(4);
})

console.log(newNumbers)

/* 2) Crie uma função que receba um array de palavras e um número, e que retorna uma matriz (array) com apenas as palavras que têm mais do que uma quantidade de letras maior do que o número informado. (verifique como funciona o método filter ())
let palavras = ["javascript", 10, "google", "facebook", "digitalhouse"]*/
let palavras = ["javascript", 10, "google", "facebook", "digitalhouse"]
let retornoPalavras = palavras.filter((item) => {
  return item.length > 6; 
})
console.log(retornoPalavras)

/* 3) Crie um array de objetos literais, onde cada objeto será um aluno e terá dois atributos: nome e nota. Crie duas funções que ordenam o array: uma ordenará os alunos em ordem alfabética e a outra o fará por nota, da mais alta para a mais baixa. (Analise qual método seria apropriado para este caso.*/

const alunos = [
  {
  nome: "Edimilson",
  nota: 9.5,
  },
  {
    nome: "Mayk",
    nota: 10,    
  },
  {
    nome: "Diego",
    nota: 9.8
  },
  {
    nome: "Aline",
    nota: 8.5  
  }
]
let ordemAlfabetica = Array.from(alunos)


console.log(ordemAlfabetica)
