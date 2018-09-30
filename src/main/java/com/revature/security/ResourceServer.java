package com.revature.security;

<<<<<<< HEAD
<<<<<<< HEAD
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@EnableResourceServer
@Configuration
public class ResourceServer extends ResourceServerConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
        .antMatchers("/auth/**").permitAll()
        .anyRequest().authenticated();
		
	}
	
	
=======
public class ResourceServer {
>>>>>>> de47c8913e6d20e002aa5126f5f2bb4b65144bf8
=======
public class ResourceServer {
>>>>>>> de47c8913e6d20e002aa5126f5f2bb4b65144bf8

}
