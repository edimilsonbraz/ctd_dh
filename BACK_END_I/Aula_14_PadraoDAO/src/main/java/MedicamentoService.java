public class MedicamentoService {

    private final IDao<Medicamento> medicamentoIDao;

    public MedicamentoService(IDao<Medicamento> medicamentoIDAO){
        this.medicamentoIDao = medicamentoIDAO;
    }

    public Medicamento salvar(Medicamento medicamento){
        return medicamentoIDao.salvar(medicamento);
    }

    public Medicamento buscar(Integer id){
        return medicamentoIDao.buscar(id);
    }
}
