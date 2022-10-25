import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfiguracaoJDBC {
    private  String jdbcDriver;
    private  String dbURL;
    private  String nomeUsuario;
    private String senha;

    public ConfiguracaoJDBC(String jdbcDriver, String dbURL, String nomeUsuario, String senha) {
        this.jdbcDriver = jdbcDriver;
        this.dbURL = dbURL;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public ConfiguracaoJDBC() {
        this.jdbcDriver = "org.h2.Driver";
        this.dbURL = "jdbc:h2:mem:aluno;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'create.sql'";
        this.nomeUsuario = "sa";
        this.senha = "";
    }
    public Connection conectarComBancoDeDados() {
        try{
            Connection connection = DriverManager.getConnection(dbURL);
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }


}
