package com.web.project.repositories;

import com.web.project.models.Aluno;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

	Optional<Aluno> findByCpf(String cpfAluno);

}
