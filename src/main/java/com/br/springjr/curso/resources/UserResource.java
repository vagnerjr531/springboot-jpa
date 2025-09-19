package com.br.springjr.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;          //Controlador rest
																		
//Quando tem um objeto que ele vai poder ser injetado pelo spring, a classe vai ter que está registrada;
import com.br.springjr.curso.entities.User;
import com.br.springjr.curso.services.UserService;

//caminho do recurso  no caso /users

@RestController
@RequestMapping(value = "/users")            // essa classe é um recurso web que é implementado por um contorlador rest.
public class UserResource {        
	@Autowired
	private UserService service;
	@GetMapping   //metodo que responde ao tipo get do http.
	public ResponseEntity<List<User>> findAll(){//endpoint para acessar os usuários RenposeEntity. find all retorna todos
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value ="/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
