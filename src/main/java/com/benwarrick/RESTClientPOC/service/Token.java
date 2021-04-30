package com.benwarrick.RESTClientPOC.service;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Token {
	@JsonProperty("userId")
	private String userId;
	@JsonProperty("token")
	private String token;
	public Token() {
		super(); 
	}
	public Token(String userId, String token) {
		this.userId = userId;
		this.token = token;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

}
