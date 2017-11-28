package com.packtpub.model;

import java.io.Serializable;

//import com.fasterxml.jackson.annotation.JsonProperty;


public class User implements Serializable {	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public User(){		
	}

	private Integer userid;
	
	private String username;	
	
	//public User(@JsonProperty("userid") Integer userid, @JsonProperty("username") String username){
	public User(Integer userid, String username){
		this.userid = userid;
		this.username = username;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + "]";
	}
}
