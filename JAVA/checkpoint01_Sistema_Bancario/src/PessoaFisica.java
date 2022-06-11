public class PessoaFisica extends Cliente {
    private String cpf;
    private String rg;

    public PessoaFisica(String nome, String endereco, String cpf, String rg) {
        super(nome, endereco);
        this.rg = rg;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}