import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Conta {
    private int numero;
    private double saldo;
    private Cliente cliente;

    public abstract boolean depositar(double valor);

    public abstract boolean sacar(double valor);

    public abstract boolean transferir(Conta contaDestino, double valor);

    public abstract void extrato();
}