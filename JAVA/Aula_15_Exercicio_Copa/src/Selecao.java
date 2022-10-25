import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Selecao {
    private final String nome;
    private final TreeSet<Jogador> jogadores;

    public Selecao(String nome) {
        this.nome = nome;
        this.jogadores = new TreeSet<>();
    }

    public void addJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public List<Jogador> obterReservas() throws QtdJogadorException {
        if (jogadores.size() != 23) {
            throw new QtdJogadorException();
        }

        List<Jogador> reservas = new ArrayList<>();
        int i = 1;
        for (Jogador jogador: jogadores) {
            if (i > 18) {
                reservas.add(jogador);
            }
            ++i;
        }

        return reservas;
    }

    public int qtdJogador(String posicao) {
        int qtd = 0;
        for (Jogador jogador: jogadores) {
            if (jogador.getPosicao().equals(posicao)) {
                qtd++;
            }
        }

        return qtd;
    }

    @Override
    public String toString() {
        return "Selecao{" +
                "nome='" + nome + '\'' +
                ", jogadores=" + jogadores +
                '}';
    }
}
