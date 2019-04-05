package com.web.project.services;

import com.web.project.models.ProjetoPesquisa;
import com.web.project.repositories.ProjetoPesquisaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProjetoPesquisaService {

	@Autowired
	private ProjetoPesquisaRepository projetoPesquisaRepository;

	public Optional<ProjetoPesquisa> findById(Long id) {

		return projetoPesquisaRepository.findById(id);
	}

}
