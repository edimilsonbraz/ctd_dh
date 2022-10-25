public class Main {
    public static void main(String[] args) {
        PontoNoMapa pontoNoMapa1 = new PontoNoMapa(100,300);
        PontoNoMapa pontoNoMapa2 = new PontoNoMapa(500,1000);

        Caminhando caminhando = new Caminhando();
        System.out.println(caminhando.calcularTempoDeViagem(pontoNoMapa1, pontoNoMapa2));

        Automovel automovel = new Automovel();
        System.out.println(automovel.calcularTempoDeViagem(pontoNoMapa1, pontoNoMapa2));

        Bicicleta bicicleta = new Bicicleta();
        System.out.println(bicicleta.calcularTempoDeViagem(pontoNoMapa1, pontoNoMapa2));

    }
}