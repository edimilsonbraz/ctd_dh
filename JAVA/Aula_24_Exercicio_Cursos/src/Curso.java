public class Curso extends OfertaAcademica{
    private final double cargaHoraria;
    private final double duracao;
    private final double valorHora;

    public Curso(
            String nome,
            String descricao,
            double cargaHoraria,
            double duracao,
            double valorHora
    ) {
        super(nome, descricao);
        this.cargaHoraria = cargaHoraria;
        this.duracao = duracao;
        this.valorHora = valorHora;
    }

    @Override
    double calcularPreco() {
        return (cargaHoraria * valorHora) * duracao;
    }
}
