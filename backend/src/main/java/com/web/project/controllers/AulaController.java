package com.web.project.controllers;

import com.web.project.models.Aula;
import com.web.project.models.TipoAula;
import com.web.project.services.AulaService;
import java.util.List;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AulaController {

	@Autowired
	private AulaService aulaService;

	@GetMapping(value = "/aulas")
	public List<Aula> getAll() {

		return aulaService.getAll();

	}

	@GetMapping(value = "/aula")
	public Aula getById(Long id) {

		return aulaService.getById(id);

	}

	@PostMapping(value = "/cadastraAula")
	public void createAluno(String nome, String tipoAula) {

		aulaService.criarAluno(nome, TipoAula.valueOf(tipoAula));

	}

	@DeleteMapping(value = "/deletaAula")
	public void deletaAluno(long id) throws NotFoundException {

		aulaService.deletar(id);

	}

}
