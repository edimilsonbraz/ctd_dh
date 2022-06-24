public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Cliente cliente = new Cliente(
                "Teste",
                "Sobrenome",
                "RG",
                100
        );

        try {
            cliente.comprar(1000.50);
            cliente.pagarDivida(10);
        } catch (DividaException | LimiteException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Acabou");
        }
    }
}
