import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> sitesBloqueados = Arrays.asList("www.youtube.com","www.facebook.com");
        IConexionInternet proxy = new ProxyInternet(sitesBloqueados,new InternetService());

        proxy.conectarCom("www.google.com");
        proxy.conectarCom("www.youtube.com");
        proxy.conectarCom("www.facebook.com");
        proxy.conectarCom("www.github.com");
    }
}
