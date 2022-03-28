package com.java.roleBasedAuth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.java.roleBasedAuth.entity.Admin;
import com.java.roleBasedAuth.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@PostMapping("/addAdmin")
	public Admin AddAdmin(@RequestBody Admin admin) {
		return adminService.addAdmin(admin);
	}
	
	@GetMapping("/getAdmin")
	public List<Admin> getAllAdmin() {
		return adminService.getAllAdmin();
		
	}
	
	@DeleteMapping("/deleteAdmin")
	public void removeAdmin(@PathVariable("id")int adminId) {
		adminService.removeAdmin(adminId);
	}
	
	@PutMapping("/updateAdmin")
	public Admin updateAdmin(@RequestBody Admin admin,@PathVariable("id")int adminId ){
		return adminService.updateAdmin(admin,adminId);
	}
		
	}


