public class Descarte extends GerenciadorProduto{
    @Override
    public void verificar(Artigo item) {
        System.out.println("Produto rejeitado!");
    }
}
