package com.monitoria.project_school.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monitoria.project_school.model.Aluno;
import com.monitoria.project_school.repositories.AlunoRepository;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoRepository repository;
	
	@GetMapping
	public List<Aluno> findAll() {
		List<Aluno> todos = repository.findAll();
		return todos;	
	}
	
	@GetMapping(value = "/{id}")
	public Aluno findById(@PathVariable Integer id) {
		Aluno umPorVez = repository.findById(id).get();
		return umPorVez;
	}
	
	@PostMapping
	public Aluno insert(@RequestBody Aluno aluno) {
		Aluno salvaNovoAluno = repository.save(aluno);
		return salvaNovoAluno;
	}

	@DeleteMapping(value = "/{id}")
	public void RemoveAluno(@PathVariable Integer id) {
		repository.deleteById(id);
	}
	
	@PutMapping("/aluno")
	public Aluno atualizar(@RequestBody Aluno aluno) {
		return repository.save(aluno);
	}
}
