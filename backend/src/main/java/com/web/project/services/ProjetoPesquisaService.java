package com.web.project.services;

import com.web.project.models.Aluno;
import com.web.project.models.ProjetoPesquisa;
import com.web.project.repositories.AlunoRepository;
import com.web.project.repositories.ProjetoPesquisaRepository;
import java.io.File;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjetoPesquisaService {

	@Autowired
	private ProjetoPesquisaRepository projetoPesquisaRepository;

	@Autowired
	private AlunoRepository alunoRepository;

	public List<ProjetoPesquisa> getAll() {

		return projetoPesquisaRepository.findAll();
	}

	public void criaProjetoPesquisa(String nome, String resumo, LocalDate anoInicio,
		LocalDate anoTermino,
		File arquivo,
		String dissertacao, String tese, String pesquisadorCpf) {

		Optional<Aluno> pesquisador = alunoRepository.findByCpf(pesquisadorCpf);

		if (pesquisador.isPresent()) {

			ProjetoPesquisa projetoPesquisa = new ProjetoPesquisa(nome, resumo, anoInicio,
				anoTermino,
				arquivo,
				dissertacao, tese, pesquisador.get());

			projetoPesquisaRepository.save(projetoPesquisa);
		} else {
			throw new NullPointerException("Pesquisador não encontrado");
		}

	}

	public void deletar(Long id) throws NotFoundException {

		Optional<ProjetoPesquisa> projetoPesquisa = projetoPesquisaRepository.findById(id);

		if (!projetoPesquisa.isPresent()) {
			throw new NotFoundException("Projeto de Pesquisa não encontrado");
		} else {
			projetoPesquisaRepository.delete(projetoPesquisa.get());
		}
	}

	public Optional<ProjetoPesquisa> getById(Long id) {

		return projetoPesquisaRepository.findById(id);
	}

}
