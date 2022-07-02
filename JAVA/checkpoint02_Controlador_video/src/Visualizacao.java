import java.util.Scanner;

public class Visualizacao {
    // Relacionamento entre as classes
    private Aluno espectador;
    private Video filme;

    public Visualizacao(Aluno espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        //totalAssistido + 1 ;
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
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

    public Aluno getEspectador() {
        return espectador;
    }

    public void setEspectador(Aluno espectador) {
        this.espectador = espectador;
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
                "espectador = " + espectador + ("\n") +
                "filme = " + filme + ("\n") +
                '}';
    }
}
