public class Serie implements ISerie {


    @Override
    public String getSerie(String nomeSerie) {
        return "www." + nomeSerie;
    }
}
