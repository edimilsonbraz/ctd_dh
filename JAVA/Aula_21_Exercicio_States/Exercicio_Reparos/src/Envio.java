import java.util.List;

public class Envio implements Estado{
    private Reparo reparo;

    public Envio(Reparo reparo) {
        this.reparo = reparo;
    }

    @Override
    public void valorOrcamento(double valor) {
        throw new IllegalStateException("Orçamento ja foi informado!");
    }

    @Override
    public void somaPecaReposicao(List<PecaReposicao> pecas) {
        throw new IllegalStateException("Soma de peças já foi informado!");
    }

    @Override
    public void mudarEndereco(String endereco) {
        reparo.setEndereco(endereco);
    }

    @Override
    public void mudarEstado() {
        reparo.setEstado(new Finalizado(reparo));
    }
}
