public class ProdutoFactory {
    private static ProdutoFactory instance;
    private ProdutoFactory(){}

    //Pattern Factory
    public Produto criarProduto(double peso, String tipo) {
        switch (tipo){
            case "CAIXA10X10":
                return new Caixa(peso, 10.0, 10.0, 10.0);
            case "FUTEBOL":
                return  new Bola(peso, 11.0);
            case "BOLATENIS":
                return  new Bola(peso, 0.32);
        }

        throw new RuntimeException("O tipo não existe");
    }

    //Pattern Singleton
    public static ProdutoFactory getInstance(){
        if(instance == null){
            instance = new ProdutoFactory();
        }
        return instance;
    }
}
