package com.cn.zwz.model;

public class User {
	private String username;
	private String nickname;
	private String password;
	private String email;

	/* ==四个属性的getter()、setter()略== */
	public User() {
	}

	public User(String username, String nickname, String password, String email) {
		this.username = username;
		this.nickname = nickname;
		this.password = password;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
