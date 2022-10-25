import java.util.List;

class Main {
    public static void main(String[] args) {
        // Residencia 1 apartamento 50m2 com 2 habitantes e isolamento de 5%
        Residencia residencia1 = new Apartamento(50, 2, 5);
        residencia1.calcularCaloria();

        System.out.println("Residencia 1 tem " + residencia1.getAquecedores().size() + " aquecedores");

        // Residencia 2 casa 100m2 com 4 habitantes e isolamento de 10%
        Residencia residencia2 = new Casa(100, 4, 10);
        residencia2.calcularCaloria();

        System.out.println("Residencia 2 tem " + residencia2.getAquecedores().size() + " aquecedores");

        // Residencia 3 apartamento 100m2 com 1 habitantes e isolamento de 20%
        Residencia residencia3 = new Apartamento(100, 1, 20);
        residencia3.calcularCaloria();

        System.out.println("Residencia 3 tem " + residencia3.getAquecedores().size() + " aquecedores");

        // Lista de residencia
        List<Residencia> listaResidencia = List.of(residencia1, residencia2, residencia3);

        Cidade cidade = new Cidade();
        cidade.setResidencias(listaResidencia);
        cidade.calcularAquecedores();

        System.out.println("A Cidade precisa de: " + cidade.getQtdAquecedores() + " aquecedores");
    }
}