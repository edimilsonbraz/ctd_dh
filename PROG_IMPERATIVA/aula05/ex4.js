// Funções Simples
// 1. Crie uma função que converta polegadas em centímetros.
// Recebe pelo parâmetro polegadas e retorna seu equivalente em centímetros.
// cm = tonelada/0.39370
function convertePolegada(pol) {
   return pol*2.5;
}

console.log(convertePolegada(10))

// 2. Crie uma função que receba uma string e a converta em um URL.
// ex: "funcaojs" é retornado como "http://www.funcaojs.com.br"
function converteUrl(url) {
  return ("http://www." + url + ".com.br")
}

console.log(converteUrl("youtube"))

// 3. Crie uma função que recebe uma string e retorna a mesma frase, mas com o
// caracter de exclamação ( ! ).
function recebeString(frase) {
  return (frase + "!")
}
console.log(recebeString("Hello"))

// 4. Crie uma função que calcule a idade dos cachorros, considerando que 1 ano
// humano, equivale a 7 anos para eles.

function calculaIdade(idadeCachorro) {
  return idadeCachorro * 7;
}
console.log(calculaIdade(5))

function calcularHora(salario) {
  return salario / 160;
}

//5
// Crie uma função que calcule o valor da sua hora de trabalho, tendo como parâmetro o seu salário mensal.
// PS: considere que você trabalhe 160 horas no mês.
function calcularHora(salario) {
  return salario / 160;
}
console.log(calcularHora(5000))


//6
// Crie a função calculadora de IMC* de uma pessoa, que recebe a altura em centímetros e o peso em quilogramas. Em seguida, execute a função, testando diferentes valores.
// *IMC, significa Índice de Massa Corporal e é um parâmetro utilizado para saber se o peso está de acordo com a altura.
function calcularIMC(altura, peso) {
  return peso / (altura * altura);
}
console.log(calcularIMC(1.74, 62))


//7
// Crie uma função que receba uma string em minúsculas, converta-a em maiúsculas e as retorne.
// Investigue o que o método de .toUpperCase() faz.
function maiusculas(string) {
  return string.toUpperCase();
}
console.log(maiusculas("jonathas"))


//8
// Crie uma função que receba um parâmetro e retorne o tipo de dado deste parâmetro.
// Dica: Isso te ajudará a entender o que o operador typeof faz.
function tipoDado(parametro) {
  return typeof parametro;
}
console.log(tipoDado(85))


//9
// Crie uma função pela qual passamos o raio de um círculo e ela retorna a circunferência.
// Dica: Investigue se o objeto Math tem entre suas propriedades o número Pi.
function circunferencia(raio) {
  return 2 * Math.PI * raio;
}
console.log(circunferencia(10))    