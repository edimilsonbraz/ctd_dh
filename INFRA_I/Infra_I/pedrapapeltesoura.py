# encoding:UTF-8
import random

while True:
    aleatorio = random.randrange(1, 6)
    escolhaPc = ""
    print("1)Pedra")
    print("2)Papel")
    print("3)Tesoura")
    print("4)Largato")
    print("5)Spock")
    print("6)Sair do Programa")
    opcao = int(input("O que você escolhe: "))

    if opcao == 1:
        escolhaUsuario = "pedra"
    elif opcao == 2:
        escolhaUsuario = "papel"
    elif opcao == 3:
        escolhaUsuario = "tesoura"
    elif opcao == 4:
        escolhaUsuario = "largato"
    elif opcao == 5:
        escolhaUsuario = "spock"
    elif opcao == 6:
        print("Nos vemos!")
        break
    else:
        print("Valor Invalido")
        continue

    print("Tua escolha: ", escolhaUsuario)
    if aleatorio == 1:
        escolhaPc = "pedra"
    elif aleatorio == 2:
        escolhaPc = "papel"
    elif aleatorio == 3:
        escolhaPc = "tesoura"
    elif aleatorio == 4:
        escolhaPc = "largato"
    elif aleatorio == 5:
        escolhaPc = "spock"
    print("PC escolheu: ", escolhaPc)
    print("...")

    if escolhaPc == "pedra" and escolhaUsuario == "papel": #user ganhou
        print("Ganhou, papel cobre pedra")
    elif escolhaPc == "papel" and escolhaUsuario == "tesoura": #user ganhou
        print("Ganhou, tesoura corta papel")
    elif escolhaPc == "tesoura" and escolhaUsuario == "pedra": #user ganhou
        print("Ganhou, pedra amassa tesoura")
    elif escolhaPc == "largato" and escolhaUsuario == "pedra":  #user ganhou
        print("Ganhou, pedra esmaga largato")
    elif escolhaPc == "largato" and escolhaUsuario == "tesoura":  #user ganhou
        print("Ganhou, tesoura decapta largato")
    elif escolhaPc == "papel" and escolhaUsuario == "largato": #user ganhou
        print("Ganhou, largato come papel")
    elif escolhaPc == "tesoura" and escolhaUsuario == "spock": #user ganhou
        print("Ganhou, spock quebra tesoura")
    elif escolhaPc == "spock" and escolhaUsuario == "papel": #user ganhou
        print("Ganhou, papel refuta spock")
    elif escolhaPc == "pedra" and escolhaUsuario == "spock": #user ganhou
        print("Ganhou, spock vaporiza pedra")
    elif escolhaPc == "spock" and escolhaUsuario == "largato": #user ganhou
        print("Ganhou, largato envenena spock")

    if escolhaUsuario == "pedra" and escolhaPc == "papel": #use perder
        print("Perdeu, papel cobre pedra")
    elif escolhaUsuario == "papel" and escolhaPc == "tesoura": #user perder
        print("Perdeu, tesoura corta papel")
    elif escolhaUsuario == "tesoura" and escolhaPc == "pedra": #user perder
        print("Perdeu, pedra amassa tesoura")
    elif escolhaUsuario == "largato" and escolhaPc == "pedra": #user perder
        print("Perdeu, pedra esmaga largato")
    elif escolhaUsuario == "largato" and escolhaPc == "tesoura": #user perder
        print("Perdeu, tesoura decapta largato")
    elif escolhaUsuario == "papel" and escolhaPc == "largato": #user perder
        print("Perdeu, largato come spock")
    elif escolhaUsuario == "tesoura" and escolhaPc == "spock": #user perder
        print("Perdeu, spock quebra tesoura")
    elif escolhaUsuario == "spock" and escolhaPc == "papel": #user perder
        print("Perdeu, papel refuta spock")
    elif escolhaUsuario == "pedra" and escolhaPc == "spock": #user perder
        print("Perdeu, spock vaporiza pedra")
    elif escolhaUsuario == "spock" and escolhaPc == "largato": #user perder
        print("Perdeu, largato envenena spock")
    elif escolhaPc == escolhaUsuario:
        print("Empate")
    again = input("Jogar novamente? s/n: ")
    if 's' in again:
        continue
    elif 'n' in again:
        print("Nos vemos!")
        break
    else:
        print(" Valor Invalido")
