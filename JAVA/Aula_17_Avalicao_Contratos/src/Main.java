public class Main {
    public static void main(String[] args) {
        Funcionario funcEdimilson = new Funcionario("Edimilson", "Braz", 30, "123456");
        PorHora contratoPorHora001 = new PorHora(12, "2022-02-01", false, funcEdimilson, 50, 44 );

        System.out.println(contratoPorHora001);



    }
}
