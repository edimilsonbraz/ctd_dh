public class ProcessaMail {
    public static void main(String[] args) {
        CheckMail processo = new CheckMail();

        processo.verificar(new Mail("email@email.com", "tecnico@digitalhouse.com", "Reclamação"));
        processo.verificar(new Mail("email@email.com", "sds@digitalhouse.com", "Gerência"));
        processo.verificar(new Mail("email@email.com", "juan@gmail.com", "Comercial"));
        processo.verificar(new Mail("email@email.com", "tecnico@colmeia.com", "Reclamação"));
    }
}
