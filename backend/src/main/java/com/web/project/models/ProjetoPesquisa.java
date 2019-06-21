package com.web.project.models;


import java.io.File;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

	public ProjetoPesquisa(String nome, String resumo, LocalDate anoInicio, LocalDate anoTermino,
		File arquivo, String dissertacao, String tese, Aluno pesquisador) {
		this.nome = nome;
		this.resumo = resumo;
		this.anoInicio = anoInicio;
		this.anoTermino = anoTermino;
		this.arquivo = arquivo;
		this.dissertacao = dissertacao;
		this.tese = tese;
		this.pesquisador = pesquisador;

	}

}
