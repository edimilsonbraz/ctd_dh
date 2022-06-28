public class EmpregadoFactory {
    private static EmpregadoFactory instance;
    private EmpregadoFactory(){}

    public Empregado criarEmpregado(String nome, String tipo){
        if(tipo.equals("EMP-INT")){
            return new EmpregadoRelacaoDep(nome);
        }else if (tipo.equals("EMP-EXT")){
            return new EmpregadoContratado(nome);
        }
        throw new RuntimeException("O tipo não existe");
    }

    //Singleton
    public static EmpregadoFactory getInstance(){
        if(instance == null){
            instance = new EmpregadoFactory();
        }

        return instance;
    }
}
