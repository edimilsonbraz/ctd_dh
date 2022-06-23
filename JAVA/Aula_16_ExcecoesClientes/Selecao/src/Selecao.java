import java.util.ArrayList;
import java.util.List;

public class Selecao {
    private String nome;
    private List<Jogador> jogadores;

    public Selecao(List<Jogador> jogadores){
        this.jogadores = jogadores;
        this.nome = "Selecao Fantasma";
    }

    public Selecao(String nome){
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    public void addJogador(Jogador jogador){
        jogadores.add(jogador);
    }

}
