import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List nomes = new ArrayList();

        nomes.add("Juan");
        nomes.add("Mario");
        nomes.add("Carlos");
        nomes.add("Diego");
        nomes.add("Marcelo");
        nomes.add("Marcelo");

        for(int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        int i = 0;
        boolean encontrado = false;
        while( i < nomes.size() && !encontrado)
        {
            if(nomes.get(i) == "Carlos")
                encontrado = true;
            System.out.println(nomes.get(i));
            i++;
        }


        System.out.println("usando iterator");
        Iterator iterator = nomes.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("usando for each");
        for(Object nome: nomes){
            System.out.println(nome);
        }


    }
}
