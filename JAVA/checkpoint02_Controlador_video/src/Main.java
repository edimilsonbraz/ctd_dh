import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("**** Bem-vindo ao Sistema DH Videos ****");
        
        //Chama o método criaAluno e guarda Objeto
        Aluno aluno = Aluno.createAluno();

        System.out.println("========================================");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um Titulo de video para assistir!");
        String titulo = scanner.nextLine();

        //Chama o método escolha um video e cria o video com parametro passado/ guarda
        Video video = Video.escolhaVideo(titulo);

        Visualizacao vis = new Visualizacao(aluno, video);
        System.out.println(vis);

        scanner = new Scanner(System.in);
        System.out.println("Gostaria de avaliar o video ? sim ou nao ?");
        String resposta = scanner.nextLine();

        if(resposta.equals("sim") ){
            System.out.println("Qual nota você dá para o videio ? 0 a 10 ");
            int nota = scanner.nextInt();
            vis.avaliar(nota);
        }else if(resposta.equals("nao")){
            System.out.println("Obrigado mesmo assim!");
        }

        System.out.println("Obrigado por sua avalição" + vis.getFilme());




//        System.out.println("Informe o Titulo do vídeo que desaja assistir!");
//        String ResTitulo = scanner.nextLine();
//
//        Video video = new Video(ResTitulo);
//
//        Aluno aluno = new Aluno("Edimilson", 38, "M", "ediguitar");
//        Visualizacao vis = new Visualizacao(aluno, video);
//        vis.avaliar(8);

//        System.out.println(aluno);

//        Visualizacao vis2 = new Visualizacao(aluno, video);
//        vis2.avaliar(5);
//        Visualizacao vis3 = new Visualizacao(aluno, video2);


    }

}
