public class Preguica extends Animal{
    public Preguica(String nome, int idade) {

        super(nome, idade);
    }

    @Override
    public String emitirSom() {

        return "kkkkkkk";
    }

    @Override
    public String movimentacao() {

        return "Se movimenta lentamente!";
    }

    public String subirEmArvore(){
        return "Sobe em arvore para descançar!";
    }


}
