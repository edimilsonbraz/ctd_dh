import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cachorro> cachorros = new ArrayList<>();

        Cachorro cachorro1 = new Cachorro(5, "Rex");
        Cachorro cachorro2 = new Cachorro(3, "Pluto");

        cachorros.add(cachorro1);
        cachorros.add(cachorro2);

        //Salvamos toda a colecao de paginas em um arquivo

        FileOutputStream fo = null;
        try{
            fo = new FileOutputStream("OutputFile.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fo);

            objectOutputStream.writeObject(cachorros);
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
//            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Recuperamos toda a coleção com cada uma das paginas do arquivo
        List<Cachorro> cachorros2 = null;

        FileInputStream fi = null;
        try {
            fi = new FileInputStream("OutputFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);

            cachorros2 = (ArrayList) ois.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for(Cachorro cachorro : cachorros2){
            System.out.println(cachorro.getNome() + " : " + cachorro.getIdade());
        }
    }
}
