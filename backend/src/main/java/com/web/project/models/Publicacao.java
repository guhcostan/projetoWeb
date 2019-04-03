package com.web.project.models;


import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Table(name = "publicacoes")
public class Publicacao {

    @Id
    private Long id;

    private byte[] metadados;

}
