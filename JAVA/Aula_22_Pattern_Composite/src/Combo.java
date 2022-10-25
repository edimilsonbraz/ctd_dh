import java.util.ArrayList;
import java.util.List;

public class Combo extends Item {
    private List<Produto> produtos;

    public Combo(String nome) {
        super(nome);
    }

    public void addItens(Produto produto) {
        this.produtos = new ArrayList<>();
    }

    @Override
    public double calcularPreco() {
        if(produtos.size() < 1) return 0;

        double total = 0;
        for(Produto produto : produtos) {
            total += produto.calcularPreco();
        }

        return total;
    }
}
