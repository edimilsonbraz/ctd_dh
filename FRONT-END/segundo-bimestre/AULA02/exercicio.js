/*
captura a escolha do jogador (1, 2, 3)
captura a escolha da máquina (random)
testar quem foi o ganhador da rodada
identificar o ganhador da partida
*/
let jogada = 0;
let pontosJogador = 0;
let pontosComputador = 0;
const array = [0, 1, 2];
while (jogada < 3) {
    jogada++;
    var jogador = parseInt(prompt("Escolha uma opção: 0: Pedra, 1: Papel ou 2: Tesoura"));
    var computador = array[Math.floor(Math.random() * 2)];
    console.log("Computador :" + computador);
    console.log("Jogador :" + jogador);
    switch (jogador) {
        case 0:
            if (computador == 2) {
                alert("Jogador ganhou!");
                pontosJogador++;
            } else if (computador == 1) {
                alert("Computador ganhou!");
                pontosComputador++;
            } else {
                alert("Empate!");
            }
            break;
        case 1:
            if (computador == 0) {
                alert("Jogador ganhou!");
                pontosJogador++;
            } else if (computador == 2) {
                alert("Computador ganhou!");
                pontosComputador++;
            } else {
                alert("Empate!");
            }
            break;
        case 2:
            if (computador == 1) {
                alert("Jogador ganhou!");
                pontosJogador++;
            } else if (computador == 0) {
                alert("Computador ganhou!");
                pontosComputador++;
            } else {
                alert("Empate!");
            }
            break;
    }
}
alert("Jogador: " + pontosJogador + " Computador: " + pontosComputador);
if (pontosJogador > pontosComputador) {
    alert("Jogador ganhou!");
}
if (pontosJogador < pontosComputador) {
    alert("Computador ganhou!");
}
if (pontosJogador == pontosComputador) {
    alert("Empate!");
}
