public class Main {
    public static void main(String[] args) {
        FacadeDesconto facadeDesconto = new FacadeDesconto();

        Cartao cartao = new Cartao("334465285164475", "Star Bank");
        Produto produto = new Produto("ervilha", "Lata");

        System.out.println("\nDesconto: " + facadeDesconto.desconto(cartao, produto, 1));


    }
}
