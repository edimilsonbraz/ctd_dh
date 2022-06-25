import java.util.Random;

class Main {
    public static void main(String[] args) {
        String[] nomeJogadores = {"Alberto", "Bruno", "Pedro", "João", "José", "Ronaldo", "Neymar"};
        String[] posicoes = {"Goleiro", "Defensor", "Meio Campista", "Atacante"};

        Selecao selecao = new Selecao("Brasileira");
        int i = 1;
        while (i < 24) {
            selecao.addJogador(
                    new Jogador(
                            nomeJogadores[new Random().nextInt(nomeJogadores.length)],
                            i,
                            posicoes[new Random().nextInt(posicoes.length)]
                    )
            );
            i++;
        }

        try {
            System.out.println(selecao.obterReservas());
        } catch (QtdJogadorException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println(selecao.qtdJogador("Atacante"));
    }
}