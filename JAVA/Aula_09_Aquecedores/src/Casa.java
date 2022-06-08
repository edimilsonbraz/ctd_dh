public class Casa extends Residencia{
    Casa(double tamanho, int habitantes, double isolamento) {
        super(tamanho, habitantes, isolamento);
    }

    @Override
    public void calcularCaloria() {
        // 500 calorias por m2, mais 100 calorias para cada habitante.
        this.caloria = 700 * tamanho;
        super.calcularCaloria();
    }
}