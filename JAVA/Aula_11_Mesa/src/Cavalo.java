public class Cavalo extends Animal{
    public Cavalo(String nome, Integer idade) {

        super(nome, idade);
    }

    @Override
    public String emitirSom() {

        return "Relincha!";
    }

    @Override
    public String movimentacao() {

        return "Trota!";
    }
}