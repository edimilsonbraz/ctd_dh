import java.util.List;

public class Finalizado implements Estado{
    private Reparo reparo;
    public Finalizado(Reparo reparo){
        this.reparo = reparo;
    }

    @Override
    public void valorOrcamento(double valor) {
        throw new IllegalStateException("Você não pode mudar o valor");
    }

    @Override
    public void somaPecaReposicao(List<PecaReposicao> pecas) {
        throw new IllegalStateException("Você não pode mudar a soma das peças");
    }

    @Override
    public void mudarEndereco(String endereco) {
        throw new IllegalStateException("Você não pode mudar o endereço");
    }

    @Override
    public void mudarEstado() {
        throw new IllegalStateException("Acabou! Você não pode mudar de estado");
    }
}
