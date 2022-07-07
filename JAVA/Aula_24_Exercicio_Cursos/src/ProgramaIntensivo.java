import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica {
    private double porcentagemBoni;
    private List<Curso> cursos;

    public ProgramaIntensivo(String nome, String descricao, double porcentagemBoni) {
        super(nome, descricao);
        this.porcentagemBoni = porcentagemBoni;
        this.cursos = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }



    @Override
    double calcularPreco() {
        double totalCursos = 0;
        for(Curso curso : cursos){
            totalCursos += curso.calcularPreco();
        }
        totalCursos -= (totalCursos * porcentagemBoni) / 100;

        return totalCursos;
    }
}
