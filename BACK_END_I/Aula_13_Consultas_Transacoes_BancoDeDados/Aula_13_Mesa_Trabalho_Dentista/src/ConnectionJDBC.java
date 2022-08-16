import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionJDBC {

    public static Connection getConnection() throws Exception {
        //Carregando o Driver H2
        Class.forName("org.h2.Driver");

        //Configurando a Conexão
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

    }
}
