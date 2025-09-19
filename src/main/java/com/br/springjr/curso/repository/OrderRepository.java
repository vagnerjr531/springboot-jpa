package com.br.springjr.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.springjr.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
// salvar os dados no banco;