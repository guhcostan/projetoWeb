package com.web.project.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.File;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "projetos_pesquisa")
public class ProjetoPesquisa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
