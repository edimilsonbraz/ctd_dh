public class GerenciadorTecnico extends Gerenciador{

    @Override
    public void verificar(Mail email) {
        if((email.getDestino().equalsIgnoreCase("tecnico@colmeia.com")) ||
                (email.getAssunto().equalsIgnoreCase("Técnico")))
        {
            System.out.println("Enviando ao departamento Técnico");
        }else {
            //Verifica a próxima entrada e executo novamente o meu método Verificar
            if(this.getSeguinte()!=null){
                this.getSeguinte().verificar(email);
            }
        }
    }
}
