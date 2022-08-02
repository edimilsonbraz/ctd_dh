import org.junit.jupiter.api.Test;

public class FuncionarioTest {
    @Test
    void Calculos(){
        Funcionario funcionario = new Efetivo("Edimilson", "Braz", "123654", 5800.0,120.0,1200.0);
        funcionario.pagamentoSalario();

        funcionario = new Contratado("Diego", "Fernandes", "001238", 500.0, 6);
        funcionario.pagamentoSalario();
    }
}
