import java.util.List;

public class Cidade {
    private int qtdAquecedores = 0;
    private List<Residencia> residencias;

    public void calcularAquecedores() {
        residencias.forEach(residencia -> {
            this.qtdAquecedores += residencia.getAquecedores().size();
        });
    }

    public int getQtdAquecedores() {
        return qtdAquecedores;
    }

    public void setResidencias(List<Residencia> residencias) {
        this.residencias = residencias;
    }
}
