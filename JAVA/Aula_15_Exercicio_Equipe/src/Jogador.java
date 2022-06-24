import java.util.Objects;
public class Jogador implements Comparable<Jogador> {
    private String name;
    private int numCamisa;
    private boolean lesionado;

    public Jogador(String nome, int numCamisa, boolean lesionado) {
        this.name = nome;
        this.numCamisa = numCamisa;
        this.lesionado = lesionado;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "nome: " + name + ", numCamisa: " + numCamisa;
    }

    @Override
    public boolean equals(Object o) {
        return numCamisa == ((Jogador) o).numCamisa && Objects.equals(name, ((Jogador) o).name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numCamisa);
    }

    // obj == jogador -> 0
    // obj > jogador  -> 1
    // obj < jogador  -> -1
    @Override
    public int compareTo(Jogador jogador) {
        if (numCamisa > jogador.numCamisa) return 1;
        if (numCamisa < jogador.numCamisa) return -1;
        return 0;
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public boolean getLesionado() {
        return lesionado;
    }
}
