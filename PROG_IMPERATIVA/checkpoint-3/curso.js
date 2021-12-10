// Micro desafio - Passo 3 - crie o objeto literal curso  uma lista de estudantes 
// (um array composto pelos alunos criados no passo 1).
let aluno = require('./alunos');
let novaListaEstudantes = require('./estudantes');

const curso = {
  nomeCurso: 'CTD',
  notaAprovacao: 7,
  faltasMaximas: 5, 
  listaEstudantes: aluno.aluno,
// Micro desafio - Passo 4 - método que permite adicionar alunos à lista do curso
  addAluno: function(nome, faltas, notas){
    this.listaEstudantes.push(new aluno.alunos.Cadastro(nome, faltas, notas));
  },
// Micro desafio - Passo 5
//Método que receba um aluno e retorne true ou false se ele foi aprovado ou não
  verificaAprovacao: function(estudante){
    let media = aluno.alunos.calcularMedia(estudante.nome);
    let faltas = estudante.qtdFalta;
    if (media >= this.notaAprovacao){
      if (faltas < this.faltasMaximas) {
        return true;
      } else if (faltas == this.faltasMaximas && (media > (this.notaAprovacao * 1.1))){
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  },
// Micro desafio - Passo 6
// Método que percorra a lista de estudantes e retorne se os alunos aprovaram ou não.
  aprovados: function(){
    let alunosAprovados = [];
    this.listaEstudantes.forEach(e => {
        alunosAprovados.push(this.verificaAprovacao(e));
    });
    return alunosAprovados;
  }

}

// Micro desafio - Passo 7
/* Importe o módulo estudantes.js, que contém uma lista de alunos, dentro do arquivo que contém o objeto curso. 
Substitua o conteúdo da propriedade lista de estudantes, pela lista de estudantes do arquivo estudantes.js e garanta que sigam funcionando todos os métodos corretamente. (revisar que o arquivo tenha todos os métodos corretamente).
*/




/*====TESTE AQUI====*/
// curso.addAluno('Marcos Santana', 4, [8,6,7.5])
// curso.addAluno('Ivin Ivinsivel', 8, [9,7,8]);
// console.log(curso.listaEstudantes)

// console.log(curso.verificaAprovacao(curso.listaEstudantes[0]));

// console.log(curso.aprovados());


//===== ESTUDANTES.JS========;
// curso.listaEstudantes.splice(0, curso.listaEstudantes.length);
// novaListaEstudantes.forEach(e => {
//     curso.addAluno(e.nome, e.qtdFalta, e.notas);
// });

// console.log(curso.listaEstudantes);

// console.log(curso.verificaAprovacao(curso.listaEstudantes[3]));

// console.log(curso.aprovados());