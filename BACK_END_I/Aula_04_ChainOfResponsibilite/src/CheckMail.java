public class CheckMail {
    Gerenciador inicial;

    public CheckMail(){ //Construtor
        this.inicial = new GerenciadorGerencia();
        Gerenciador tecnico = new GerenciadorTecnico();
        Gerenciador comercial = new GerenciadorComercial();
        Gerenciador spam = new GerenciadorSpam();

        inicial.setSeguinte(comercial);
        comercial.setSeguinte(tecnico);
        tecnico.setSeguinte(spam);
    }

    public void verificar(Mail email){
        inicial.verificar(email);
    }
}
