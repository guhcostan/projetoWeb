package com.web.project.services;

import com.web.project.models.Aluno;
import com.web.project.models.ProjetoPesquisa;
import com.web.project.models.TipoAluno;
import com.web.project.repositories.AlunoRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;

	@Autowired
	private ProjetoPesquisaService projetoPesquisaService;

	public List<Aluno> getAll() {

		return alunoRepository.findAll();
	}

	public void criarAluno(String nome, String cpf, TipoAluno tipoAluno) {

		Aluno aluno = new Aluno(nome, cpf, tipoAluno);

		alunoRepository.save(aluno);

	}

	public void vincularProjetoAluno(String cpfAluno, Long idProjeto) {

		Optional<Aluno> aluno = alunoRepository.findByCpf(cpfAluno);

		Optional<ProjetoPesquisa> projetoPesquisa = projetoPesquisaService.findById(idProjeto);

		projetoPesquisa.ifPresent(pesquisa -> aluno.ifPresent(value -> value.addProjeto(pesquisa)));

	}

	public void deletar(String cpf) throws NotFoundException {

		Optional<Aluno> aluno = alunoRepository.findByCpf(cpf);

		if (!aluno.isPresent()) {
			throw new NotFoundException("Aluno não encontrado");
		} else {
			alunoRepository.delete(aluno.get());
		}
	}

}
