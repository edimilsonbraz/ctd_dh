import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexaoDB {
    public static void main(String[] args) throws Exception {

        //Carregando o Driver H2
        Class.forName("org.h2.Driver").newInstance();

        //Configurando a Conexão
        Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

        //Executa e envia as instruções SQL para o Banco de dados
        Statement statement = connection.createStatement();

        String sqlCreateTable = "DROP TABLE IF EXISTS Teste; CREATE TABLE Teste(Id INT PRIMARY KEY, Nome  VARCHAR(255))";

        //Executa a noss Query
        statement.execute(sqlCreateTable);

        String sqlInsert1 = "INSERT INTO Teste(Id, Nome) VALUES (1, 'Edimilson')";
        String sqlInsert2 = "INSERT INTO Teste(Id, Nome) VALUES (2, 'Maykon')";
        statement.execute(sqlInsert1);
        statement.execute(sqlInsert2);

        //Ver o conteúdo da Tabela
        String sqlRead = "SELECT * FROM Teste";
        ResultSet resultSet = statement.executeQuery(sqlRead);

        //As infor chegam tipo array por isso precisamos percorrer com While
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2));
        }

    }
}
