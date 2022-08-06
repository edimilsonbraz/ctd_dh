import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TesteAcesso {
    Usuario user1;
    Usuario user2;
    Usuario user3;

    Download download = new ServicoDownloadProxy();

    @BeforeEach
    void cadastroUsuario(){
        user1 = new Usuario("Ediguitar","Premium");
        user2 = new Usuario("Diego","Free");
        user3 = new Usuario("Maikao","premium");
    }

    @Test

    void mainTest(){
        download.downloadMusica(user1.getId(), user1.getTipo());
        System.out.println(user1);
        download.downloadMusica(user2.getId(), user2.getTipo());
        System.out.println(user2);
        download.downloadMusica(user3.getId(), user3.getTipo());
        System.out.println(user3);
    }

}
