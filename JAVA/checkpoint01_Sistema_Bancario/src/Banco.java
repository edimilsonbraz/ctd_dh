import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Banco {
    private String nomeBanco;
    private List<ContaCorrente> corrente = new ArrayList<>();
    private List<ContaPoupanca> poupanca = new ArrayList<>();

    public int createConta(ContaCorrente conta) {
        corrente.add(conta);
        return conta.getNumero();
    }

    public int createConta(ContaPoupanca conta) {
        poupanca.add(conta);
        return conta.getNumero();
    }


    public void deleteConta(ContaCorrente conta) {
        corrente.remove(conta);
    }

    public void deleteConta(ContaPoupanca conta) {
        poupanca.remove(conta);
    }

    public void showContas() {
        System.out.println("Contas Correntes do banco: " + this.nomeBanco);
        for (ContaCorrente conta : corrente) {
            conta.extrato();
        }
        System.out.println("Contas Poupancas do banco: " + this.nomeBanco);
        for (ContaPoupanca conta : poupanca) {
            conta.extrato();
        }
    }
}