package com.br.springjr.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.springjr.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
// salvar os dados no banco;