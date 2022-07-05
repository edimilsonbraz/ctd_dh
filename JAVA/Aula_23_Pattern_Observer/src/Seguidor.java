public class Seguidor extends Pessoa implements Observador{
    private int qtdNotificacoes;

    public Seguidor(String nome, String sobrenome) {
        super(nome, sobrenome);
        this.qtdNotificacoes = 0;
    }

    @Override
    public void receberNotificar(String quemEnviou) {
        qtdNotificacoes++;
        System.out.println(
                getNome() + " foi notificado da foto que " + quemEnviou + " carregou.");
    }

    public int numeroDeNotificacoes(){
        return qtdNotificacoes;
    }
}
