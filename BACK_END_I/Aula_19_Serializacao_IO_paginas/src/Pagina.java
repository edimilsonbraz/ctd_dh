import java.io.Serializable;

public class Pagina implements Serializable {
    private String nome;
    private String url;

    public Pagina(String nome, String url) {
        this.nome = nome;
        this.url = url;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Pagina{" +
                "nome='" + nome + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
