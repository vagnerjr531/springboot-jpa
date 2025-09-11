package com.br.springjr.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.springjr.curso.entities.User;
import com.br.springjr.curso.repository.UserRepository;


@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	public List<User> findAll(){
		return repository.findAll()
;	}
	
	public User findById(Long id) {							// recuperar usuario por id; Optional do tipo User 
		Optional<User> obj =repository.findById(id);
		return obj.get();
	}
	
}


//buscar todos os usuarios 
//buscar usuario por id
