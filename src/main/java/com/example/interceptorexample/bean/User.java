package com.example.interceptorexample.bean;

public class User {

	private Long userid;
	private String userName;
	
	
	
	public User() {
	}
	public User(Long userid, String userName) {
		super();
		this.userid = userid;
		this.userName = userName;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}
