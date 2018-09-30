package com.revature.security;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.jwk.source.RemoteJWKSet;
import com.nimbusds.jose.proc.JWSKeySelector;
import com.nimbusds.jose.proc.JWSVerificationKeySelector;
import com.nimbusds.jose.util.DefaultResourceRetriever;
import com.nimbusds.jose.util.ResourceRetriever;
import com.nimbusds.jwt.proc.ConfigurableJWTProcessor;
import com.nimbusds.jwt.proc.DefaultJWTProcessor;

/**
 * The purpose of this class is too provide the algorithm necessary for processing the JWT and extracting its authentication details. 
 * The JWT contains a set of claims about the user and are structured with a header, payload, and signature. 
 * The header contains information of what type of token it is as well as the hashing algorithm being used in this case being RSA.
 * The JWS algorithm used is RS256 for RSA PKCS #1 signature with SHA-256 so when a token with an unexpected algorithm is received 
 * it'll be rejected in the authenticationFilter class.
 * 
 * @author Tosin Onilogbo
 *
 */

@Configuration
@ConditionalOnClass({AwsCognitoJwtAuthenticationFilter.class, AwsCognitoIdTokenProcessor.class})
@EnableConfigurationProperties({JwtConfiguration.class})
public class JwtAutoConfiguration {

   @Bean
<<<<<<< HEAD
   //Each Http Request will have its own instance of a bean
=======
>>>>>>> de47c8913e6d20e002aa5126f5f2bb4b65144bf8
   @Scope(value="request", proxyMode= ScopedProxyMode.TARGET_CLASS)
   public JwtIdTokenCredentialsHolder awsCognitoCredentialsHolder() {
       return new JwtIdTokenCredentialsHolder();
   }

   @Bean
   public AwsCognitoIdTokenProcessor awsCognitoIdTokenProcessor() { return new AwsCognitoIdTokenProcessor(); }

   @Bean
   public JwtAuthenticationProvider jwtAuthenticationProvider() { return new JwtAuthenticationProvider(); }


   @Bean
   public AwsCognitoJwtAuthenticationFilter awsCognitoJwtAuthenticationFilter() {
       return new AwsCognitoJwtAuthenticationFilter(awsCognitoIdTokenProcessor());
   }

   @Autowired
   private JwtConfiguration jwtConfiguration;

   @Bean
   public ConfigurableJWTProcessor configurableJWTProcessor() throws MalformedURLException {
       ResourceRetriever resourceRetriever = new DefaultResourceRetriever(jwtConfiguration.getConnectionTimeout(), jwtConfiguration.getReadTimeout());
       URL jwkSetURL = new URL(jwtConfiguration.getJwkUrl());
       JWKSource keySource = new RemoteJWKSet(jwkSetURL, resourceRetriever);
       ConfigurableJWTProcessor jwtProcessor = new DefaultJWTProcessor();
       JWSAlgorithm expectedJWSAlg = JWSAlgorithm.RS256;
       JWSKeySelector keySelector = new JWSVerificationKeySelector(expectedJWSAlg, keySource);
       jwtProcessor.setJWSKeySelector(keySelector);
       return jwtProcessor;
   }
<<<<<<< HEAD

=======
>>>>>>> de47c8913e6d20e002aa5126f5f2bb4b65144bf8
}
