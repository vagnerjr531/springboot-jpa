package com.br.springjr.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.springjr.curso.entities.Product;
import com.br.springjr.curso.repository.ProductRepository;


@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	public List<Product> findAll(){
		return repository.findAll()
;	}
	
	public Product findById(Long id) {							// recuperar usuario por id; Optional do tipo Product 
		Optional<Product> obj =repository.findById(id);
		return obj.get();
	}
	
}


//buscar todos os usuarios 
//buscar usuario por id
