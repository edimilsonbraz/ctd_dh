import java.util.Scanner;

public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 0;
        this.views = 0;
        this.reproduzindo = true;
    }

    public static Video escolhaVideo(String titulo) throws TituloException {
        if(titulo.equals("")){
            throw new TituloException("Você precisa inserir um titulo");
        }
        Video video = new Video(titulo);
        System.out.println(video);

        return video;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao) / this.views);
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas ++;
    }

    @Override
    public String toString() {
        return "Video{" + ("\n") +
                "titulo = " + titulo + '\'' + ("\n") +
                "avaliacao = " + avaliacao + ("\n") +
                "views = " + views + ("\n") +
                "curtidas = " + curtidas + ("\n") +
                "reproduzindo = " + reproduzindo + ("\n") +
                "=========================================" +
                '}';
    }
}
