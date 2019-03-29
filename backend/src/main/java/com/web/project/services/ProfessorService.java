package com.web.project.services;

import com.web.project.models.Professor;
import com.web.project.repositories.ProfessorRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    ProfessorRepositorie professorRepositorie;

    public List<Professor> getAll(){
        return professorRepositorie.findAll();
    }
}
