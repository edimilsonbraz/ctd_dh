public abstract class Empregado {
    private String nome;
    private String sobrenome;
    private String arquivo;

    public Empregado(String nome) {
        this.nome = nome;
    }

    public Empregado(String nome, String sobrenome, String arquivo){
        this(nome);
        this.sobrenome = sobrenome;
        this.arquivo = arquivo;
    }

    public abstract double calcularSalario(int dias);
}
