public class Lobo extends Mamifero {
    @Override
    public void emitirSom() {
        System.out.println("Auuuuuu!");
    }

    public void reagir(String frase) {
        if(frase.equals("Toma comida")  || frase.equals("Olá")) {
            System.out.println("Lamber e abanar o rabo");
        }else{
            System.out.println("Rosnarr");
        }
    }

    public void reagir(int hora, int min) {
        if(hora < 12) {
            System.out.println("Abanar o rabo para comer");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar e Latir querendo comida");
        }
    }

    public void reagir(boolean dono) {
        if(dono){
            System.out.println("Abanar para o meu dono");
        }else {
            System.out.println("Rosnar ");
            this.emitirSom();
        }
    }

    public void reagir(int idade, float peso) {
        if(idade < 5) {
            if(peso < 10) {
                System.out.println("Abanar");
            }else{
                this.emitirSom();
            }
        }else if(peso < 10) {
            System.out.println("Rosnar");
        }else{
            System.out.println("Ignorar");
        }
    }
}
