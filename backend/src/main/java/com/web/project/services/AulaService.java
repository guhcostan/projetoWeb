package com.web.project.services;

import com.web.project.models.Aula;
import com.web.project.models.TipoAula;
import com.web.project.repositories.AulaRepository;
import java.util.List;
import java.util.Optional;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AulaService {

	@Autowired
	private AulaRepository aulaRepository;

	@Autowired
	private ProjetoPesquisaService projetoPesquisaService;

	public List<Aula> getAll() {

		return aulaRepository.findAll();
	}

	public void criarAluno(String nome, TipoAula tipo) {

		Aula aula = new Aula(nome, tipo);

		aulaRepository.save(aula);

	}

	public void deletar(Long id) throws NotFoundException {

		Optional<Aula> aula = aulaRepository.findById(id);

		if (!aula.isPresent()) {
			throw new NotFoundException("Aluno não encontrado");
		} else {
			aulaRepository.delete(aula.get());
		}
	}

	public Aula getById(Long id) {

		Optional<Aula> aula = aulaRepository.findById(id);
		return aula.orElse(null);
	}

}
