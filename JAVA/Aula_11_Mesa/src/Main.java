public class Main {
    public static <String> void main(String[] args) {
        Cachorro cachorro = new Cachorro("Sol", 3);
        Cavalo cavalo = new Cavalo("Fenix", 8);
        Preguica preguica = new Preguica("Veloz demais", 2);


        System.out.println(preguica.emitirSom());
        System.out.println(preguica.subirEmArvore());
    }
}