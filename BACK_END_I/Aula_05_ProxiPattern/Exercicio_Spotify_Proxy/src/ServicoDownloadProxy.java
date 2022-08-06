public class ServicoDownloadProxy implements Download{

    @Override
    public void downloadMusica(String id, String tipo) {
        if (tipo.equalsIgnoreCase("premium")){
            ServicoDownload servicoDownload = new ServicoDownload();
            servicoDownload.downloadMusica(id,tipo);
            System.out.println("Música baixado com sucesso!");
        } else {
            System.out.println("Seu tipo de conta não possui acesso para download, sua conta é de: " + tipo);
        }
    }
}
