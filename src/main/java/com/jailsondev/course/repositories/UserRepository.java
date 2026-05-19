package com.jailsondev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jailsondev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
	
}
