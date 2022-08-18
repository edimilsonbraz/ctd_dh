public class FilialService {
    private final IDao<Filial> filialIDao;


    public FilialService(IDao<Filial> filialIDao) {
        this.filialIDao = filialIDao;
    }

    public Filial salvar(Filial filial){

        return filialIDao.salvar(filial);
    }

}
