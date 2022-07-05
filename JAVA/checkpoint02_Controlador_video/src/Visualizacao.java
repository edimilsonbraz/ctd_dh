import java.util.List;
import java.util.Scanner;

public class Visualizacao {
    // Relacionamento entre as classes
    private final List<Aluno> espectadores;
    private Video filme;

    public Visualizacao(List<Aluno> espectadores, Video filme) {
        this.espectadores = espectadores;
        this.filme = filme;

        //totalAssistido + 1 ;
        for(int i =0; i < espectadores.size(); i++) {
            this.espectadores.get(i).setTotalAssistido(this.espectadores.get(i).getTotalAssistido() + 1);
        }
//
        //Acrescentando mais uma visualização
        this.filme.setViews(this.filme.getViews() + 1);
    }

    //Sobrecarga
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }

    public List<Aluno> getEspectadores() {
        return espectadores;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + ("\n") +
                "espectador = " + espectadores + ("\n") +
                "aula = " + filme + ("\n") +
                '}';
    }
}