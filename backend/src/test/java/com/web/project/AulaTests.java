package com.web.project;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.web.project.controllers.AlunoController;
import com.web.project.controllers.AulaController;
import javassist.NotFoundException;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class AulaTests extends ProjectApplicationTests {

	private MockMvc mockMvc;

	@Autowired
	private AulaController aulaController;

	@Before
	public void setUp() {

		databaseCleaner.cleanAll();

		this.mockMvc = MockMvcBuilders.standaloneSetup(aulaController).build();
	}

	@Test
	public void getAllAulas() throws Exception {

		databaseCleaner.cleanAll();

		this.mockMvc.perform(MockMvcRequestBuilders.get("/aulas"))
			.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void createAula() throws Exception {

		databaseCleaner.cleanAll();

		this.mockMvc.perform(
			MockMvcRequestBuilders.post("/cadastraAula").param("nome", "Aula").param("tipoAula", "GRADUACAO"))
			.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void deletaAula() throws Exception {

		databaseCleaner.cleanAll();

		aulaController.createAula("Gustavo", "GRADUACAO");

		this.mockMvc
			.perform(MockMvcRequestBuilders.delete("/deletaAula").param("id", "1"))
			.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void deletaAlunoInexistente() {

		databaseCleaner.cleanAll();

		assertThatThrownBy(() -> this.mockMvc.perform(MockMvcRequestBuilders.delete(
			"/deletaAula").param("id", "6"))
			.andExpect(MockMvcResultMatchers.status().isNotFound()))
			.hasCause(new NotFoundException("Aluno não encontrado"));
	}

}
