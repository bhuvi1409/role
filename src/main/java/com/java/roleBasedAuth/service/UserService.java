package com.java.roleBasedAuth.service;

import org.springframework.stereotype.Service;
import com.java.roleBasedAuth.repo.UserRepo;
import com.java.roleBasedAuth.entity.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
@Service
public class UserService {
	
@Autowired
UserRepo userRepo;

public List<User> getAllUsers() {
	
	return userRepo.findAll();
}

public User addUser(User user) {
	
	return userRepo.save(user);
}

public void deleteUser(int userId) {
	userRepo.deleteById(userId);
	
}

public User updateUser(User user, int userId) {
	User u=new User();
	if(u.getFirstName()!=null) {
		user.setFirstName(u.getFirstName());
	}else if(u.getLastName()!=null) {
		user.setLastName(u.getLastName());
	}else if(u.getPassword()!=null) {
		user.setPassword(u.getPassword());
	}
return userRepo.save(user) ;
}
	


}
