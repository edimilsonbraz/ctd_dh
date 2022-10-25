public abstract class GerenciadorProduto {

    protected GerenciadorProduto gerenciadorSeguinte;

    public GerenciadorProduto getSeguinte(){
        return this.gerenciadorSeguinte;
    }

    public void setSeguinte(GerenciadorProduto m){
        this.gerenciadorSeguinte = m;
    }

    public abstract void verificar(Artigo item);
}
