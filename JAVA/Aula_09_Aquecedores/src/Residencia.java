import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Residencia {
    protected int habitantes;
    protected double tamanho;
    protected double caloria;
    private final double isolamento;
    private final List<Aquecedor> aquecedores = new ArrayList<>();

    Residencia(double tamanho, int habitantes, double percentualIsolamento){
        this.habitantes = habitantes;
        this.tamanho = tamanho;
        this.isolamento = percentualIsolamento;
        this.caloria = 0;
    }

    private double calcularIsolamento(){
        return caloria * (this.isolamento/100);
    }

    public List<Aquecedor> getAquecedores() {
        return aquecedores;
    }

    public void calcularCaloria(){
        if (caloria < 1) return;

        double caloriaNecessaria = caloria - calcularIsolamento();
        Random random = new Random();
        while (caloriaNecessaria > aquecedores.stream().mapToDouble(Aquecedor::getTotalCalorias).sum()){
            Aquecedor aquecedor = new Aquecedor(random.nextInt(20) + 1);
            aquecedor.calculaCalorias();
            aquecedores.add(aquecedor);
        }
    }
}