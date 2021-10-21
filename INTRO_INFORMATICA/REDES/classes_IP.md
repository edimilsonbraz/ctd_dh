# Endereço IP - Classfull

**Unicast**(Transmissão de 1:1) --> Ex: Ligação Telefonica.
**Brodcast**(Transmissão de 1:todos) --> Ex: Transm de Tv aberta.
**Multicast**(Transmissão de 1: pra determinado grupo) --> Ex:Transm de Tv fechada.


## CLASSES_IP

A, B, C --> Unicast
D       --> Multicast
E       --> Reservada

A --> 00000000 até 01111111 = 0 até 127 
Mascara: 255.0.0.0

B --> 10000000 até 10111111 = 128 até 191
Mascara: 255.255.0.0

C --> 11000000 até 11011111 = 192 até 223
Mascara: 255.255.255.0


IP: 192.168.1.201
1) Qual classe ? --> classe C
2) Qual é a mascara ? --> 255.255.255.0
3) End. Rede ? --> 192.168.1.0
4) Broadcast --> 192.168.1.255 
5) Primeiro IP válido ? --> 192.168.1.1
6) Ultimo IP válido ? --> 192.168.1.254