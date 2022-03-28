package com.java.roleBasedAuth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Admin_Table")
public class Admin {
	@Id
	@Column(name="User_Id")
	private int userId;
	@Column(name="First_Name")
	private String firstName;
	@Column(name="Last_name")
	private String LastName;
	@Column(name="Email_Id")
	private String emailId;
	@Column(name="Login_password")
	private String password;
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Admin(int userId, String firstName, String lastName, String emailId, String password) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		LastName = lastName;
		this.emailId = emailId;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [userId=" + userId + ", firstName=" + firstName + ", LastName=" + LastName + ", emailId="
				+ emailId + ", password=" + password + "]";
	}
	

}
