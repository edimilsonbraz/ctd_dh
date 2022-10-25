import java.util.Iterator;

class Main {
    public static void main(String[] args) {
        Jogador thiago = new Jogador("Thiago", 10, false);
        Jogador armando = new Jogador("Armando", 11, true);
        Jogador pedro = new Jogador("Pedro", 9, false);

        Equipe equipe = new Equipe();
        equipe.addJogador(thiago);
        equipe.addJogador(armando);
        equipe.addJogador(pedro);

        Iterator<Jogador> jogInterator = equipe.getJogadores().iterator();
        while (jogInterator.hasNext()) {
            System.out.println(jogInterator.next());
        }

        for (Jogador j: equipe.getJogadores()) {
            System.out.println(j);
        }
    }
}