import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.Month;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class ContaPoupanca extends Conta {
    private Month mesAniversario;

    public ContaPoupanca(int numero, double saldo, Cliente cliente, Month mesAniversario) {
        super(numero, saldo, cliente);
        this.mesAniversario = mesAniversario;
    }

    public double rendaAniversario() {
        double renda = getSaldo() * 1.01;
        setSaldo(renda);
        return renda;
    }

    @Override
    public boolean depositar(double valor) {
        setSaldo(getSaldo() + valor);
        return true;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente");
        }
        return false;
    }

    @Override
    public boolean transferir(Conta contaDestino, double valor) {
        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        }
        return false;
    }

    @Override
    public void extrato() {
        System.out.println(
                new StringBuilder()
                        .append("********************************************************")
                        .append("\n")
                        .append("Cliente: ")
                        .append(getCliente().getNome())
                        .append("\n")
                        .append("Conta Poupanca: ")
                        .append(getNumero())
                        .append("\n")
                        .append("Saldo: ")
                        .append(getSaldo())
                        .append("\n")
                        .append("Mês de aniversário: ")
                        .append(this.mesAniversario)
                        .append("\n")
                        .append("********************************************************")


        );
    }
}