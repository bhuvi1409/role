package com.java.roleBasedAuth.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.roleBasedAuth.entity.Admin;
import com.java.roleBasedAuth.security.entity.Role;
import com.java.roleBasedAuth.security.repo.RolesRepo;

@Service
public class RoleService {
	
	@Autowired
	RolesRepo roleRepo;
	//get all roles
	public List<Role> findAll(){
		return roleRepo.findAll();
	}
	//get role by id
	public Role findById(int id) {
return roleRepo.getById(id);
	}
	//delete role
	public void delete(int id) {
		roleRepo.deleteById(id);
	}
	//update role
	public void update(Role role) {
		roleRepo.save(role);
	}
}




