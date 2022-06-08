public abstract class Animal {
    private String nome;
    private Integer idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract String emitirSom();
    public abstract String movimentacao();


}