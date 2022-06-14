public class ContaCorrente  extends Conta implements GravarImposto {
    private double valorPermitido;
    private double valor;

    @Override
    public void sacar(double valor) {
        if(valor == 0 || valor > valorPermitido)
            throw new IllegalStateException("Valor inválido");

        this.valor = valor;

        if(valor > getSaldo(getSaldo() - (valor + (valor * porc) / 100))){
            setSaldo(0);
        }else{
            setSaldo(getSaldo(getSaldo() - (valor + (valor * porc) / 100)) - valor);
        }
    }

    @Override
    public void imposto(double porc) {
        //TODO implementar desconto
        getSaldo(getSaldo(getSaldo() - (valor + (valor * porc) / 100)) - (valor + (valor * porc)/100));
    }
}
