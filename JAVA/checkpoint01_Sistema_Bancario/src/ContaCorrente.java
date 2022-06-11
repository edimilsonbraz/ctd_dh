public class ContaCorrente extends Conta {
    private final double limite;

    public ContaCorrente(int numero, double saldo, Cliente cliente, double limite) {
        super(numero, saldo, cliente);
        this.limite = limite;
    }

    @Override
    public double depositar(double valor) {
        return 0;
    }

    @Override
    public double sacar(double valor) {
        return 0;
    }

    @Override
    public double transferir(Conta contaRemetente, Conta contaDestino) {
        return 0;
    }

    @Override
    public double extrato() {
        return 0;
    }
}