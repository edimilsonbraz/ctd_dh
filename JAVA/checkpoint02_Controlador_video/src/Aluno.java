import java.util.Objects;

public class Aluno extends Pessoa {
    private String login;
    private int totalAssistido;

    public Aluno(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }

    public static void validaResposta(String responsta){
        System.out.println("Digite um nome para criar Aluno!");
        if(!Objects.equals(responsta, "")) {
            System.out.println("Voce criou um aluno com sucesso!" + responsta);
        }else{
            System.out.println("Resposta inválida!");
        }
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {

        this.totalAssistido = totalAssistido;
    }

    @Override
    public String toString() {
        return "Aluno{" + super.toString() + ("\n") +
                "login ='" + login + '\'' + ("\n") +
                "totalAssistido=" + totalAssistido + ("\n") +
                '}';
    }
}
