public class Filial {
    private Integer id;
    private String nome;
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private int is5Estrelas;

    public Filial(Integer id, String nome, String rua, String numero, String cidade, String estado, int is5Estrelas) {
        this.id = id;
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.is5Estrelas = is5Estrelas;
    }
    public Filial(String nome, String rua, String numero, String cidade, String estado, int is5Estrelas) {
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.is5Estrelas = is5Estrelas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIs5Estrelas() {
        return is5Estrelas;
    }

    public void setIs5Estrelas(int is5Estrelas) {
        this.is5Estrelas = is5Estrelas;
    }

    @Override
    public String toString() {
        return "Filial{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", is5Estrelas=" + is5Estrelas +
                '}';
    }
}
