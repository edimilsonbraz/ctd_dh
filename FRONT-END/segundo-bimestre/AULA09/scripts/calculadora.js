const somar = require('./soma');
const subtrair = require('./subtrair');
const multiplicar = require('./multiplicar');
const dividir = require('./dividir');

const calculadora = (n1, n2, callback) => callback(n1, n2);

console.log(calculadora(4, 2, somar));
console.log(calculadora(4, 2, subtrair));
console.log(calculadora(4, 2, multiplicar));
console.log(calculadora(4, 2, dividir));




