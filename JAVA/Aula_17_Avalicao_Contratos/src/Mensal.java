public class Mensal extends Contrato {
    private double salarioMensal;
    private int totalHora;
    private String cargo;

    public Mensal(int duracaoContrato, String dataInicio, boolean registroMT, Funcionario funcionario) {
        super(duracaoContrato, dataInicio, registroMT, funcionario);
    }

    @Override
    public boolean apto() {
        return false;
    }

    private boolean isChefe() {
        return this.cargo.equals("chefe");
    }

}
