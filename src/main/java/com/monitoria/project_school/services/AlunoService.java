package com.monitoria.project_school.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monitoria.project_school.model.Aluno;
import com.monitoria.project_school.repositories.AlunoRepository;


@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository repository;

	
	public void salvarAtualizar(Aluno aluno) {
		this.repository.save(aluno);
	}
	
	public Aluno buscarPorId(Integer id) {
		return this.repository.findById(id).orElse(null); 
	}
	
	public List<Aluno> buscarTodos() {
		return this.repository.findAll();
	}
	
	public void removePorId(Integer id) {
		this.repository.deleteById(id);
	}
}