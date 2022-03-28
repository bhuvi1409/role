package com.java.roleBasedAuth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.roleBasedAuth.entity.User;
import com.java.roleBasedAuth.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/getAllUser")
public List<User> getAllUser() {
	return userService.getAllUsers();
}
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	@DeleteMapping("/removeUser/{id}")
	public void deleteUser(@PathVariable("id")int userId) {
		userService.deleteUser(userId);
	}
	@PutMapping("/updateUser/{id}")
	public User updateUser(@RequestBody User user,@PathVariable("id")int userId ) {
		return userService.updateUser(user,userId);
	}
}
