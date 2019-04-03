package com.web.project.models;


import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.File;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Table(name = "projetos_pesquisa")
public class ProjetoPesquisa {

    @Id
    private Long id;

    private String nome;

    private String resumo;

    private LocalDate anoInicio;

    private LocalDate anoTermino;

    private File arquivo;

    private String dissertacao;

    private String tese;

}
