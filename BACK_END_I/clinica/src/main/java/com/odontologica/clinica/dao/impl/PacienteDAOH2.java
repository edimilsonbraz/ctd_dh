package com.odontologica.clinica.dao.impl;

import com.odontologica.clinica.dao.ConfiguracaoJDBC;
import com.odontologica.clinica.dao.IDao;
import com.odontologica.clinica.model.Dentista;
import com.odontologica.clinica.model.Paciente;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.apache.logging.log4j.LogManager.getLogger;

@Configuration
public class PacienteDAOH2 implements IDao<Paciente> {

    private ConfiguracaoJDBC configuracaoJDBC;

    final static Logger log = getLogger(PacienteDAOH2.class);
    @Override
    public Paciente salvar(Paciente paciente) throws SQLException {
        log.info("Abrindo conexão");
        String SQLInsert = String.format("INSERT INTO paciente (nome, sobrenome, endereco, rg, dataAlta)"  +
                        "VALUES ('%s', '%s', '%s', '%s', '%s')", paciente.getNome(), paciente.getSobrenome(), paciente.getEndereco(),
                paciente.getRg(),  paciente.getDataAlta().getYear() + "-" + paciente.getDataAlta().getMonth() + "-" + paciente.getDataAlta().getDay());
        Connection connection = null;

        try {
            log.info("Salvando paciente: " + paciente.getNome());
            configuracaoJDBC = new ConfiguracaoJDBC();
            connection = configuracaoJDBC.getConnection();
            Statement stmt = connection.createStatement();
            stmt.execute(SQLInsert,Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = stmt.getGeneratedKeys();

            if(resultSet.next()){
                paciente.setId(resultSet.getInt(1));
            }
        }catch (SQLException e){
            e.printStackTrace();
            log.error("Erro ao inserir o paciente: " + e.getMessage());
        }finally {
            log.info("Fechando a conexão");
            connection.close();
        }
        return paciente;
    }

    @Override
    public void alterar(Paciente paciente) throws SQLException {
        String SQLUpdate = String.format("UPDATE paciente set nome = '%s', sobrenome = '%s', endereco = '%s', rg = '%s' where id = '%s';",
                paciente.getNome(), paciente.getSobrenome(), paciente.getEndereco(), paciente.getRg(), paciente.getId());
        Connection connection = null;

        try {
            log.info("Alterando os dados do paciente" + paciente.getId());
            configuracaoJDBC = new ConfiguracaoJDBC();
            connection = configuracaoJDBC.getConnection();
            Statement stmt = connection.createStatement();
            stmt.execute(SQLUpdate);

        }catch (Exception e) {
            e.printStackTrace();
            log.error("Erro ao tentar alterar dados do paciente");
        }finally {
            log.info("Fechando a conexão com o banco");
            connection.close();
        }
    }

    @Override
    public Optional<Paciente> buscarPorId(int id) throws SQLException {
        log.debug("Abrindo uma conexão no banco");
        Connection connection = null;
        Statement stmt = null;
        String query = String.format("SELECT * FROM paciente where id= %s ", id);
        Paciente paciente = null;

        try {
            configuracaoJDBC = new ConfiguracaoJDBC();
            connection = configuracaoJDBC.getConnection();
            log.debug("Buscando paciente por id: " + id);
            stmt = connection.createStatement();
            ResultSet resultado = stmt.executeQuery(query);

            while (resultado.next()){
                paciente = criarObjetoPaciente(resultado);
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }finally {
            log.debug("Fechando a conexão com o banco");
            stmt.close();
        }
        return paciente != null ? Optional.of(paciente) : Optional.empty();
    }

    @Override
    public List<Paciente> buscarTodos() throws SQLException {
        log.debug("Abrindo uma conexão no banco");
        Connection connection = null;
        Statement stmt = null;
        String query = "SELECT * FROM paciente";
        List<Paciente> pacientes = new ArrayList<>();

        try {
            configuracaoJDBC = new ConfiguracaoJDBC();
            connection = configuracaoJDBC.getConnection();
            stmt = connection.createStatement();
            ResultSet resultado = stmt.executeQuery(query);
            log.debug("Buscando todos os pacientes cadastrados no DB");

            while(resultado.next()){
                pacientes.add(criarObjetoPaciente(resultado));
            }

        }catch (SQLException  throwables){
            throwables.printStackTrace();
        }finally {
            log.debug("Fechando a conexão com o banco");
            stmt.close();
        }
        return pacientes;
    }

    @Override
    public void excluir(int id) throws SQLException {
        log.debug("Abrindo uma conexão no banco");
        Connection connection = null;
        Statement stmt = null;
        String SQLDelete = String.format("DELETE FROM paciente where id = %s ", id);

        try {
            configuracaoJDBC = new ConfiguracaoJDBC();
            connection = configuracaoJDBC.getConnection();
            log.debug("Excluindo paciente com id: " + id);
            stmt = connection.createStatement();
            stmt.execute(SQLDelete);
        }catch (Exception e){
            e.printStackTrace();
            log.error("Error ao tentar deletar paciente: " + e.getMessage());
        }finally {
            log.debug("Fechando conexão com o banco");
            connection.close();
        }

    }

    private Paciente criarObjetoPaciente(ResultSet resultSet) throws SQLException {
        Integer id = resultSet.getInt("ID");
        String nome = resultSet.getString("nome");
        String sobrenome = resultSet.getString("sobrenome");
        String endereco = resultSet.getString("endereco");
        String rg = resultSet.getString("rg");
        Date dataAlta = resultSet.getDate("dataAlta");

        return new Paciente(id, nome, sobrenome, endereco, rg, dataAlta);
    }


}
