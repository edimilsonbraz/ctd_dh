let pipoca = 10;
let macarrao = 8;
let carne = 15;
let feijao = 12;
let brigadeiro = 8;

function microondas(comida, tempo) {
  switch(comida) {
    case 1://pipoca
      if(tempo >= 20 && tempo < 30) { // 2x
        console.log("A comida queimou")
      }else if(tempo >= 30) { //3x
        console.log("Kabumm")
      }else if(tempo < 10){
        console.log("Tempo insuficiente")
      }else {
        console.log("Prato pronto, bom apetite!!!")
      }
      break;
    case 2: //macarrao
      if(tempo >= 16 && tempo < 24) {
        console.log("A comida queimou")
      }else if(tempo >= 24) { //3x
        console.log("Kabumm")
      }else if(tempo < 8){
        console.log("Tempo insuficiente")
      }else {
        console.log("Prato pronto, bom apetite!!!")
      }
      break;
    case 3: //carne
      if(tempo >= 30 && tempo < 45) {
        console.log("A comida queimou")
      }else if(tempo >= 45) { //3x
        console.log("Kabumm")
      }else if(tempo < 15){
        console.log("Tempo insuficiente")
      }else {
        console.log("Prato pronto, bom apetite!!!")
      }
      break;
    case 4: //feijao
      if(tempo >= 24 && tempo < 36) {
        console.log("A comida queimou")
      }else if(tempo >= 36) { //3x
        console.log("Kabumm")
      }else if(tempo < 12){
        console.log("Tempo insuficiente")
      }else {
        console.log("Prato pronto, bom apetite!!!")
      }
      break;
    case 5: //brigadeiro
      if(tempo >= 16 && tempo < 24) {
        console.log("A comida queimou")
      }else if(tempo >= 24) { //3x
        console.log("Kabumm")
      }else if(tempo < 8){
        console.log("Tempo insuficiente")
      }else {
        console.log("Prato pronto, bom apetite!!!")
      }
      break;
      default: {
        console.log("Prato inexistente")
      }
  }
}

microondas(4, 25)

