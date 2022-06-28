import java.util.List;

public class Armazem {
    private String nome;
    List<Produto> produtos;

    public Armazem(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public double calcularEspacoNecessario(){
        return 0;
    }
}
