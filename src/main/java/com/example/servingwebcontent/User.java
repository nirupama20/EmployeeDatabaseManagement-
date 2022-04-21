package com.example.servingwebcontent;

import java.io.Serializable;

public class User implements Serializable{
	private String email;
	
	private String password;
	
	User(String userEmail, String userPassword) {
		this.email = userEmail;
		this.password = userPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
