public abstract class Contrato {
    private int duracaoContrato;
    private String dataInicio;
    private boolean registroMT;
    Funcionario funcionario;
    private Cargo cargo;

    public Contrato(int duracaoContrato, String dataInicio, boolean registroMT, Funcionario funcionario, Cargo cargo) {
        this.duracaoContrato = duracaoContrato;
        this.dataInicio = dataInicio;
        this.registroMT = registroMT;
        this.funcionario = funcionario;
        this.cargo = cargo;
    }

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

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    public void apto() throws AptoException {
        if (this.registroMT == false) {
            throw new AptoException();
        } else {
            System.out.println("Registrado no MT");
        }
    }

}
