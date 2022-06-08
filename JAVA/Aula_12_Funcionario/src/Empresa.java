import Aula_12_Funcionario.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private String cnpj;

    private List<Funcionario> funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<Funcionario>();
    }

    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}