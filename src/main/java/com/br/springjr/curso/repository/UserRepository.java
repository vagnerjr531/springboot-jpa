package com.br.springjr.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.springjr.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
// salvar os dados no banco;