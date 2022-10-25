import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println("**** Bem-vindo ao Sistema DH Videos ****");

            //Chama o método criaAluno e guarda Objeto
            Aluno aluno = Aluno.createAluno();

            System.out.println("========================================");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um Titulo de video para assistir!");
            String titulo = scanner.nextLine();

            //Chama o método escolha um video e cria o video com parametro passado/ guarda
            Video video = Video.escolhaVideo(titulo);
            Visualizacao vis = new Visualizacao(Collections.singletonList(aluno), video);
            System.out.println(vis);


            scanner = new Scanner(System.in);
            System.out.println("Gostaria de avaliar o video ? Digite sim ou nao ?");
            String resposta = scanner.nextLine();

            if(resposta.equals("sim") ){
                System.out.println("Qual nota você dá para o videio ? 0 a 10 ");
                int nota = scanner.nextInt();
                vis.avaliar(nota);
            }else if(resposta.equals("nao")){
                System.out.println("Obrigado mesmo assim!");
            }else{
                throw new RuntimeException("Resposta inválida!");
            }

            System.out.println("Obrigado por sua avalição" + vis.getFilme());

        }catch (TituloException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("FIM");
        }

    }

}