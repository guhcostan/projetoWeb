package com.web.project.controllers;

import com.web.project.models.Professor;
import com.web.project.services.ProfessorService;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProfessorController {

    @Autowired
    ProfessorService professorService;

    @Getter(name = "/professores")
    public List<Professor> getAll() {

        return professorService.getAll();

    }
}
