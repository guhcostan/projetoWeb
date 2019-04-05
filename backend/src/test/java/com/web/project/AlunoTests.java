package com.web.project;

import com.web.project.controllers.AlunoController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class AlunoTests extends ProjectApplicationTests {

	private MockMvc mockMvc;

	@Autowired
	private AlunoController alunoController;

	@Before
	public void setUp() {

		this.mockMvc = MockMvcBuilders.standaloneSetup(alunoController).build();
	}

	@Test
	public void getAllAlunos() throws Exception {

		this.mockMvc.perform(MockMvcRequestBuilders.get("/alunos")).andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void createAluno() throws Exception {

		this.mockMvc.perform(MockMvcRequestBuilders.post("/cadastrarAluno").param("nome", "Gustavo").param("cpf",
				"12312312312").param("tipoAluno", "DOUTORADO")).andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void deletaAluno() throws Exception {

		this.mockMvc.perform(MockMvcRequestBuilders.delete("/deletaAluno").param("cpf", "12312312312")).andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void deletaAlunoInexistente() throws Exception {

		try {
			this.mockMvc.perform(MockMvcRequestBuilders.delete("/deletaAluno").param("cpf", "1231231112"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
