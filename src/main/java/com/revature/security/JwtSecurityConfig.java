package com.revature.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * Class for Jwt Security Configuration
 * 
 * @author Tosin Onilogbo, Alex Moraga | Spark1806-USF-Java | Steven Kelsey
 */

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
@Configuration
public class JwtSecurityConfig extends WebSecurityConfigurerAdapter implements Ordered {

//	Setting this class priority to 4.
	private int order = 4;

//	Autowiring AwsCognitoJwtAuthenticationFilter
	@Autowired
	private AwsCognitoJwtAuthenticationFilter awsCognitoJwtAuthenticationFilter;

//	Coming from the Ordered interface
	@Override
	public int getOrder() {
		return order;
	}

//	Setting the order from the order instance. 
	public void setOrder(int order) {
		this.order = order;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.headers().cacheControl();
		http
		.csrf().disable()
		.authorizeRequests()
		.antMatchers("/curriculums/**").authenticated()
		
		// needs to be the last matcher, otherwise all matchers following it would never be reached
		.antMatchers("/**").permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.addFilterBefore(awsCognitoJwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}
}