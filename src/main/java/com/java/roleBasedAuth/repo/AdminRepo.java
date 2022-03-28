package com.java.roleBasedAuth.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.roleBasedAuth.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {

}
