public class ProcessaArtigo {
    public static void main(String args[]){
        CheckQuality processo = new CheckQuality();

        processo.verificar(new Artigo("Leite",1500,1250, "saudável"));
        processo.verificar(new Artigo("Nescal",1500,1350, "Estragado"));
        processo.verificar(new Artigo("Açucar",2001,1250, "quase saudável"));
        processo.verificar(new Artigo("Café",100,200, "Delicia"));

    }
}
