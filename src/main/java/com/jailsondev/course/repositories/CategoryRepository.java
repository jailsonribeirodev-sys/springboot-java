package com.jailsondev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jailsondev.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
	
}
