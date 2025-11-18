package com.br.springjr.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.springjr.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
// salvar os dados no banco;