import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Conta addConta(Conta conta) {
        contas.add(conta);
        return conta;
    }

    public List<Conta> readContas() {
        return contas;
    }

    public Conta updateConta(Conta contaAntiga, Conta contaAtual) {
        contas.remove(contaAntiga);
        contas.add(contaAtual);
        return contaAtual;
    }

    public void deleteConta(Conta conta) {
        contas.remove(conta);
    }
}