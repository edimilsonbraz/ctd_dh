function dividir(dividendo, divisor) {
  if(dividendo && divisor !== 0) {
    return (dividendo / divisor)
  }
  else{
    return console.log("Não se pode dividir por zero");
  }
}
// dividir()

module.exports = dividir;