import java.util.Objects;

public class Mensal extends Contrato {
    private double salarioMensal;
    private int totalHora;

    public Mensal(int duracaoContrato, String dataInicio, boolean registroMT, Funcionario funcionario, Cargo cargo) {
        super(duracaoContrato, dataInicio, registroMT, funcionario, cargo);
    }

    public void ifChefe() {
        if (Objects.equals(this.getCargo(), Cargo.CHEFE)) {
            System.out.println("Chefe");
        }
    }

}
