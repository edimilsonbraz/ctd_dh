public class Main {
    public static void main(String[] args) {
        ContaBanco nubank = new ContaBanco();
        System.out.println("Dados Bancários" );
        nubank.setNumConta(123);
        nubank.setDono("Jubileu");
        nubank.setTipo("cc");
        nubank.estadoAtual();
        System.out.println("|=========================|");

        nubank.abrirConta("cc");

        nubank.depositar(100.0f);
        System.out.println("Seu novo saldo é de R$ " + nubank.getSaldo());

        System.out.println("|=========================|");

        nubank.sacar(25.0f);
        System.out.println("Seu novo saldo é de R$ " + nubank.getSaldo());

        System.out.println("|=========================|");

        nubank.pagarMensal("cc");
        System.out.println("Taxa mensal debitada com sucesso!");
        System.out.println("Seu novo saldo é de R$ " + nubank.getSaldo());

        System.out.println("|=========================|");

        ContaBanco inter = new ContaBanco();
        inter.setNumConta(456);
        inter.setDono("Creusa");
        inter.setTipo("cp");
        inter.estadoAtual();

        System.out.println("|=========================|");

        inter.abrirConta("cp");
        System.out.println(inter.getDono() + " seu saldo é R$ " + inter.getSaldo());
        inter.depositar(150.0f);
        inter.estadoAtual();
        inter.pagarMensal("cp");
        System.out.println("Seu novo saldo é de R$ " + inter.getSaldo());
        inter.sacar(280.0f);
        System.out.println("Seu novo saldo é de R$ " + inter.getSaldo());
        inter.fecharConta();
        inter.estadoAtual();
    }
}
