package com.web.project;

import com.web.project.repositories.AlunoRepository;
import com.web.project.repositories.AulaRepository;
import com.web.project.repositories.ContatoRepository;
import com.web.project.repositories.GrupoPesquisaRepository;
import com.web.project.repositories.PublicacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseCleaner {

	@Autowired
	private AlunoRepository alunoRepository;

	@Autowired
	private AulaRepository aulaRepository;

	@Autowired
	private ContatoRepository cleanDocumentoSolicitacao;

	@Autowired
	private GrupoPesquisaRepository grupoPesquisaRepository;

	@Autowired
	private PublicacaoRepository publicacaoRepository;

	void cleanAll() {

		this.alunoRepository.deleteAll();
		this.aulaRepository.deleteAll();
		this.cleanDocumentoSolicitacao.deleteAll();
		this.grupoPesquisaRepository.deleteAll();
		this.publicacaoRepository.deleteAll();

	}

}
