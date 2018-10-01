package com.revature.security;

/**
 * This class is a POJO (Plain Old Java Object) to allow a methods 
 * - to set an id Token 
 * - get an id Token
 * 
 * @author Alex Moraga, Richard Iskra, Tosin Onilogbo
 *
 */
public class JwtIdTokenCredentialsHolder {

	public String getIdToken() {
		return idToken;
	}

	public JwtIdTokenCredentialsHolder setIdToken(String idToken) {
		this.idToken = idToken;
		return this;
	}

	private String idToken;

}
