import static java.lang.Math.abs;

public class Caminhando implements StrategyTempoViagem {

    @Override
    public double calcularTempoDeViagem(PontoNoMapa pontoNoMapa1, PontoNoMapa pontoNoMapa2) {
        return (abs(pontoNoMapa1.getLatitude() - pontoNoMapa2.getLatitude()) + abs(pontoNoMapa1.getLongitude() -
                pontoNoMapa2.getLongitude()) / 0.20366 * 13);
    }

}