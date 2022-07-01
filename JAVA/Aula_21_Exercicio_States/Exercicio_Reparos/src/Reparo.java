public class Reparo {
    private String nome;
    private double custo;
    private String endereco;
    private Estado estado;

    public Reparo(String nome, double custo) {
        this.estado = new Orcamento(this);
        this.nome = nome;
        this.custo = 0;

    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
