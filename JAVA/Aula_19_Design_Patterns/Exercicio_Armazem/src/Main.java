public class Main {
    public static void main(String[] args) {
        ProdutoFactory arm = ProdutoFactory.getInstance();
        Produto produto = arm.criarProduto(2.0, "CAIXA10X10");
        Produto produto2 = arm.criarProduto(3.0, "FUTEBOL");
        Produto produto3 = arm.criarProduto(1.0, "BOLATENIS");

        System.out.println(produto.calcularEspaco());
        System.out.println(produto2.calcularEspaco());
        System.out.println(produto3.calcularEspaco());

    }
}
