package com.odontologica.clinica.dao.impl;

import com.odontologica.clinica.dao.ConfiguracaoJDBC;
import com.odontologica.clinica.dao.IDao;
import com.odontologica.clinica.model.Dentista;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.apache.logging.log4j.LogManager.getLogger;

@Configuration
public class DentistaDAOH2 implements IDao<Dentista> {

    private ConfiguracaoJDBC configuracaoJDBC;

    final static Logger log = getLogger(DentistaDAOH2.class);
    @Override
    public Dentista salvar(Dentista dentista) throws SQLException {
        log.info("Abrindo conexão");
        String SQLInsert = String.format("INSERT INTO dentista (nome, sobrenome, matricula)"  +
                        "VALUES ('%s', '%s', '%s')", dentista.getNome(), dentista.getSobrenome(), dentista.getMatricula());
        Connection connection = null;

        try {
            log.info("Salvando dentista: " + dentista.getNome());
            configuracaoJDBC = new ConfiguracaoJDBC();
            connection = configuracaoJDBC.getConnection();
            Statement stmt = connection.createStatement();
            stmt.execute(SQLInsert,Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = stmt.getGeneratedKeys();

            if(resultSet.next()){
                dentista.setId(resultSet.getInt(1));
            }
        }catch (SQLException e){
            e.printStackTrace();
            log.error("Erro ao tentar inserir o dentista: " + e.getMessage());
        }finally {
            log.info("Fechando a conexão");
            connection.close();
        }
        return dentista;
    }

    @Override
    public void alterar(Dentista dentista) throws SQLException {
        String SQLUpdate = String.format("UPDATE dentista set nome, sobrenome, matricula = '%s', '%s', '%s' where id = '%s';",
                dentista.getNome(), dentista.getSobrenome(), dentista.getMatricula(), dentista.getId());
        Connection connection = null;

        try {
            log.info("Alterando os dados do dentista" + dentista.getId());
            configuracaoJDBC = new ConfiguracaoJDBC();
            connection = configuracaoJDBC.getConnection();
            Statement stmt = connection.createStatement();
            stmt.execute(SQLUpdate);

        }catch (Exception e) {
            e.printStackTrace();
            log.error("Erro ao tentar alterar dados do dentista");
        }finally {
            log.info("Fechando a conexão com o banco");
            connection.close();
        }
    }

    @Override
    public Optional<Dentista> buscarPorId(int id) throws SQLException {
        log.debug("Abrindo uma conexão no banco");
        Connection connection = null;
        Statement stmt = null;
        String query = String.format("SELECT * FROM dentista where id= %s ", id);
        Dentista dentista = null;

        try {
            configuracaoJDBC = new ConfiguracaoJDBC();
            connection = configuracaoJDBC.getConnection();
            log.debug("Buscando dentista por id: " + id);
            stmt = connection.createStatement();
            ResultSet resultado = stmt.executeQuery(query);

            while (resultado.next()){
                dentista = criarObjetoDentista(resultado);
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }finally {
            log.debug("Fechando a conexão com o banco");
            stmt.close();
        }
        return dentista != null ? Optional.of(dentista) : Optional.empty();
    }

    @Override
    public List<Dentista> buscarTodos() throws SQLException {
        log.debug("Abrindo uma conexão no banco");
        Connection connection = null;
        Statement stmt = null;
        String query = "SELECT * FROM dentista";
        List<Dentista> dentistas = new ArrayList<>();

        try {
            configuracaoJDBC = new ConfiguracaoJDBC();
            connection = configuracaoJDBC.getConnection();
            stmt = connection.createStatement();
            ResultSet resultado = stmt.executeQuery(query);
            log.debug("Buscando todos os dentista cadastrados no DB");

            while(resultado.next()){
                dentistas.add(criarObjetoDentista(resultado));
            }

        }catch (SQLException  throwables){
            throwables.printStackTrace();
        }finally {
            log.debug("Fechando a conexão com o banco");
            stmt.close();
        }
        return dentistas;
    }

    @Override
    public void excluir(int id) throws SQLException {
        log.debug("Abrindo uma conexão no banco");
        Connection connection = null;
        Statement stmt = null;
        String SQLDelete = String.format("DELETE FROM dentista where id= %s ", id);

        try {
            configuracaoJDBC = new ConfiguracaoJDBC();
            connection = configuracaoJDBC.getConnection();
            log.debug("Excluindo dentista com id: " + id);
            stmt = connection.createStatement();
            stmt.execute(SQLDelete);

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }finally {
            log.debug("Fechando conexão com o banco");
            connection.close();
        }
    }

    private Dentista criarObjetoDentista(ResultSet resultSet) throws SQLException {
        Integer id = resultSet.getInt("ID");
        String nome = resultSet.getString("nome");
        String sobrenome = resultSet.getString("sobrenome");
        String matricula = resultSet.getString("matricula");

        return new Dentista(id, nome, sobrenome, matricula);
    }
}
