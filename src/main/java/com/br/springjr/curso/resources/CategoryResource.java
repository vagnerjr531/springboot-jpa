package com.br.springjr.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;          //Controlador rest
																		
									
import com.br.springjr.curso.entities.Category;
import com.br.springjr.curso.services.CategoryService;

																	//caminho do recurso  no caso /Categorys

@RestController
@RequestMapping(value = "/categories")           				 // essa classe é um recurso web que é implementado por um contorlador rest.
public class CategoryResource {        
	@Autowired
	private CategoryService service;
	@GetMapping                       					 //metodo que responde ao tipo get do http.
	public ResponseEntity<List<Category>> findAll(){			//endpoint para acessar os usuários RenposeEntity. find all retorna todos
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value ="/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
/*
Quando tem um objeto que ele vai poder ser injetado pelo spring, a classe vai ter que está registrada;

*/