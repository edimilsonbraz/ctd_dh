public class ServicoDownload implements Download {

    @Override
    public void downloadMusica(String id, String tipo) {
        System.out.println("Usuário " +id+ " pode baixar a musica, " + tipo);
    }
}
