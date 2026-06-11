package com.jailsondev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jailsondev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
	
}
