public class Preguica extends Animal{
    public Preguica(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return "kkkkkkk";
    }

    @Override
    public String movimentacao() {
        return "Escalou na arvore!";
    }
}
