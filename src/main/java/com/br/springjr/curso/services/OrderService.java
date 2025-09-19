package com.br.springjr.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.springjr.curso.entities.Order;

import com.br.springjr.curso.repository.OrderRepository;


@Service
public class OrderService {
	@Autowired
	private OrderRepository repository;
	public List<Order> findAll(){
		return repository.findAll()
;	}
	
	public Order findById(Long id) {							// recuperar usuario por id; Optional do tipo User 
		Optional<Order> obj =repository.findById(id);
		return obj.get();
	}
	
}


//buscar todos os usuarios 
//buscar usuario por id
