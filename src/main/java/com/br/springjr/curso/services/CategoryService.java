package com.br.springjr.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.springjr.curso.entities.Category;

import com.br.springjr.curso.repository.CategoryRepository;


@Service
public class CategoryService {
	@Autowired
	private CategoryRepository repository;
	public List<Category> findAll(){
		return repository.findAll()
;	}
	
	public Category findById(Long id) {							// recuperar usuario por id; Optional do tipo User 
		Optional<Category> obj =repository.findById(id);
		return obj.get();
	}
	
}


//buscar todos os usuarios 
//buscar usuario por id
