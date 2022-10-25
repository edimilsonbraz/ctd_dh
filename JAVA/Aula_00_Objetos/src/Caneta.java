public class Caneta {
    //atributos
    String modelo;
    String cor;
    int carga;
    float ponta;
    boolean tampada;

    //métodos
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("A cor da caneta é " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println(" Está tampada? " + this.tampada);
    }

    void rabiscar(){
        if(this.tampada) {
            System.out.println("Erro: Não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando!");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
