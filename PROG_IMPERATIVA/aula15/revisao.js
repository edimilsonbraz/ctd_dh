let dados = require('./data')

let contaTeste = {
  numeroConta: 123456,
  tipoConta: "corrente",
  saldoConta: 358.50,
  titularConta: "Edimilson Braz"
}

//2 - função construtora
function ContaBancaria(numeroConta, tipoConta, saldoConta, titularConta) {
  this.conta = numeroConta;
  this.tipo = tipoConta;
  this.saldo = saldoConta;
  this.titular = titularConta;
}

//3
let listaUsuarios = [];
for(i = 0; i < dados.length; i++) {
  listaUsuarios.push(new ContaBancaria(dados[i].numero, dados[i].tipo, dados[i].saldo, dados[i].titular))  
}

//4, 5
let banco = {
  clientes: listaUsuarios,
  consultarCliente: function(titular) {
    let qtd = banco.clientes.length
    
    for(i = 0; i < qtd; i++)  { 
      if(this.clientes[i].titular == titular) {
        let dadosCliente = this.clientes[i]
        return dadosCliente;
      }
    }
  }

}
console.log(banco.consultarCliente("Ramon Connell"))
