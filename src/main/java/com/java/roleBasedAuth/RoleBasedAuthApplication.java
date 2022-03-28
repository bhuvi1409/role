package com.java.roleBasedAuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
@EnableJpaAuditing(auditorAwareRef="auditorAware")
@SpringBootApplication
public class RoleBasedAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoleBasedAuthApplication.class, args);
	}

}
