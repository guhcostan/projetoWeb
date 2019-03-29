package com.web.project.repositories;

import com.web.project.models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepositorie extends JpaRepository<Professor,Long> {
}
