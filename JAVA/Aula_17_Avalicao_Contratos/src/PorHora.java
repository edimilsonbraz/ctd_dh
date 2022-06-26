public class PorHora extends Contrato implements Comparable<Contrato> {
    private int qtdHoraMensal;
    private double valorHora;

    public PorHora(
            int duracaoContrato,
            String dataInicio,
            boolean registroMT,
            Funcionario funcionario,
            double valorHora,
            int qtdHoraMensal) {
        super(duracaoContrato, dataInicio, registroMT, funcionario);
        this.valorHora = valorHora;
        this.qtdHoraMensal = qtdHoraMensal;
    }

    public int getQtdHoraMensal() {
        return qtdHoraMensal;
    }

    public void setQtdHoraMensal(int qtdHoraMensal) {
        this.qtdHoraMensal = qtdHoraMensal;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public boolean apto() throws AptoException {
        if(!this.getRegistroMT()) {
            throw new AptoException();
        }
        return true ;
    }


    @Override
    public String toString() {
        return "Contrato PorHora{" + ("\n") +
                "funcionario: " + funcionario.getNome() + ("\n") +
                "idade: " + funcionario.getIdade()  + " anos " + ("\n") +
                "inicio: " + this.getDataInicio() + ("\n") +
                "qtdHoraMensal = " + qtdHoraMensal + ("\n") +
                "valorHora = " + valorHora + ("\n") +
                '}';
    }

    @Override
    public int compareTo(Contrato o) {
        if(this.getDuracaoContrato() > o.getDuracaoContrato()) return 1;
        if(this.getDuracaoContrato() < o.getDuracaoContrato()) return -1;
        return 0;
    }


}
