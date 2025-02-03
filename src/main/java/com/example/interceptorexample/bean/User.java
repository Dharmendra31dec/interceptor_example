package com.example.interceptorexample.bean;

public class User {

	private Long userid;
	private String username;
	private Double salary;

	public Double getSalary(){
		return salary;
	}
	public void setSalary(Double salary){
		this.salary = salary;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
