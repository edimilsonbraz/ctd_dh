import java.time.LocalDate;

public class ContaPoupanca extends Conta {
    private LocalDate dataAniversario;

    public ContaPoupanca(int numero, double saldo, Cliente cliente) {
        super(numero, saldo, cliente);
    }

    public double rendaAniversario(Conta conta) {
        return 0;
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
