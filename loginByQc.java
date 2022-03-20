package com.Phoenixpojo;

public class loginByQc {

	private String username;
	private String password;
	
	public loginByQc(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "loginByQc [username=" + username + ", password=" + password + ", getUsername()=" + getUsername()
				+ ", getPassword()=" + getPassword() + "]";
	}
	
	
	
	
}
