public class Main {
    public static void main(String[] args) {
        //Usando o constructor
        Caneta c1 = new Caneta("Bic", 0.9f, "Vermelha", true );
        Caneta c2 = new Caneta("Fabricastell", 1.5f, "4Cores", false);

//        c1.setModelo("Bic");
//        c1.modelo = "Compacta ";
//        c1.setCor("Azul ");
//
//        c1.setPonta(0.5f);

        System.out.println(
            "Tenho uma caneta " +
            c1.getModelo() + " " +
            c1.getCor() + " de ponta " +
            c1.getPonta() +
            " e ela está tampada? " +
            c1.isTampada()
        );
        System.out.println("|===============================|");
        System.out.println(
            "Tenho uma caneta " +
            c2.getModelo() + " " +
            c2.getCor() + "de ponta " +
            c2.getPonta() +
            " e ela está tampada? " +
            c2.isTampada()
        );
    }
}
