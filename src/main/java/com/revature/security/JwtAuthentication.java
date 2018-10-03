package com.revature.security;

import java.util.Collection;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import com.nimbusds.jwt.JWTClaimsSet;

/**
 * Class for JwtAuthentication
 * 
 * @author Tosin Onilogbo, Alex Moraga | Spark1806-USF-Java | Steven Kelsey
 */

public class JwtAuthentication extends AbstractAuthenticationToken {

	private final Object principal;
	private JWTClaimsSet jwtClaimsSet;

//  Constructor for an object, claimsSet, and a collection storing Strings of granted authorities (from the interface)
	public JwtAuthentication(Object principal, JWTClaimsSet jwtClaimsSet,
			Collection<? extends GrantedAuthority> authorities) {
		super(authorities);
		this.principal = principal;
		this.jwtClaimsSet = jwtClaimsSet;
		super.setAuthenticated(true);
	}

	@Override
	public Object getCredentials() {
		return null;
	}

	@Override
	public Object getPrincipal() {
		return principal;
	}

	public JWTClaimsSet getJwtClaimsSet() {
		return jwtClaimsSet;
	}
}