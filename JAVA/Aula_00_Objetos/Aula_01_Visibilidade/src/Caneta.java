public class Caneta {
    //atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    //métodos
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("A cor da caneta é " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println(" Está tampada? " + this.tampada);
    }

    private void rabiscar(){
        if(this.tampada) {
            System.out.println("Erro: Não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando!");
        }
    }

    protected void tampar(){
        this.tampada = true;
    }

    protected void destampar() {
        this.tampada = false;
    }
}
