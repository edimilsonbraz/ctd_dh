import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaFisica extends Cliente {
    private String cpf;
    private String rg;

    public PessoaFisica(String nome, String endereco, String cpf, String rg) {
        super(nome, endereco);
        this.cpf = cpf;
        this.rg = rg;
    }

    public PessoaFisica(String cpf, String rg) {
        this.cpf = cpf;
        this.rg = rg;
    }

    public PessoaFisica() {
    }
}