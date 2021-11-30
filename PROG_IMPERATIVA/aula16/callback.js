function nomeCompleto(nome, sobrenome) {
  return nome+' '+sobrenome
}

console.log(nomeCompleto('Edimilson', 'Braz'))

function bomDia(nome, sobrenome, nomeCompleto) {
  return 'Olá ' + nomeCompleto(nome, sobrenome)
}

console.log(bomDia('Jonny', 'Bravo', nomeCompleto))