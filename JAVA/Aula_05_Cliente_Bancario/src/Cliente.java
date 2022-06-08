public class Cliente {
    private Integer numeroCliente;
    private String nome;
    private Double divida;

    public Cliente(Integer num, String cliente) {
        this.numeroCliente = num;
        this.nome = cliente;
        this.divida = 0.0;
    }

    public void setNumeroCliente(Integer numero) {
        this.numeroCliente = numero;
    }

    public Integer getNumeroCliente() {
        return numeroCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    protected void setDivida(Double valor) {
        this.divida = valor;
    }

    public Double getDivida() {
        return divida;
    }

    public void aumentarDivida(Double valor) {
        setDivida(this.divida + valor);
    }

    public void pagarDivida(Double valor) {
        if (this.divida == 0) {
            System.out.println("Sua divida já está paga!");
            return;
        }

        if (this.divida < valor) {
            System.out.println("Valor superior, sua divida é de " + this.divida);
            return;
        }

        setDivida(this.divida - valor);
    }
}