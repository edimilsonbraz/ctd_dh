public class Main {
    public static void main(String[] args) {
        EmpregadoFactory ef = EmpregadoFactory.getInstance();
        Empregado empregado = ef.criarEmpregado("Edimilson", "EMP-INT");
        ((EmpregadoRelacaoDep) empregado).setSalarioMensal(7300);

        Empregado empregado2 = ef.criarEmpregado("Diego", "EMP-EXT");
        ((EmpregadoContratado) empregado2).setValorHora(41.66);
        ((EmpregadoContratado) empregado2).setImposto(89.98);

        System.out.println(empregado.calcularSalario(30));
        System.out.println(empregado2.calcularSalario(30));


    }
}
