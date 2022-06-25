import java.time.LocalDate;

public class Mensal extends Contrato {
    private double salarioMensal;
    private int totalHora;
    private String cargo;

    public Mensal(int duracaoContrato, LocalDate dataInicio, boolean registroMT) {
        super(duracaoContrato, dataInicio, registroMT);
    }

    @Override
    public boolean apto() {
        return false;
    }

    private boolean isChefe() {
        return this.cargo.equals("chefe");
    }

}
