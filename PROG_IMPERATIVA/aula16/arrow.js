//Transforme as seguintes funções em arrow functions:
function print(mensagem){
  console.log(mensagem)
}
print("Olá, bom dia")

/*================================================================*/

let arrowPrint = (mensagem) => console.log(mensagem)
console.log(arrowPrint("Arrow Function here"))

/*================================================================*/

let bemVindo = () => "Olá Mundo!";
console.log(bemVindo())
 
 /*================================================================*/

function soma(n1, n2){
  return n1 + n2
}
 
console.log(soma(10, 10))

/*================================================================*/

let arrowSoma = (n1, n2) => n1 + n2
console.log(arrowSoma(10, 30))

/*================================================================*/

setTimeout(() => {
  console.log('Olá Mundo!')
 } , 1000)

/*================================================================*/

 //function ja definida
 function nomeCompleto(nome, sobrenome) {
  return nome + ' ' + sobrenome;
 };
 
 function bomDia(nome, sobrenome, nomeCompleto) {
  return 'Olá, ' + nomeCompleto(nome, sobrenome);
 };
 console.log(bomDia('Edimilson','Braz' , nomeCompleto))

/*================================================================*/
 let horaAtual = () => {
   let data = new Date();
   return data.getHours() + ':' + data.getMinutes();
 }
console.log(horaAtual())

/*================================================================*/

let printt = () => {
  console.log("Olá Mago")
}

// setInterval(printt, 1000)

 