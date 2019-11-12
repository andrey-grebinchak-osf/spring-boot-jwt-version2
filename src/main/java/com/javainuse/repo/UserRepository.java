package com.javainuse.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javainuse.model.EskillUser;

@Repository
public interface UserRepository extends CrudRepository<EskillUser, Integer> {
	
	EskillUser findByUsername(String username);
	
}