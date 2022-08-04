public class Peso extends GerenciadorProduto {

    @Override
    public void verificar(Artigo item) {
        if(item.getPeso() >=1200 && item.getPeso() <= 1300){
            System.out.println("Peso correto, enviando para controle de embalagem!");
        }else {
            if(this.getSeguinte()!=null)
            {
                this.getSeguinte().verificar(item);
            }
        }
    }
}
