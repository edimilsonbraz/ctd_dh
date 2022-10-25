// Um nutricionista enviou a seguinte tabela com os dados de seus clientes e, 
//você será responsável por calcular o Índice de Massa Corporal de cada registro:
let nome = "José da silva";
let idade = 27;
let peso = 90.5;
let altura = 1.70;
let mensagem = "";
let plano = "true"

const imc = peso / (altura * altura);


if(imc < 18.5) {
  mensagem = "Abaixo do peso";
}else if(imc < 24.9) {
  mensagem = "Peso normal";
}else if(imc < 29.9) {
  mensagem = "Sobrepeso";
}else if(imc < 34.9) {
  mensagem = "Obesidade grau I";
}else if(imc < 39.9) {
  mensagem = "Obesidade grau II";
}else{
  mensagem = "Obesidade mórbida";

}

console.log(nome + " tem " + idade + " anos" + " e seu índice de massa corporal é de " +  imc.toFixed(2) + " -> " +  mensagem);