public class Main {
    public static void main(String[] args) {
        Funcionario funcEdimilson = new Funcionario(
                "Edimilson",
                "Braz",
                30,
                "123456");

        Funcionario funcHeloisa = new Funcionario(
                "Heloisa",
                "Braz",
                18,
                "789654");

        PorHora contratoPorHora = new PorHora(
                12,
                "2022-02-01",
                true,
                funcEdimilson,
                Cargo.CHEFE,
                50,
                44 );

        Mensal contratoMensal = new Mensal(
                10,
                "2022-01-01",
                false,
                funcHeloisa,
                Cargo.FUNCIONARIO);

        System.out.println(contratoPorHora);

        try {
            contratoPorHora.apto();
        } catch (AptoException e) {
            throw new RuntimeException(e);
        }

        contratoMensal.ifChefe();
    }
}
