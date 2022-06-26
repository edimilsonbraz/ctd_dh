public abstract class Contrato {
    private int duracaoContrato;
    private String dataInicio;
    private boolean registroMT;
    Funcionario funcionario;

    public Contrato(int duracaoContrato, String dataInicio, boolean registroMT, Funcionario funcionario) {
        this.duracaoContrato = duracaoContrato;
        this.dataInicio = dataInicio;
        this.registroMT = registroMT;
        this.funcionario = funcionario;
    }

    public abstract boolean apto() throws AptoException;

    public boolean getRegistroMT() {
        return registroMT;
    }
    public void setRegistroMT(boolean registroMT) {
        this.registroMT = registroMT;
    }
    public int getDuracaoContrato() {
        return duracaoContrato;
    }
    public void setDuracaoContrato(int duracaoContrato) {
        this.duracaoContrato = duracaoContrato;
    }
    public String getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Funcionario getFuncionario() {
        return this.funcionario;
    }

}
