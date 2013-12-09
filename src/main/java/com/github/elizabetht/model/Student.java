package com.github.elizabetht.model;

import java.util.Date;

public class Student {
	private Long id;
		
	private String userName;

	private String firstName;

	private String lastName;
	
	private String password;
	
	private String emailAddress;
	
	private Date dateOfBirth;
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
		
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public Long getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPassword() {
		return password;
	}

	public String getUserName() {
		return userName;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}	

}
