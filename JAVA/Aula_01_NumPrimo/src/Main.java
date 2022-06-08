import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor:");
        int valor = scanner.nextInt();

        if (ehPrimo(valor)) {
            System.out.println("o valor " + valor + " é primo");
        } else {
            System.out.println("o valor " + valor + " não é primo");
        }
    }

    private static boolean ehPrimo(int valor) {
        if (valor < 2) return false;

        boolean primo = true;
        for (int i=2; i<valor; i++) {
            if (valor % i == 0) {
                primo = false;
                break;
            }
        }

        return primo;
    }
}