public class InternetService implements IConexionInternet {

    @Override
    public void conectarCom(String url) {

        System.out.println("Conectando com " + url);
    }
}
