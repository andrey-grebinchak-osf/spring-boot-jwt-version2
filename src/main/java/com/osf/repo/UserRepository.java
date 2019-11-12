package com.osf.repo;

import com.osf.model.EskillUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<EskillUser, Integer> {
	
	EskillUser findByUsername(String username);
	
}