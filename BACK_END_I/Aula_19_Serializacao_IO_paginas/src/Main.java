import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pagina pagina = new Pagina("DH", "https://www.digitalhouse.com/");
        Pagina pagina2 = new Pagina("Youtube", "https://www.youtube.com/");
        Pagina pagina3 = new Pagina("GitHub", "https://www.github.com/");
        Pagina pagina4 = new Pagina("Netflix", "https://www.netflix.com/");

        //Array pra salvar as paginas favoritas
        ArrayList<Pagina> favorita = new ArrayList<>();

        //Adicionando as paginas na Coleção
        favorita.add(pagina);
        favorita.add(pagina2);
        favorita.add(pagina3);
        favorita.add(pagina4);

        try {
            //Cria o arquivo pra salvar as informações
            FileOutputStream fileOutputStream = new FileOutputStream("paginasFavoritas.txt");
            //Objeto de manipulacao pra salvar no arquivo / Gera o arquivo
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            //Escrevendo o Object no Arquivo paginasFavoritas.txt
            objectOutputStream.writeObject(favorita);

            //
            objectOutputStream.close();

            //Buscar os arquivos
            FileInputStream fileInputStream = new FileInputStream("paginasFavoritas.txt");
            //Objeto de entrada
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            //Array vai salvar na hora que ler o Object
            ArrayList<Pagina> pages;

            for(int i =0; i < 5; i++){
                System.out.println("Pagina " + (i+1));
                System.out.println("=================");
                pages = (ArrayList<Pagina>) objectInputStream.readObject();

                for(Pagina p : pages) {
                    System.out.println(p);
                }
            }

            objectInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
