public class UsuarioJogo {
    private String nome;
    private String nickname;
    private Integer pontuacao;
    private Integer nivel;

    public UsuarioJogo(String nome, String nickname, Integer pontuacao, Integer nivel) {
        this.nome = nome;
        this.nickname = nickname;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public String getNickname() {
        return nickname;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPontuacao() {
        this.pontuacao += 1;
    }

    public void setNivel() {
        this.nivel += 1;
    }

    public void bonus(Integer valor) {
        this.pontuacao += valor;
    }
}