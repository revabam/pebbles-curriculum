package com.revature.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
import org.springframework.security.oauth2.core.oidc.IdTokenClaimNames;

@Configuration
public class OAuth2LoginConfig {

	@EnableWebSecurity
	public static class OAuth2LoginSecurityConfig extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			 http
	            .authorizeRequests()
	            .antMatchers("/auth/**").permitAll()
	            .anyRequest().authenticated()
	            .and()
	            .addFilter(AwsCognitoJwtAuthenticationFilter(awsCognitoIdTokenProcessor, authenticationManager()))
	            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	    }
	}

	@Bean
	public ClientRegistrationRepository clientRegistrationRepository() {
		return new InMemoryClientRegistrationRepository(this.cognitoClientRegistration());
	}

	private ClientRegistration cognitoClientRegistration() {
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
	}
}