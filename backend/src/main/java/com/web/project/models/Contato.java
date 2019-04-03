package com.web.project.models;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Table(name = "contato")
public class Contato {

    @Id
    private Long id;

    private String telefone;

    private String sala;

}
