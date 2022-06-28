public class EmpregadoContratado extends Empregado {
    private double valorHora;
    private double imposto;

    public EmpregadoContratado(String nome) {
        super(nome);
    }

    public EmpregadoContratado(String nome, String sobrenome, String arquivo) {
        super(nome, sobrenome, arquivo);
    }

    @Override
    public double calcularSalario(int dias) {
        return (8 * dias) - (imposto * dias);
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
