package com.web.project.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.Optional;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@Table(name = "alunos")
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nome;

	@ManyToMany
	@JoinTable(name = "rel_aluno_grupo_pesquisa", joinColumns =
			{@JoinColumn(name = "aluno_id")}, inverseJoinColumns =
			{@JoinColumn(name = "grupo_id")})
	private List<GrupoPesquisa> gruposPesquisa;

	private List<Optional<ProjetoPesquisa>> projetoPesquisas;

	private TipoAluno tipo;

	public Aluno(String nome, TipoAluno doutorado) {

		this.nome = nome;
		this.tipo = doutorado;

	}

	public void addProjeto(Optional<ProjetoPesquisa> projetoPesquisa) {

		this.projetoPesquisas.add(projetoPesquisa);
	}

}
