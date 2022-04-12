package com.demo.javatechie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.javatechie.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer > {

	
	Product findByName(String name);
}
