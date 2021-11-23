const fs = require('fs'); //modulo Nativo
let moment = require('moment'); // Modulo de Terceiros
let herois = require('./superHerois') // Modulo do usuario


let dados = fs.readFileSync(__dirname + '/dados.txt', 'utf8'  ) 
let data = moment().format('MMM do YY')

console.log(dados)
console.log(data)
console.log(herois[1].name)
console.log(herois[1].cumprimentar())

