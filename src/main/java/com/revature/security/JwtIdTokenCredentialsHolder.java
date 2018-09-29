package com.revature.security;

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
