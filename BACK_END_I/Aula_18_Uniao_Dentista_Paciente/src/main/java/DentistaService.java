import data.IDao;
import model.Dentista;

public class DentistaService {
    private IDao<Dentista> dentistaIDao;

    public DentistaService(IDao<Dentista> dentistaIDao) {
        this.dentistaIDao = dentistaIDao;
    }

    public Dentista cadastrar(Dentista dentista){
        return dentistaIDao.cadastrar(dentista);
    }

    public Dentista buscar(int id){
        return dentistaIDao.buscar(id);
    }

    public Dentista deletar(int id) {
        return dentistaIDao.deletar(id);
    }

    public Dentista modificar(int id) {
        return dentistaIDao.modificar(id);
    }
}
