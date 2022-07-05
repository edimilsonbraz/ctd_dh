public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Jorge", "Silva");
        Observador juan = new Seguidor("Juan", "Silva");
        Observador pedro = new Seguidor("Pedro", "Silva");

        usuario.adicionar(juan);
        usuario.adicionar(pedro);
        usuario.publicarFoto();
        usuario.remover(juan);
        usuario.publicarFoto();

        System.out.println(
                "Quantidade de notificação do " + ((Seguidor) juan).getNome() +
                " foi de " + ((Seguidor) juan).numeroDeNotificacoes());

        System.out.println(
                "Quantidade de notificação do " + ((Seguidor) pedro).getNome() +
                        " foi de " + ((Seguidor) pedro).numeroDeNotificacoes());
    }
}
