function adicao(n1, n2) {
  return n1 + n2;
}

function subtracao(n1, n2) {
  return n1 - n2;
}

function multiplicacao(n1, n2) {
  return n1 * n2;
}

function divisao(n1, n2) {
  return n1 / n2;
}

/* ========== Funções Extras ============= */
function quadradoDoNumero(n1) {
  return multiplicacao(n1, n1)
}

function mediaDeTresNumeros(n1, n2, n3) {
  let soma1 = adicao(n1, n2)
  let soma2 = adicao(soma1, n3)
  
  return divisao(soma2, 3)
}

function calculaPorcentagem(n1, n2) {
  let result = multiplicacao(n1, n2)

  return divisao(result, 100)
}

function geradorDePorcentagem(n1, n2) {
  let result = divisao(n1, n2)

  return multiplicacao(result, 100)
}


console.log ("=============== Teste de Operações / Calculadora ===============")

console.log(adicao(8, 4))

console.log(subtracao(10, 5)) 

console.log(multiplicacao(5, 5))

console.log(divisao(10, 2))
console.log(divisao(20, 0))


console.log ("=============== Teste de Operações / Funções Extras ===============")

console.log(quadradoDoNumero(5))

console.log(mediaDeTresNumeros(8, 9, 10))

console.log(calculaPorcentagem(100, 10))

console.log(geradorDePorcentagem(2, 200))