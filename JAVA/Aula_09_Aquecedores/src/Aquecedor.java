public class Aquecedor {
    private final int queimador;
    private int totalCalorias;

    public Aquecedor(int queimador) {
        this.queimador = queimador;
        this.totalCalorias = 0;
    }

    public void calculaCalorias() {
        if (queimador > 0) {
            this.totalCalorias = queimador * 300;
        }
    }

    public int getTotalCalorias() {
        return totalCalorias;
    }
}