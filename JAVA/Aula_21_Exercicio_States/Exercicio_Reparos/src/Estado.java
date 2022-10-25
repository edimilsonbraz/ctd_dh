import java.util.List;

public interface Estado {
    void valorOrcamento(double valor);
    void somaPecaReposicao(List<PecaReposicao> pecas);
    void mudarEndereco(String endereco);
    void mudarEstado();
}
