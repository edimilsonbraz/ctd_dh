public class Main {
    public static void main(String[] args) {
        //instanciar classe caneta
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 80;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        System.out.println("===========================================");

        //instanciar uma segunda classe caneta
        Caneta c2 = new Caneta();
        c2.modelo = "Compact";
        c2.cor = "Preta";
        c2.ponta = 0.9f;
        c2.carga = 99;
        c2.destampar();
        c2.status();
        c2.rabiscar();

    }
}
