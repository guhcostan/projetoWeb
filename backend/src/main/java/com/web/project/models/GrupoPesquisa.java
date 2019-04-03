package com.web.project.models;


import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@NoArgsConstructor
@Table(name = "grupos_pesquisa")
public class GrupoPesquisa {

    @Id
    private Long id;

    @ManyToMany(mappedBy = "gruposPesquisa")
    private List<Aluno> membros;

}
