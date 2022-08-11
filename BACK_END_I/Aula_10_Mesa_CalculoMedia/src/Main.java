import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        List<Integer> listaInteiros = new ArrayList<>();

        listaInteiros.add(10);
        listaInteiros.add(4);
        listaInteiros.add(8);
        listaInteiros.add(9);
        listaInteiros.add(7);
        listaInteiros.add(5);

        Inteiros i = new Inteiros(listaInteiros);

        try {
            i.calculodeItens();
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<Integer> listaInteiros1 = new ArrayList<>();


        Inteiros i1 = new Inteiros(listaInteiros1);

        try {
            i1.calculodeItens();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}


