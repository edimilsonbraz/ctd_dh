public abstract class Conta {
    private int numero;
    private double saldo;
    private Cliente cliente;

    public Conta(int numero, double saldo, Cliente cliente) {
    }

    public abstract double depositar(double valor);

    public abstract double sacar(double valor);

    public abstract double transferir(Conta contaRemetente, Conta contaDestino);

    public abstract double extrato();
}