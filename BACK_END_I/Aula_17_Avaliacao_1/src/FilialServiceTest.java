import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilialServiceTest {
    FilialService filialService;

    @BeforeEach
    void doBefore(){

        filialService = new FilialService(new FilialDaoH2(new ConfiguracaoJDBC()));
    }

    @Test
    public void salvarFilial(){
        Filial filial1 = new Filial("Clinica_Brasilia", "Avenida Cnb", "05", "Taguatinga", "DF", 1);
        filialService.salvar(filial1);
        assertTrue(filial1.getId()!=null);
    }
}