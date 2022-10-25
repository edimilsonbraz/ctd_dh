public class Contratado extends Funcionario{
    private double valorHora;
    private int horas;

    public Contratado(
            String nome,
            String sobrenome,
            String numeroConta,
            double valorHora,
            int horas) {
        super(nome, sobrenome, numeroConta);
        this.valorHora = valorHora;
        this.horas = horas;
    }

    @Override
    public double calcularSaldo() {
        return valorHora*horas;
    }

    @Override
    public void imprimirRecibo(double quantia) {
        System.out.println("\n Gerado um recibo -- Funcionário CONTRATADO");
    }

    @Override
    public void depositar(double quantia) {
        System.out.println("\n Foi depositado uma quantia de: " + quantia);
    }
}
