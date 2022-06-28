public class EmpregadoRelacaoDep extends Empregado {

    private double salarioMensal;

    public EmpregadoRelacaoDep(String nome) {
        super(nome);
    }

    public EmpregadoRelacaoDep(String nome, String sobrenome, String arquivo) {
        super(nome, sobrenome, arquivo);
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }


    @Override
    public double calcularSalario(int dias) {
        return (salarioMensal/30) * dias;
    }
}
