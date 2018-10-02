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
 * @author Alex Moraga, Richard Iskra, Tosin Onilogbo
 *
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
		http.csrf().disable()
				.authorizeRequests()
				.antMatchers("/curriculums/**").authenticated()
				
				// needs to be the last matcher, otherwise all matchers following it would never be reached
				.antMatchers("/**").permitAll() 
				.anyRequest().authenticated()
				.and()
				.addFilterBefore(awsCognitoJwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
		 		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    
	}
	
	/*@Bean
	public ClientRegistrationRepository clientRegistrationRepository() {
		System.out.println("10");
		return new InMemoryClientRegistrationRepository(this.cognitoClientRegistration());
	}

	private ClientRegistration cognitoClientRegistration() {
		System.out.println("11");
		return ClientRegistration.withRegistrationId("cognito")
			.clientId("6mrdhjt4gch9lvrd5vpeh4n748")
			.clientSecret("viut9iprfln5jbf7c0legkvj6kgpergt32kk9d25s8mjgkb54l9")
			.clientAuthenticationMethod(ClientAuthenticationMethod.BASIC)
			.authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
			.redirectUriTemplate("https://d2iny48xdni2vj.cloudfront.net/dashboard")
			.scope("openid", "profile", "email", "aws.cognito.signin.user.admin", "phone")
			.authorizationUri("https://bambam-client.auth.us-east-1.amazoncognito.com/oauth2/authorize")
			.tokenUri("https://bambam-client.auth.us-east-1.amazoncognito.com/oauth2/token")
			.userInfoUri("https://bambam-client.auth.us-east-1.amazoncognito.com/oauth2/userInfo")
			.userNameAttributeName(IdTokenClaimNames.SUB)
			.jwkSetUri("https://cognito-idp.auth.us-east-1.amazonaws.com/_7bWZrc3vS/.well-known/jwks.json")
			.clientName("Cognito")
			.build();
	}*/
	
}