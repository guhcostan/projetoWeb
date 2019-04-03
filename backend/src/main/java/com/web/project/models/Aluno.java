package com.web.project.models;


import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Table(name = "alunos")
public class Aluno {

    @Id
    private Long id;

    private String nome;

    @ManyToMany
    @JoinTable(name = "rel_aluno_grupoPesquisa", joinColumns =
            {@JoinColumn(name = "aluno_id")}, inverseJoinColumns =
            {@JoinColumn(name = "grupo_id")})
    private List<GrupoPesquisa> gruposPesquisa;

    public Aluno(String nome) {

        this.nome = nome;
    }
}
