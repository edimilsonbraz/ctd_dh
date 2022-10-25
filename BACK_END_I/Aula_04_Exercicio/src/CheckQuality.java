public class CheckQuality {
    GerenciadorProduto inicial;
    public CheckQuality(){
        this.inicial = new Lote();
        GerenciadorProduto peso = new Peso();
        GerenciadorProduto embalagem = new Embalagem();
        GerenciadorProduto descarte = new Descarte();

        inicial.setSeguinte(peso);
        peso.setSeguinte(embalagem);
        embalagem.setSeguinte(descarte);
    }

    public void verificar(Artigo item){
        inicial.verificar(item);
    }
}
