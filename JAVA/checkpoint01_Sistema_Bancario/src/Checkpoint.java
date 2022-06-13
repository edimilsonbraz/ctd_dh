import java.time.LocalDate;

import static java.util.Arrays.asList;

public class Checkpoint {
    public static void main(String[] args) {

        PessoaFisica clienteEdimilson = new PessoaFisica("Edmilson", "Rua dos Bobos, 171", "CPF", "RG");
        ContaCorrente nuCorrenteEdmilson = new ContaCorrente(123, 190, clienteEdimilson, 10.00);
        ContaPoupanca nuPoupancaEdmilson = new ContaPoupanca(456, 0, clienteEdimilson, LocalDate.now().getMonth());

        PessoaFisica clienteJonathas = new PessoaFisica("Jonathas", "Rua dos Bobos, 278", "CPF", "RG");
        ContaCorrente nuCorrenteJonathas = new ContaCorrente(789, 100, clienteJonathas, 1000.00);
        ContaPoupanca nuPoupancaJonathas = new ContaPoupanca(101112, 0, clienteJonathas, LocalDate.now().getMonth());

        PessoaJuridica clienteDigitalHouse = new PessoaJuridica("dh", "Rua dos Bobos, 161", "CNPJ", "IE");
        ContaCorrente nuCorrenteDh = new ContaCorrente(999, 0, clienteDigitalHouse, 10000.00);
        ContaPoupanca nuPoupancaDh = new ContaPoupanca(987112, 0, clienteDigitalHouse, LocalDate.now().getMonth());

        Banco nubank = new Banco("Nubank", asList(nuCorrenteEdmilson, nuCorrenteJonathas, nuCorrenteDh), asList(nuPoupancaEdmilson, nuPoupancaJonathas, nuPoupancaDh));

        ContaCorrente interCorrenteEdmilson = new ContaCorrente(123, 190, clienteEdimilson, 10.00);
        ContaPoupanca interPoupancaEdmilson = new ContaPoupanca(456, 0, clienteEdimilson, LocalDate.now().getMonth());

        ContaCorrente interCorrenteJonathas = new ContaCorrente(987, 100, clienteJonathas, 1000.00);
        ContaPoupanca interPoupancaJonathas = new ContaPoupanca(11289, 0, clienteJonathas, LocalDate.now().getMonth());

        ContaCorrente interCorrenteDh = new ContaCorrente(999, 0, clienteDigitalHouse, 10000.00);
        ContaPoupanca interPoupancaDh = new ContaPoupanca(987112, 0, clienteDigitalHouse, LocalDate.now().getMonth());


        Banco inter = new Banco("Inter", asList(interCorrenteEdmilson, interCorrenteJonathas, interCorrenteDh), asList(interPoupancaEdmilson, interPoupancaJonathas, interPoupancaDh));

        nubank.showContas();
        inter.showContas();

        System.out.println("OPERACOES");
        System.out.println("CONTA CORRENTE NUBANK COM SALDO:       " + nuCorrenteJonathas.getSaldo());
        nuCorrenteJonathas.depositar(100.00);
        System.out.println("DEPOIS DE DEPOSITAR 100 - SALDO:       " + nuCorrenteJonathas.getSaldo());
        nuCorrenteJonathas.sacar(5.00);
        System.out.println("DEPOIS DE SACAR 5.00 - SALDO:          " + nuCorrenteJonathas.getSaldo());
        nuCorrenteJonathas.extrato();

        System.out.println("OPERACOES");
        System.out.println("CONTA CORRENTE INTER COM SALDO:       " + interCorrenteJonathas.getSaldo());
        nuCorrenteJonathas.transferir(interCorrenteJonathas, 77.00);
        System.out.println("RECEBER TRANSFERENCIA 77.00 - SALDO:  " + interCorrenteJonathas.getSaldo());
        interCorrenteJonathas.extrato();

    }
}