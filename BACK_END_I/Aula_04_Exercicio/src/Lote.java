public class Lote extends GerenciadorProduto{


    @Override
    public void verificar(Artigo item) {
        if(item.getLote() >=1000 && item.getLote() <= 2000){
            System.out.println("Lote correto, enviando para controle de peso!");
        }else {
            if(this.getSeguinte()!=null)
            {
                this.getSeguinte().verificar(item);
            }
        }
    }
}
