import java.util.Objects;
import java.util.Scanner;

public class Aluno extends Pessoa {
    private String login;
    private int totalAssistido;

    public Aluno(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }

    public static void createAluno(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um nome para criar Aluno!");
        String resNome = scanner.nextLine();

        new Scanner(System.in);
        System.out.println("Digite sua idade");
        int resIdade = scanner.nextInt();

        new Scanner(System.in);
        System.out.println("Digite seu sexo");
        String resSexo = scanner.next();

        new Scanner(System.in);
        System.out.println("Digite um nickName para login");
        String resLogin = scanner.next();

        Aluno aluno = new Aluno(resNome, resIdade, resSexo, resLogin);
        System.out.println(aluno);
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
