package com.web.project.models;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Table(name = "contato")
public class Contato {

    private String telefone;

    private String sala;

}
