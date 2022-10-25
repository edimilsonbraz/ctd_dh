public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

//        m.setCorPelo("marron");
//        m.setPeso(38.5f);
//        m.setIdade(12);
//        m.alimentar();
//        m.locomover();
//        m.emitirSom();

//        p.setPeso(5f);
//        p.setCorEscama("vermelho");
//        p.alimentar();
//        p.locomover();
//        p.emitirSom();
//        p.soltarBolha();

//        m.locomover();
//        r.locomover();
//        p.locomover();
//        a.locomover();

        Canguru litter = new Canguru();
        Cachorro rex = new Cachorro();
        Cobra jiboia = new Cobra();
        Tartaruga talento = new Tartaruga();
        Goldfish nemo = new Goldfish();
        Arara azul = new Arara();

        litter.locomover();
        litter.usarBolsa();

        rex.locomover();
        rex.alimentar();
        rex.emitirSom();

    }
}
