import java.time.LocalDate;

public class Impressora {
    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricacao;
    private int folhasDisponiveis;

    public Impressora(
            String modelo,
            String tipoConexao,
            LocalDate dataFabricacao
    ) {
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = 0;
    }

    public Impressora(
            String modelo,
            String tipoConexao,
            LocalDate dataFabricacao,
            int folhasDisponiveis
    ) {
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = folhasDisponiveis;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getFolhasDisponiveis() {
        return folhasDisponiveis;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }

    private boolean temPapel() {
        return this.folhasDisponiveis > 0;
    }

    public void imprimir(String texto) {
        if (temPapel()) {
            System.out.println("Imprimiu " + texto);
            folhasDisponiveis--;
        } else {
            System.out.println("Não tem papel");
        }
    }
}