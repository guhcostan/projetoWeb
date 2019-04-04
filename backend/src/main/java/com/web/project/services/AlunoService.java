package com.web.project.services;

import com.web.project.models.Aluno;
import com.web.project.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;

	public List<Aluno> getAll() {

		return alunoRepository.findAll();
	}

	public void criarAluno(String nome) {

		Aluno aluno = new Aluno(nome);

		alunoRepository.save(aluno);
	}

}
