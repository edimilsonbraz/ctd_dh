public class Main {
    public static void main(String[] args) {
        ArvoreFactory arvore = new ArvoreFactory();



        for(int i=0; i<1000000; i++){
            Arvore frutifera = new Arvore(3.5, 0.90, "vermelho", "frutifera");
            Arvore Ornamental = new Arvore(2.0, 0.40, "verde", "florifera");
            System.out.println(frutifera.toString());
            System.out.println(Ornamental.toString());
        }

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() -
                runtime.freeMemory()) / (1024 * 1024));

    }
}
