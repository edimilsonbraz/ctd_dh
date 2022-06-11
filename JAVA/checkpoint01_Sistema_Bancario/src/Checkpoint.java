public class Checkpoint {
    public static void main(String[] args) {
        Banco nubank = new Banco();
        Cliente pessoaEdmilson = new PessoaFisica("Edmilson", "Rua dos Bobos, 171", "CPF", "RG");
        Conta contaEdmilson = new ContaCorrente(123, 0, pessoaEdmilson, 1000.00);
        nubank.addConta(contaEdmilson);

        Cliente pessoaJonathas = new PessoaFisica("Jonathas", "Rua dos Bobos, 278", "CPF", "RG");
        Conta contaJonathas = new ContaCorrente(789, 0, pessoaJonathas, 1000.00);
        nubank.addConta(contaJonathas);

        Cliente digitalHouse = new PessoaJuridica("dh", "Rua dos Bobos, 161", "CNPJ", "IE");
        Conta contaDh = new ContaCorrente(456, 0, digitalHouse, 10000.00);
        nubank.addConta(contaDh);

    }
}