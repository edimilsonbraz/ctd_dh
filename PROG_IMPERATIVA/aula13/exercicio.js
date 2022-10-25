//Objetos Literais

//1 - Tipo de dados = Objeto
let contaTeste = {
  numeroConta: 123456,
  tipoConta: "corrente",
  saldoConta: 358.50,
  titularConta: "Edimilson Braz"
}
console.log(contaTeste.saldoConta)

//2 - função construtora
function ContaBancaria(numeroConta, tipoConta, saldoConta, titularConta) {
  this.conta = numeroConta;
  this.tipo = tipoConta;
  this.saldo = saldoConta;
  this.titular = titularConta;
}

//3 - Lista de Contas
let newConta = new ContaBancaria(165786, 'Corrente', 158.90, 'Mayk Brito')

let conta1 = new ContaBancaria(5486273622, 'Conta Corrente', 27771, 'Abigael Natte')

let conta2 = new ContaBancaria(1183971869, 'Conta Poupança', 8675, 'Ramon Connell')

let conta3 = new ContaBancaria(9582019689, 'Conta Poupança', 27363, 'Jarret Lafuente')

let conta4 = new ContaBancaria(1761924656, 'Conta Poupança', 32415, 'Ansel Ardley')

let conta5 = new ContaBancaria(7401971607, 'Conta Poupança', 18789, 'Jacki Shurmer')

let conta6 = new ContaBancaria(630841470, 'Conta Corrente', 28776, 'Jobi Mawtus')

let conta7 = new ContaBancaria(4223508636, 'Conta Corrente', 2177, 'JThomasin Latour')

let conta8 = new ContaBancaria(185979521, 'Conta Poupança', 25994, 'Lonnie Verheijden')

let conta9 = new ContaBancaria(3151956165, 'Conta Corrente', 7601, 'Alonso Wannan')

let conta10 = new ContaBancaria(2138105881, 'Conta Poupança', 33196, 'Bendite Huggett')


//4 - Gerar uma lista de Objetos
let listaClientes = [];
listaClientes.push(conta1);
listaClientes.push(conta2);
listaClientes.push(conta3);
listaClientes.push(conta4);
listaClientes.push(conta5);
listaClientes.push(conta6);
listaClientes.push(conta7);
listaClientes.push(conta8);
listaClientes.push(conta9);
listaClientes.push(conta10);

console.log(listaClientes)

//5 - Objeto literal chamado banco + propriedade clientes: clientes[]
let banco = {
  clientes: listaClientes,
//6 - Método consultarCliente que retornar os dados do cliente solicitado
  consultarCliente: function(titular) {
    let qtd = banco.clientes.length
    
    for(i = 0; i < qtd; i++)  { 
      if(this.clientes[i].titular == titular) {
        let dadosCliente = this.clientes[i]

        return dadosCliente;
      }else{
        return "Cliente não Encontrado"
      }
    }
  },
//7 - Método depósito que add valor no saldo
  deposito: function(titular, valor) {
    let qtd = banco.clientes.length
    
    for(i = 0; i < qtd; i++)  { 
      if(this.clientes[i].titular == titular) {
        let novoSaldo = this.clientes[i].saldo + valor

        return "Depósito realizado, seu novo saldo é: " + novoSaldo
      }
    }
  },
//8 - Método Saque que retira valor do saldo
  saque: function(titular, valor) {
    let qtd = banco.clientes.length

    for(i = 0; i < qtd; i++)  {
      if(this.clientes[i].titular == titular) {
        let novoSaldo = this.clientes[i].saldo - valor
        if(novoSaldo > 0) {
          return "Extração feita com sucesso, seu novo saldo é: " + novoSaldo
        }else {
         return "Fundos insuficientes " + novoSaldo
        }
      }
    }
  }
}


console.log(banco.consultarCliente('Abigael Natte'))
console.log(banco.deposito('Ansel Ardley', 1000))
console.log(banco.saque('JThomasin Latour', 3000))
// console.log(typeof banco.clientes[8].saldo)

