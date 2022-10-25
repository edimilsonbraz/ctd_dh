package com.example.TestesIntegrados;

import com.example.TestesIntegrados.controller.LinguagemController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)//Precisa dessa anotação apenas para habilitar os recursos do spring como exemplo:
	//@Autowired, @MockBean durante os testes
@WebMvcTest(LinguagemController.class)//Indicando onde iremos começar o nosso teste
class TestesIntegradosApplicationTests {

	@Autowired
	private MockMvc mockMvc; //Recurso que vai nos permite acessar a URL

	@Test
	void buscarTodasLinguagensAPI() throws Exception {
		//agora vamos construir nossa consulta e algum tipo de validação
		mockMvc.perform(MockMvcRequestBuilders.get("/linguagens")
						.accept(MediaType.APPLICATION_JSON))//estou indicando que ele irá aceitar arquivos do tipo JSON
						.andDo(MockMvcResultHandlers.print())//vai printar no console as informações advindas deste comando
						.andExpect(MockMvcResultMatchers.status().isOk());//aqui eu indico o que ele espera
	}

	@Test
	void buscarLinguagemPorTipoAPI() throws Exception{
		//agora vamos construir nossa consulta e algum tipo de validação
		mockMvc.perform(MockMvcRequestBuilders.get("/linguagens/{tipo}","Java")
						.accept(MediaType.APPLICATION_JSON))//estou indicando que ele irá aceitar arquivos do tipo JSON
				.andDo(MockMvcResultHandlers.print())//vai printar no console as informações advindas deste comando
				.andExpect(MockMvcResultMatchers.status().isOk());//aqui eu indico o que ele espera
	}

	@Test
	void buscarLinguagensNaoExistentesPorTipoAPI() throws Exception{
		//agora vamos construir nossa consulta e algum tipo de validação
		mockMvc.perform(MockMvcRequestBuilders.get("/linguagens/{tipo}","Linguagem C")
						.accept(MediaType.APPLICATION_JSON))//estou indicando que ele irá aceitar arquivos do tipo JSON
				.andDo(MockMvcResultHandlers.print())//vai printar no console as informações advindas deste comando
				.andExpect(MockMvcResultMatchers.status().isNotFound());//aqui eu indico o que ele espera
	}

	@Test
	void contextLoads() {
	}

}
