const liberarAcesso = function podeSubir(altura, estaAcompanhado) {
  if((altura > 1.40 && altura < 2.00) || (altura > 1.40 && estaAcompanhado)) {
    return ("Acesso autorizado")
  }else if(altura > 1.20 &&  altura < 1.40 && estaAcompanhado) {
    return ("Acesso autorizado somente com acompanhante")
  }else{
   return ("Acesso negado!")
  }
}

module.exports = liberarAcesso;