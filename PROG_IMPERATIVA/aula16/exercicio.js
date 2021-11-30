//============Exercício “Terceirizando funções”====================\\
 /*
 Crie uma função acaoCarro(), que receberá uma callback como parâmetro. 
 Após isso, crie duas funções: andar() – deve exibir uma mensagem dizendo que o carro está andando – 
 E parar() – deve exibir uma mensagem dizendo que o carro parou.

 Execute ambas as ações utilizando a função acaoCarro(), passando suas ações como callbacks.
 */
 function andar() {
  console.log("O carro está andando")
}
function parar() {
  console.log("O carro paroOuU")
}

 function acaoCarro(callback) {
    return callback()
 }
//  console.log(acaoCarro(() => {
//    return 'Olá'
//  }))

// acaoCarro(andar)

/*============================== */
let p1 = () => console.log("FizZ")
let p2 = () => console.log("BuzZ")

function FizzBuzz(n1, n2, p1, p2) {
  for(let i = 0; i < 100; i++) {
    if((n1 % i == 0) && (n2 % i == 0)) {
      console.log(p1 + p2)
    }else if((n1 % i == 0) && (n2 % i !== 0)) {
      console.log(p1)
    }else if(n1 % i !== 0 && (n2 % i == 0))  {
      console.log(p2)
    }else {
      console.log(i)
    }
  }
}
console.log(FizzBuzz(1, 50, "FizZ", "BuzZ")) 