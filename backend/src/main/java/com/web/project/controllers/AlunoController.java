package com.web.project.controllers;

import com.web.project.models.Aluno;
import com.web.project.models.TipoAluno;
import com.web.project.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlunoController {

	@Autowired
	private AlunoService alunoService;

	@GetMapping(value = "/alunos")
	public List<Aluno> getAll() {

		return alunoService.getAll();

	}

	@PostMapping(value = "/cadastrarAluno")
	public void createAluno(String nome, String cpf, String tipoAluno) {

		alunoService.criarAluno(nome, cpf, TipoAluno.valueOf(tipoAluno));

	}

	@PostMapping(value = "/adicionarProjetoAluno")
	public void adicionarProjetoAluno(String cpfAluno, Long idProjeto) {

		alunoService.vincularProjetoAluno(cpfAluno, idProjeto);

	}

	@DeleteMapping(value = "/deletaAluno")
	public void deletaAluno(String cpf) throws Exception {

		alunoService.deletar(cpf);

	}

}
