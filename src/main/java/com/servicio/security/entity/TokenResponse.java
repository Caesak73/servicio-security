package com.servicio.security.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class TokenResponse {
	
	private String authToken;
	
	@DateTimeFormat(pattern = "MMMM dd, yyyy")
	private LocalDate date;

	public TokenResponse(String authToken, LocalDate date) {
		this.authToken = authToken;
		this.date = date;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}