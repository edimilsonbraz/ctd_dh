import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Contato> contatos = new ArrayList<>();

        Contato contato1 = new Contato("Edimilson", "edi@gmail.com", "33554488");
        Contato contato2 = new Contato("Mael", "mael@gmail.com", "988556620");
        Contato contato3 = new Contato("Diego", "diego@gmail.com", "4582364878");
        Contato contato4 = new Contato("Biro", "birobiro@gmail.com", "33525544");

        contatos.add(contato1);
        contatos.add(contato2);
        contatos.add(contato3);
        contatos.add(contato4);

        FileOutputStream contFo = null;
        try {
            contFo = new FileOutputStream("OutputFile.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(contFo);
            objectOutputStream.writeObject(contatos);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<Contato> contatoArray = null;

        FileInputStream contFi = null;
        try {
            contFi = new FileInputStream("OutputFile.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(contFi);

            contatoArray = (ArrayList) objectInputStream.readObject();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for(Contato contato : contatoArray){
            System.out.println(contato.getNome() + " : " + contato.getEmail());
        }

    }
}
