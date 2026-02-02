package com.leojaveiro.projetinho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leojaveiro.projetinho.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
