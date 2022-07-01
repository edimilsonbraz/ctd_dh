import java.util.List;

public class Reparacao implements Estado {
    private Reparo reparo;

    public Reparacao(Reparo reparo) {
        this.reparo = reparo;
    }

    @Override
    public void valorOrcamento(double valor) {
        throw new IllegalStateException("Valor já foi informado");
    }

    @Override
    public void somaPecaReposicao(List<PecaReposicao> pecas) {
        double soma = 0;
        for(PecaReposicao peca : pecas) {
            soma += peca.getValor();
        }
        reparo
    }

    @Override
    public void mudarEndereco(String endereco) {

    }

    @Override
    public void mudarEstado() {
        reparo.setEstado(new Envio(reparo));
    }
}
