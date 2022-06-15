public class Main {
    public static void main(String[] args) {
//        Mamifero x = new Mamifero();
//        x.emitirSom();
//
//        Lobo y = new Lobo();
//        y.emitirSom();

        Cachorro rex = new Cachorro();
        rex.emitirSom();
        rex.reagir("Olá");
        rex.reagir(true);
        rex.reagir("Vai apanhar");
        rex.reagir("Toma comida");
        rex.reagir(21, 0);
        rex.reagir(false);
        rex.reagir(17, 4.5f);
        rex.reagir(4, 12.5f);
        rex.reagir(14, 30);



    }
}
