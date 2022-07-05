import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa implements Publicador{
    private final List<Observador> observadores;

    public Usuario(String nome, String sobrenome) {
        super(nome, sobrenome);
        observadores = new ArrayList<>();
    }

    @Override
    public void adicionar(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void remover(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificar() {

        for(Observador observador : observadores) observador.receberNotificar(getNome());
    }

    public void publicarFoto(){
        System.out.println("Publicou uma foto");
        notificar();
    }
}
