import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numero, double saldo, Cliente cliente, double limite) {
        super(numero, saldo, cliente);
        this.limite = limite;
    }

    @Override
    public boolean depositar(double valor) {
        setSaldo(getSaldo() + valor);
        return true;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= getSaldo() + this.limite) {
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
                        .append("Conta Corrente: ")
                        .append(getNumero())
                        .append("\n")
                        .append("Saldo: ")
                        .append(getSaldo())
                        .append("\n")
                        .append("Limite: ")
                        .append(this.limite)
                        .append("\n")
                        .append("********************************************************")

        );
    }
}