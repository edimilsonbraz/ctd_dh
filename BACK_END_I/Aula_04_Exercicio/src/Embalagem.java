public class Embalagem extends GerenciadorProduto {
    @Override
    public void verificar(Artigo item) {
        if ((item.getEmbalagem().equalsIgnoreCase("saudável")) ||
                (item.getEmbalagem().equalsIgnoreCase("quase saudável"))) {
            System.out.println("Lote correto, enviando para controle de peso!");
        } else {
            if (this.getSeguinte() != null) {
                this.getSeguinte().verificar(item);
            }
        }
    }
}
