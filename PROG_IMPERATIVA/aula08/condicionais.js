let status = true;
if(status) {
  console.log("Status é verdadeiro")
}else{
  console.log("Status é falso")
}

/*============================================================*/

let linguagem = "php"
if(linguagem == "javascript") {
  console.log("Estou aprendendo")
}else{
  console.log("aprenderei mais tarde")
}

/*============================================================*/

function podeSubir(altura, estaAcompanhado) {
  if((altura > 1.40 && altura < 2.00) || (altura > 1.40 && estaAcompanhado)) {
    console.log("Acesso autorizado")
  }else if(altura > 1.20 &&  altura < 1.40 && estaAcompanhado) {
    console.log("Acesso autorizado somente com acompanhante")
  }else{
    console.log("Acesso negado!")
  }
}

podeSubir(1.21, true)
