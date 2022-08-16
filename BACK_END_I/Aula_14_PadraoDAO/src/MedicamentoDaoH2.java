import java.sql.Connection;
import java.sql.Statement;
import java.util.logging.Logger;

public class MedicamentoDaoH2 implements IDao<Medicamento>{
    private ConfiguracaoJDBC configuracaoJDBC;

    final static Logger log = Logger.getLogger(String.valueOf(MedicamentoDaoH2.class));

    public MedicamentoDaoH2(ConfiguracaoJDBC configuracaoJDBC){
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Medicamento salvar(Medicamento medicamento) {
        log.info("Registrando um novo medicamento: " + medicamento.toString());
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("INSERT INTO medicamentos(nome, laboratorio, quantidade, preco) values('%s', '%s', '%s', '%s'))

        try{
            statement = 
        }
    }

    @Override
    public Medicamento buscar(Integer id) {
        return null;
    }
}
