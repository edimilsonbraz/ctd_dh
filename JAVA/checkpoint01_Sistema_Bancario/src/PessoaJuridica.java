import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String inscricaoEstadual;

    public PessoaJuridica(String nome, String endereco, String cnpj, String inscricaoEstadual) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public PessoaJuridica(String cnpj, String inscricaoEstadual) {
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public PessoaJuridica() {
    }
}