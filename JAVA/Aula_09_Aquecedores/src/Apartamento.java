public class Apartamento extends Residencia{
    Apartamento(double tamanho, int habitantes, double isolamento) {
        super(tamanho, habitantes, isolamento);
    }

    @Override
    public void calcularCaloria() {
        // 500 calorias por m2, mais 100 calorias para cada habitante.
        this.caloria = 500 * tamanho + habitantes * 100;
        super.calcularCaloria();
    }
}