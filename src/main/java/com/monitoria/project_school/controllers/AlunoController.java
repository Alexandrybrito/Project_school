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
import com.monitoria.project_school.services.AlunoService;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;
	
	@GetMapping
	public List<Aluno> findAll() {
		List<Aluno> buscarTodos = alunoService.buscarTodos();
		return buscarTodos;	
	}
	
	@GetMapping(value = "/{id}")
	public Aluno findById(@PathVariable Integer id) {
		return alunoService.buscarPorId(id);	
	}
	
	@PostMapping
	public void inserir(@RequestBody Aluno aluno) {
		alunoService.salvarAtualizar(aluno);
	}

	@DeleteMapping(value = "/{id}")
	public void RemoveAluno(@PathVariable Integer id) {
		alunoService.removePorId(id);
	}
	
	@PutMapping("/aluno")
	public void atualizar(@RequestBody Aluno aluno) {
		alunoService.salvarAtualizar(aluno);
	}
}
