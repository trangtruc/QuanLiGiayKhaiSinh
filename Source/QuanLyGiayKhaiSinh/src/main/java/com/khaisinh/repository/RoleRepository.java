package com.khaisinh.repository;

import org.springframework.data.repository.CrudRepository;

import com.khaisinh.domain.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {

	Role findByName(String name);
	
}
