public class SerieProxy implements ISerie{
    private int qtdViews = 0;

    @Override
    public String getSerie(String nomeSerie) {
        if(qtdViews <= 5) {
            Serie serie = new Serie();
            serie.getSerie(nomeSerie);
        }else{
            throw new RuntimeException("Excede o número de reproduções permitidas");
        }

        return null;
    }
}
