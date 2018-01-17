package com.lmig.gfc.TechEducationProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lmig.gfc.TechEducationProject.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByusername(String username);
	
}
