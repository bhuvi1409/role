package com.java.roleBasedAuth.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.roleBasedAuth.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{
}
