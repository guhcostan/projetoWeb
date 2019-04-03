package com.web.project.models;


import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@NoArgsConstructor
@Table(name = "professores")
public class Professor {

    private Pessoa pessoa;

    private List<Aluno> alunos;

    private Contato dadosContato;

}
