package com.repgen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.repgen.model.User;

@Repository("repgen_userRepository")
public interface UserRepository extends JpaRepository<User, Long>  {
	
}
