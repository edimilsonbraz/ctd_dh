import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class FilialDaoH2  implements IDao<Filial>{

    private ConfiguracaoJDBC configuracaoJDBC;

    final static Logger log = Logger.getLogger(String.valueOf(FilialDaoH2.class));

    //Construtor
    public FilialDaoH2(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }


    @Override
    public Filial salvar(Filial filial) {
       //Registrando a execução de cada operação com Log4J
       log.info("Registrando uma nova Filial no sistema: " + filial.toString());

        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String querySalvar = String.format("INSERT INTO filial(nome, rua, numero, cidade, estado, is5Estrelas) " +
                        "values ('%s','%s','%s','%s', '%s', '%s')",
                filial.getNome(), filial.getRua(), filial.getNumero(), filial.getCidade(), filial.getEstado(), filial.getIs5Estrelas());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(querySalvar, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();

            if(keys.next()){
                filial.setId(keys.getInt(1));
                statement.close();
                connection.close();
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return filial;
    }

}
