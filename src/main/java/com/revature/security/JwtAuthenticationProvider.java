package com.revature.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public class JwtAuthenticationProvider implements AuthenticationProvider {

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		return authentication;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return true;
	}
<<<<<<< HEAD
	
	
	

=======
>>>>>>> de47c8913e6d20e002aa5126f5f2bb4b65144bf8
}
