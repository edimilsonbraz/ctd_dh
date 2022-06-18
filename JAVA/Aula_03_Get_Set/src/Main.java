public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.setModelo("Bic");
        c1.modelo = "Compacta ";
        c1.setCor("Azul ");

        c1.setPonta(0.5f);
        //c1.status();
        System.out.println("Tenho uma caneta " + c1.getModelo() + c1.getCor() + "de ponta " +c1.getPonta());
    }
}
