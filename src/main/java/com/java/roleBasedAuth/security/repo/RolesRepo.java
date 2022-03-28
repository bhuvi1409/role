package com.java.roleBasedAuth.security.repo;

import org.springframework.stereotype.Repository;

import com.java.roleBasedAuth.security.entity.Role;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RolesRepo extends JpaRepository<Role, Integer>{

}
