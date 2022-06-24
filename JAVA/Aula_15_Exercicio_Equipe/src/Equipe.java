import java.util.Set;
import java.util.TreeSet;

public class Equipe {
    private String nome;
    private Set<Jogador> jogadores;

    public Equipe() {
        this.jogadores = new TreeSet<>();
    }

    public void addJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public Set<Jogador> getJogadores() {
        return jogadores;
    }

    public int getQuantidadeJogadoresLesionados() {
        int qtd = 0;
        for (Jogador jogador: getJogadores()) {
            if (jogador.getLesionado()) {
                qtd++;
            }
        }

        return qtd;
    }
}