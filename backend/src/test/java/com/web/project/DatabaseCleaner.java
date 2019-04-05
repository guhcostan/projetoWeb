package com.web.project;

import com.web.project.repositories.AlunoRepository;
import com.web.project.repositories.ContatoRepository;
import com.web.project.repositories.GrupoPesquisaRepository;
import com.web.project.repositories.ProjetoPesquisaRepository;
import com.web.project.repositories.PublicacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManagerFactory;

@Component
public class DatabaseCleaner {

	@Autowired
	private AlunoRepository alunoRepository;

	@Autowired
	private ContatoRepository cleanDocumentoSolicitacao;

	@Autowired
	private GrupoPesquisaRepository grupoPesquisaRepository;

	@Autowired
	private ProjetoPesquisaRepository projetoPesquisaRepository;

	@Autowired
	private PublicacaoRepository publicacaoRepository;

	@Autowired
	private EntityManagerFactory emf;

	public void cleanAll() {

		this.alunoRepository.deleteAll();
		this.cleanDocumentoSolicitacao.deleteAll();
		this.grupoPesquisaRepository.deleteAll();
		this.publicacaoRepository.deleteAll();

	}

}
