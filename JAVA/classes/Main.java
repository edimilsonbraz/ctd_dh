import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        UsuarioJogo usuario1 = new UsuarioJogo("Edimilson", "Ediguitar", 2, 1);
        System.out.println(usuario1.getNome() + " " + usuario1.getNickname());

        UsuarioJogo usuario2 = new UsuarioJogo("Maik", "Maikao", 10, 2);
        System.out.println(usuario2.getNome() + " " + usuario2.getPontuacao());

        sc.close();
    }

}
