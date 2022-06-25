import java.time.LocalDate;

public class PorHora extends Contrato implements Comparable<Contrato> {
    private int qtdHoraMensal;
    private double valorHora;

    public PorHora(int duracaoContrato, int dataInicio, boolean registroMT) {
        super(duracaoContrato, LocalDate.ofEpochDay(dataInicio), registroMT);
    }

    @Override
    public boolean apto() {
        if(this.getRegistroMT()) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Contrato o) {
        if(this.getDuracaoContrato() > o.getDuracaoContrato()) return 1;
        if(this.getDuracaoContrato() < o.getDuracaoContrato()) return -1;
        return 0;
    }
}
