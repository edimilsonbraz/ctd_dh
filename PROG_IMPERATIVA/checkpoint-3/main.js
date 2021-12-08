// Micro desafio - Passo 3

// Em um arquivo diferente, crie o objeto literal curso que tem como atributos: nome do curso (string), 
// nota de aprovação (number), faltas máximas (number) e uma lista de estudantes (um array composto pelos alunos 
//criados no passo 1).

let aluno = require('./alunos');

const curso = {
    nomeCurso: 'CTD',
    notaAprovacao: 7,
    faltasMaximas: 5, 
    listaEstudantes: aluno       
}


// Micro desafio - Passo 4
//Crie o método que permite adicionar alunos à lista do curso, ou seja, quando chamamos nosso método em 
//nosso objeto curso, deverá adicionar um aluno a mais na propriedade lista de estudantes do objeto curso.
function addAluno(array){
  array.push(new aluno.Cadastros(DadosClientes[i].numero, DadosClientes[i].tipo, DadosClientes[i].saldo, DadosClientes[i].titular));
 
}

curso.listaEstudantes.push()