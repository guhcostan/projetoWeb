package com.web.project;

import com.web.project.controllers.AlunoController;
import javassist.NotFoundException;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class AlunoTests extends ProjectApplicationTests {

	private MockMvc mockMvc;

	@Autowired
	private AlunoController alunoController;

	@Before
	public void setUp() {

		databaseCleaner.cleanAll();

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

		databaseCleaner.cleanAll();

		alunoController.createAluno("Gustavo", "12312312312", "DOUTORADO");

		this.mockMvc.perform(MockMvcRequestBuilders.delete("/deletaAluno").param("cpf", "12312312312")).andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void deletaAlunoInexistente() {

		databaseCleaner.cleanAll();

		assertThatThrownBy(() -> this.mockMvc.perform(MockMvcRequestBuilders.delete(
				"/deletaAluno").param("cpf", "12312312312")).andExpect(MockMvcResultMatchers.status().isNotFound())).hasCause(new NotFoundException("Aluno não encontrado"));
	}

	@Test
	public void vinculaAlunoProjeto() throws Exception {

		databaseCleaner.cleanAll();

		alunoController.createAluno("Gustavo", "12312312312", "DOUTORADO");

		this.mockMvc.perform(MockMvcRequestBuilders.post("/adicionarProjetoAluno").param("cpfAluno", "12312312312").param("idProjeto", "1")).andExpect(MockMvcResultMatchers.status().isOk());

	}

}
