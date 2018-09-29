package com.revature.security;

public class JwtIdTokenCredentialsHolder {
	
	private String idToken;
	
	 public String getIdToken() {
		 System.out.println("9");
	        return idToken;
	    }

	    public JwtIdTokenCredentialsHolder setIdToken(String idToken) {
	    	System.out.println("3");
	        this.idToken = idToken;
	        return this;
	    }

}
