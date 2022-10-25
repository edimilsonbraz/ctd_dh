public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.setSaldo(0f);
        this.setStatus(false);
    }

    public void estadoAtual(){
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono " + this.getDono());
        System.out.println("Saldo R$ " + this.getSaldo());
        System.out.println("Statatus: " + this.getStatus());
    }

    public void abrirConta(String tipo){
        setTipo(tipo);
        setStatus(true);
        if(tipo.equals("cc")){
            this.setSaldo(50.0f);
            System.out.println("Conta aberta com sucesso!" + "seu saldo é de R$ " + getSaldo() + " reais");
        }else if(tipo.equals("cp")){
            this.setSaldo(150.0f);
        }
    }

    public void depositar(float valor){
        if(getStatus()){
            setSaldo(getSaldo() + valor);
            System.out.println("Deposito de " + valor +  " efetuado com sucesso!");
        }else{
            System.out.println("Desculpe, mas você não tem conta aberta conosco!");
        }
    }

    public void sacar(float valor){
        if(getStatus()){
            if(getSaldo() >= valor){
                setSaldo(getSaldo() - valor);
                System.out.println("Saque realizado com sucesso Sr " + getDono());
            }else{
                System.out.println("Saldo insuficiente Sr ");
            }
        }else{
            System.out.println("Impossível sacar...");
        }
    }

    public void pagarMensal(String tipoConta){
        var txcc = 12.0f;
        var txcp = 20.0f;
        if(getStatus() && tipoConta.equals("cc")) {
            if(getSaldo() > txcc){
                setSaldo(getSaldo() - txcc);
            }else if(getSaldo() < txcc){
                System.out.println("Saldo insuficiente");
            }

        }else if (getStatus() && tipoConta.equals("cp")){
            if(getSaldo() > txcp){
                setSaldo(getSaldo() - txcp);
            }else if(getSaldo() < txcp){
                System.out.println("Saldo insuficiente");
            }
        }
    }

    public void fecharConta(){
        if(getSaldo() > 0) {
            System.out.println(getDono() + " A conta não pode ser fechada pois dinheiro em conta!");
        }else if(getSaldo() < 0){
            System.out.println("Regularize seus debitos antes de encerrar a conta");
        }else{
            setStatus(false);
            System.out.println("Conta encerrada com sucesso");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
