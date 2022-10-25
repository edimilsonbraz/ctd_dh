import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private String nome;
    private List<OfertaAcademica> programas;

    public Instituto(String nome) {
        this.nome = nome;
        this.programas = new ArrayList<>();
    }
}
