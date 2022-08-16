import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Main {
    private static final String sqlCreate = "DROP TABLE IF EXISTS Usuario; CREATE TABLE Usuario" +
            "(" + "id INT PRIMARY KEY," +
            "Primeiro_Nome VARCHAR(100) NOT NULL," +
            "Sobrenome VARCHAR(100) NOT NULL," +
            "Idade INT NOT NULL" +
            ")";

    private static final String sqlInsert = "INSERT INTO Conta(id, nome, numeroConta, saldo) VALUES(?,?,?,?);";

    private static final String sqlUpdate = "UPDATE Conta SET saldo = ? WHERE id = ?;";

    public static void main(String[] args) throws Exception {
        Conta conta = new Conta(1, "Edimilson", "070016578-6", 30);

        Connection connection = null;

        try {
            connection = ConnectionJDBC.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreate);

            PreparedStatement preparedStatementInsert = connection.prepareStatement(sqlInsert);
            preparedStatementInsert.setInt(1, conta.getId());
            preparedStatementInsert.setString(2, conta.getNome());
            preparedStatementInsert.setString(3, conta.getNumConta());
            preparedStatementInsert.setDouble(4, conta.getSaldo());
            preparedStatementInsert.execute();

            PreparedStatement preparedStatementUpdate = connection.prepareStatement(sqlUpdate);
            preparedStatementUpdate.setDouble(1, conta.aumentarSaldo(10));
            preparedStatementUpdate.setInt(2, conta.getId());
            preparedStatementUpdate.execute();

            connection.setAutoCommit(false);

            PreparedStatement preparedStatementUpdate2 = connection.prepareStatement(sqlUpdate);
            preparedStatementUpdate2.setDouble(1, conta.aumentarSaldo(15));
            preparedStatementUpdate2.setInt(2, conta.getId());
            preparedStatementUpdate2.execute();

            connection.commit();
            connection.setAutoCommit(true);

        }catch (Exception e){
            e.printStackTrace();
            connection.rollback();
        }finally {
            connection.close();
        }
    }
}
