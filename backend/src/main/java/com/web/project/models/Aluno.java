package com.web.project.models;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;

    @ManyToMany
    @JoinTable(name = "rel_aluno_grupo_pesquisa", joinColumns =
            {@JoinColumn(name = "aluno_id")}, inverseJoinColumns =
            {@JoinColumn(name = "grupo_id")})
    private List<GrupoPesquisa> gruposPesquisa;

    @OneToMany(mappedBy = "pesquisador")
    private List<ProjetoPesquisa> projetoPesquisas;

    private TipoAluno tipo;

    public Aluno(String nome, String cpf, TipoAluno doutorado) {

        this.nome = nome;
        this.tipo = doutorado;
        this.cpf = cpf;
    }

    public void addProjeto(ProjetoPesquisa projetoPesquisa) {

        this.projetoPesquisas.add(projetoPesquisa);
    }

}
