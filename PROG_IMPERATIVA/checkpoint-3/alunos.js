// Micro desafio - Passo 1 - Crie um objeto aluno 
let aluno = []

// Crie um construtor para ele e importe-o como o módulo aluno.
let alunos = {
  Cadastro: function(nome, qtdFalta, notas) {
      this.nome = nome;
      this.qtdFalta = qtdFalta;
      this.notas = notas
  },
// Micro desafio - Passo 2
// Nosso objeto aluno terá o método calcularMedia
  calcularMedia: function(nomeAluno){
    let soma = 0;
    let pessoa = aluno.filter((item) => item.nome == nomeAluno);
    for (let i = 0; i < pessoa[0].notas.length; i++) {
      soma += pessoa[0].notas[i];      
    }
    return soma / pessoa[0].notas.length;
  },
//Método chamado faltas, que simplesmente aumenta o número de faltas em 1.
  faltas: function(nomeAluno){
    let pessoa = aluno.filter((item) => item.nome == nomeAluno);
    pessoa[0].qtdFalta++;
    return pessoa[0].qtdFalta;
  },
}

aluno.push(new alunos.Cadastro('Rafael Queiroz',0, [9, 10, 10]));
aluno.push(new alunos.Cadastro('Bruno Barreto',3, [10, 9.75, 10]));
aluno.push(new alunos.Cadastro('Gabi Nakasone',1, [10, 10, 10]));
aluno.push(new alunos.Cadastro('Edimilson Sousa',3, [8, 7, 10]));
aluno.push(new alunos.Cadastro('Vinicius Evandro',1, [8, 8, 7]));
aluno.push(new alunos.Cadastro('Marcelo Barbosa',6, [8, 6, 5]));


/*====TESTE AQUI====*/
// console.log(aluno)
// console.log(alunos)
// console.log(alunos.calcularMedia('Edimilson Sousa'));
// console.log(alunos.faltas('Edimilson Sousa'));


module.exports = {aluno, alunos};