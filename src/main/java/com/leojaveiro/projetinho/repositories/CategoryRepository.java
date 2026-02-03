package com.leojaveiro.projetinho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leojaveiro.projetinho.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
