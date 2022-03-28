package com.java.roleBasedAuth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.java.roleBasedAuth.entity.Admin;
import com.java.roleBasedAuth.repo.AdminRepo;

@Service
public class AdminService {
	
	@Autowired
	AdminRepo adminRepo;
	

	public Admin addAdmin(Admin admin) {
		return adminRepo.save(admin);
	}


	public List<Admin> getAllAdmin() {
		return adminRepo.findAll() ;
	}


	public void removeAdmin(int adminId) {
		adminRepo.deleteById(adminId); ;
	}


	public Admin updateAdmin(Admin admin, int adminId) {
		Admin a=new Admin();
		if(a.getFirstName()!=null) {
			admin.setFirstName(a.getFirstName());
		}else if(a.getLastName()!=null) {
			admin.setLastName(a.getLastName());
		}else if(a.getPassword()!=null) {
			admin.setPassword(a.getPassword());
		}
		return adminRepo.save(admin);
	}


}
