public class Funcionario {
    private String nome;
    private String sobrenome;
    private int idade;
    private String rg;

    public Funcionario(String nome, String sobrenome, int idade, String rg) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public String getRg() {
        return rg;
    }

    @Override
    public String toString() {
        return "Funcionario{" + ("\n") +
                "nome='" + nome + '\'' + ("\n") +
                "sobrenome='" + sobrenome + '\'' + ("\n") +
                "idade=" + idade + ("\n") +
                "rg='" + rg + '\'' + ("\n") +
                '}';
    }
}
