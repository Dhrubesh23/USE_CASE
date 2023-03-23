package com.dm.banking.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.dm.banking.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);
	
	public boolean existsByUsername(String username);
		
	
}
