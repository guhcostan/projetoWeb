package com.web.project.models;


import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.File;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Table(name = "projetos_pesquisa")
public class ProjetoPesquisa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nome;

	private String resumo;

	private LocalDate anoInicio;

	private LocalDate anoTermino;

	private File arquivo;

	private String dissertacao;

	private String tese;

	@ManyToOne
	@JoinColumn(name = "id_aluno", nullable = false)
	private Aluno pesquisador;

}
