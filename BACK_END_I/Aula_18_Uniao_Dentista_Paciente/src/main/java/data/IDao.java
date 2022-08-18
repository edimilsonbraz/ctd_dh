package data;

public interface IDao <T>{
    public T cadastrar(T t);

    public T buscar(int id);

    public T deletar(int id);

    public T modificar(int id);
}
