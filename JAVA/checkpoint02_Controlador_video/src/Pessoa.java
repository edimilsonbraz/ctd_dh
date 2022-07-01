public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private float experiencia;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Pessoa{" + ("\n") +
                "nome = '" + nome + '\'' + ("\n") +
                "idade = " + idade + ("\n") +
                "sexo = '" + sexo + '\'' + ("\n") +
                "experiencia = " + experiencia + ("\n") +
                '}';
    }
}
