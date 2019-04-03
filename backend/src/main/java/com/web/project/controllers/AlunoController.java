package com.web.project.controllers;

import com.web.project.models.Aluno;
import com.web.project.services.AlunoService;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @Getter(name = "/alunos")
    public List<Aluno> getAll() {

        return alunoService.getAll();

    }
}
