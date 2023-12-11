package com.monitoria.project_school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monitoria.project_school.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
	
	
}
