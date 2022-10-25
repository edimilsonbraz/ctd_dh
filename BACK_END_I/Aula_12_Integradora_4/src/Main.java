import org.apache.log4j.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

    //Instrução para pegar a tabela Usuario, caso já existam criar uma nova tabela
    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Usuario; CREATE TABLE Usuario"
            +"("
            +"id INT PRIMARY KEY, "
            +"Primeiro_Nome varchar(100) NOT NULL,"
            +"Sobrenome varchar(100) NOT NULL,"
            +"Idade INT NOT NULL"
            +")";

    //Instruções para inserir dados na tabela Usuario
    private static final String sqlInsert1 = "INSERT INTO Usuario(id, Primeiro_Nome, Sobrenome, Idade)" +
            "Values(1, 'Maria', 'Almeida', 50)";
    private static final String sqlInsert2 = "INSERT INTO Usuario(id, Primeiro_Nome, Sobrenome, Idade)" +
            "Values(2, 'Jose', 'Silva', 40)";
    private static final String sqlInsert3 = "INSERT INTO Usuario(id, Primeiro_Nome, Sobrenome, Idade)" +
            "Values(3, 'Juliana', 'Barbosa', 20)";

    //Instrução para excluir um registro na Tabela Usuario
    private static final String sqlDelete = "DELETE FROM Usuario WHERE id=2";

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        Connection connection = null;

        try{
            connection = getConnection();
            Statement statement = connection.createStatement();

            //
            statement.execute(sqlCreateTable);

            //Execução da instrução para inserir no banco
            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);

            //Execução da instrução para excluir um registro da tabela
            statement.execute(sqlDelete);

            //Registra o log do Usuario que foi excluido da tabela
            logger.info("Excluido o usuário com o ID 2");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(connection == null){
                return;
            }
            connection.close();
        }
    }

    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test","sa","");
    }


}
