public class Ave extends Animal {
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo grãos");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emite som de passaros");
    }

    public void fazerNinho() {
        System.out.println("Faz ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
