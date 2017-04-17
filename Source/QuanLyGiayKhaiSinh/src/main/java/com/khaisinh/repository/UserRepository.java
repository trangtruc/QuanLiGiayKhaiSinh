package com.khaisinh.repository;

import org.springframework.data.repository.CrudRepository;

import com.khaisinh.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	User findByEmail(String email);
	
}
