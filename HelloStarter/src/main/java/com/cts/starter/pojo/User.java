package com.cts.starter.pojo;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity

@Table(name="user")

public class User {

 



 @Id
private String username;



private String password;

  private String usertype;

  private String email;

  private String mobile;

  private String confirmed;
  
  
  @Override
  public String toString() {
  	return "User [username=" + username + ", password=" + password + ", usertype=" + usertype + ", email=" + email
  			+ ", mobile=" + mobile + ", confirmed=" + confirmed + "]";
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

public String getUsertype() {
	return usertype;
}

public void setUsertype(String usertype) {
	this.usertype = usertype;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}

public String getConfirmed() {
	return confirmed;
}

public void setConfirmed(String confirmed) {
	this.confirmed = confirmed;
}







}