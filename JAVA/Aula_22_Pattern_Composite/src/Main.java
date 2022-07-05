public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        Produto refri = new Produto("Refri", 7.5);
        Produto batata = new Produto("Batata", 4.98);
        Produto hamburguer = new Produto("Hamburguer", 8.75);

        Combo combo = new Combo("Combo feliz");
        combo.addItens(refri);
        combo.addItens(batata);
        combo.addItens(hamburguer);

        carrinho.addItem(refri);
        carrinho.addItem(combo);
        System.out.println(carrinho.calcularValorTotal());
    }
}
