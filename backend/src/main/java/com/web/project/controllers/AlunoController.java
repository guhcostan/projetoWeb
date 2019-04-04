package com.web.project.controllers;

import com.web.project.models.Aluno;
import com.web.project.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping(name = "/alunos")
    public List<Aluno> getAll() {

        return alunoService.getAll();

    }

    @PostMapping(name = "/aluno")
    public void createAluno(String nome) {

        alunoService.criarAluno(nome);

    }
}
