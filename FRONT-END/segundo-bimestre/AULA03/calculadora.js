const somar = require('./somar')
const subtrair = require('./subtrair')
const multiplicar = require('./multiplicar')
const dividir = require('./dividir')

console.log(somar(10,15))
console.log(subtrair(10,5))
console.log(multiplicar(10,5))
console.log(dividir(10,5))
console.log(dividir(0,5))

/*
O que teria acontecido se, em vez de gerar um arquivo para cada operação matemática, tivéssemos programado tudo no mesmo arquivo?
*/

/*
Por que o melhor caminho é gerar diferentes arquivos e depois requerê-los em um único arquivo?
*/

/*
Esta metodologia de trabalho será uma constante a partir de agora?
*/
