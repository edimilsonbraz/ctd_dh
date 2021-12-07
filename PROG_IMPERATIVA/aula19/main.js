let pessoas = [];

// const arquivos = [
//   {
//       "sexo": "F",
//       "nome": "Abigael Natte"
//   },
//   {
      
//       "sexo": "M",
//       "nome": "Ramon Connell"
//   },
//   {
      
//       "sexo": "M",
//       "nome": "Jarret Lafuente"
//   },
//   {
      
//       "sexo": "F",
//       "nome": "Ansel Ardley"
//   },
//   {
      
//       "sexo": "F",
//       "nome": "Jacki Shurmer"
//   },
//   {
      
//       "sexo": "M",
//       "nome": "Jobi Mawtus"
//   },
//   {
      
//       "sexo": "M",
//       "nome": "Thomasin Latour"
//   },
//   {
      
//       "sexo": "S",
//       "nome": "Lonnie Verheijden"
//   },
//   {
      
//       "sexo": "M",
//       "nome": "Alonso Wannan"
//   },
//   {
      
//       "sexo": "F",
//       "nome": "Bendite Huggett"
//   }
// ]

//1 - função construtora
function CriaPessoa(nome, altura, sexo) {
  this.nome = nome;
  this.altura = altura;
  this.sexo = sexo;  
}

pessoas.push(new CriaPessoa("Abigael Natte", 1.82, "F"));
pessoas.push(new CriaPessoa("Ramon Connell", 1.70, "M"));
pessoas.push(new CriaPessoa("Jarret Lafuente", 1.35, "M"));
pessoas.push(new CriaPessoa("Ansel Ardley", 1.62, "F"));
pessoas.push(new CriaPessoa("Jacki Shurmer", 1.72, "F"));
pessoas.push(new CriaPessoa("Jobi Mawtus", 1.82, "M"));
pessoas.push(new CriaPessoa("Thomasin Latour", 1.92, "M"));
pessoas.push(new CriaPessoa("Lonnie Verheijden", 1.52, "F"));
pessoas.push(new CriaPessoa("Alonso Wannan", 1.94, "M"));
pessoas.push(new CriaPessoa("Bendite Huggett", 2.04, "M"));


console.log(pessoas)
/*=======================================*/
//a maior e a menor altura do grupo;
pessoas.sort((a,b) => {
  if(a.altura > b.altura) {
    return 1;
  }
  if(a.altura < b.altura) {
    return -1;
  }
    return 0;
})

console.log("Pessoa com Menor algura " + pessoas[0].nome)
console.log("Pessoa com Maior algura " + pessoas[pessoas.length - 1].nome)

/*=======================================*/
//a média de altura das mulheres;
function mediaAlturaMulheres(array) {
  let filterMulheres = array.filter((item) => {
    return item.sexo == "F"
  })

  let result = 0;

  filterMulheres.forEach((item) => {
    result += item.altura
  })

  return (result / filterMulheres.length).toFixed(2);
}

console.log(mediaAlturaMulheres(pessoas));


/*=======================================*/
//o número de homens.
function qtdHomens(array, sexo) {
  let filterHomens = array.filter((item) => {
    return item.sexo == sexo
  })

  return filterHomens.length;
}

console.log("Quantidade de homens: " + qtdHomens(pessoas, "M"))