// Cada espectador de um cinema respondeu a um questionário no qual constava sua idade e a sua opinião em relação ao filme: ótimo - 3, bom - 2, regular -1.
// Faça um programa que receba a idade e a opinião de 15 espectadores, calcule e imprima:
// a média das idades das pessoas que responderam ótimo;
// a quantidade de pessoas que responderam regular;
// a porcentagem de pessoas que responderam bom entre todos os espectadores analisados.
/*=======================================*/
/*============ PARTE 2 =============*/
let espectadores = [];

//1 - função construtora
function Espectador(idade, opiniao) {
  this.idade = idade,
  this.opiniao = opiniao
};


espectadores.push(new Espectador(18, 2));
espectadores.push(new Espectador(25, 1));
espectadores.push(new Espectador(41, 3));
espectadores.push(new Espectador(32, 3));
espectadores.push(new Espectador(19, 3));
espectadores.push(new Espectador(23, 2));
espectadores.push(new Espectador(29, 2));
espectadores.push(new Espectador(38, 1));
espectadores.push(new Espectador(31, 1));
espectadores.push(new Espectador(27, 3));
espectadores.push(new Espectador(62, 3));
espectadores.push(new Espectador(12, 2));
espectadores.push(new Espectador(19, 1));
espectadores.push(new Espectador(35, 1));
espectadores.push(new Espectador(41, 3));


/*=======================================*/
//a média das idades das pessoas que responderam ótimo;
function mediaNotaOtimo(array) {
  let result = 0;
  let pessoasOtimas = array.filter((item) => {
    return item.opiniao == 3
  })

  pessoasOtimas.forEach((item) => {
    result += item.idade
  })

  return (result / pessoasOtimas.length).toFixed(2);
}

console.log("Média da idade dos espectadores que responderam ótimo: "+mediaNotaOtimo(espectadores, 3));


/*=======================================*/
// a quantidade de pessoas que responderam regular;
function qtdRespotasRegular(array, nota) {
  let qtdRespostasRegular = array.filter((item) => {
    return item.opiniao == nota
  });
  
    return qtdRespostasRegular.length
}

console.log(qtdRespotasRegular(espectadores, 1))


/*=======================================*/
//a porcentagem de pessoas que responderam bom entre todos os espectadores analisados.
function porcentagemNotas(totalPessoas, qtdRespotasRegular) {
  return ((qtdRespotasRegular*100) / totalPessoas).toFixed(2)
}

console.log(porcentagemNotas(espectadores.length, qtdRespotasRegular(espectadores, 2))+ "% votaram que o filme é Bom.")
