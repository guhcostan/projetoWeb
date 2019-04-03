package com.web.project.models;


import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@NoArgsConstructor
@Table(name = "grupos_pesquisa")
public class GrupoPesquisa {

    private List<Pessoa> membros;
}
