public class EmpregadoRelacaoDep extends Empregado {

    private double salarioMensal;

    public EmpregadoRelacaoDep(String nome) {
        super(nome);
    }

    public EmpregadoRelacaoDep(String nome, String sobrenome, String arquivo) {
        super(nome, sobrenome, arquivo);
    }



    @Override
    public double calcularSalario(int dias) {
        return (salarioMensal/30) * dias;
    }
}
