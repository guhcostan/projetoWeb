package com.web.project.controllers;

import com.web.project.models.Professor;
import com.web.project.services.ProfessorService;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @Getter(name = "/professores")
    public List<Professor> getAll() {

        return professorService.getAll();

    }
}
