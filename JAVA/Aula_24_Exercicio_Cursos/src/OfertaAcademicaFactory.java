public class OfertaAcademicaFactory {
    private final static String FRONT_END = "front";
    private final static String BACK_END = "back-end";

    private static OfertaAcademicaFactory instance;
    private OfertaAcademicaFactory(){}

    public static OfertaAcademicaFactory getInstance() {
        if(instance == null) {
            instance = new OfertaAcademicaFactory();
        }
        return instance;
    }

    public OfertaAcademica criarOferta(){

    }
}
