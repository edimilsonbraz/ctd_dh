public class Cachorro extends Animal{
    public Cachorro(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return "Latiu";
    }

    @Override
    public String movimentacao() {
        return "Correu!";
    }
}