import java.time.LocalDate;

public abstract class Contrato {
    private int duracaoContrato;
    private LocalDate dataInicio;
    private boolean registroMT;

    public abstract boolean apto();

    public Contrato(int duracaoContrato, LocalDate dataInicio, boolean registroMT){
        this.duracaoContrato = duracaoContrato;
        this.dataInicio = dataInicio;
        this.registroMT = registroMT;
    }
    public boolean getRegistroMT() {
        return registroMT;
    }
    public int getDuracaoContrato() {
        return duracaoContrato;
    }

}
