public class Visibilidade {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f; //não dá pra acessar pq está private
        c1.carga = 80;
        c1.tampada = true;
        c1.destampar();
        //c1.rabiscar(); //Não deixa acessar pq está private
        c1.status();
    }
}
