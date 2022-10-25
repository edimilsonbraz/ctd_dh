public abstract class OfertaAcademica {
    private final String nome;
    private String descricao;

    public OfertaAcademica(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    abstract double calcularPreco();
}
