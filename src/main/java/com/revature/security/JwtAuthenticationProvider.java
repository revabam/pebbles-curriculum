package com.revature.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

/**
 * Class for authentication using AuthenticationProvider for filter chaining
 * 
 * @author Alex Moraga, Richard Iskra, Tosin Onilogbo
 *
 */

public class JwtAuthenticationProvider implements AuthenticationProvider {

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		return authentication;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return true;
	}
}
