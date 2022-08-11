import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class Inteiros {
    private static final Logger logger = Logger.getLogger(Inteiros.class);
    private List<Integer> listaInterios = new ArrayList<>();

    public Inteiros(List<Integer> listaInterios) {
        this.listaInterios = listaInterios;
    }

    public void calculodeItens() throws Exception {

        if (listaInterios.size() == 0){
            logger.error("A lista é igual a zero");
            throw new Exception();
        }

        Integer soma = 0;

        for (int i : listaInterios) {
            soma += i;
        }

        double media = 0;
        media = soma / listaInterios.size();

        if (listaInterios.size() > 5) {
            logger.info("[ListaMedia: " + media + "] O comprimento da lista é maior que 5");
        } else {
            logger.error("[ListaMedia: " + media + "]");
        }

        if (listaInterios.size() > 10) {
            logger.info("[ListaMedia: " + media + "] O comprimento da lista é maior que 10");
        }

    }

}