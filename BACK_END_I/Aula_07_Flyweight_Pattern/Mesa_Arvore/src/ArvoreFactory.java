import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {

    private static final Map<String, Arvore> arvoreFlyweight = new HashMap<>();

    public Arvore getArvore(double altura, double largura, String cor, String tipo){
        String id = "id: " + tipo;

        if(!arvoreFlyweight.containsKey(id)){
            arvoreFlyweight.put(id, new Arvore(altura, largura, cor, tipo));

            return arvoreFlyweight.get(id);
        }
        System.out.println("\nArvore plantada com sucesso");
        System.out.println("=============================");

        return arvoreFlyweight.get(id);
    }
}
