package com.revature.security;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.proc.ConfigurableJWTProcessor;

/**
 * This class is meant authenticate a token by extracting the actual token. 
 * 
 * This class is also responsible to for denying requests that do not contain a token
 * 
 * @author Tosin Onilogbo, Alex Moraga | Spark1806-USF-Java | Steven Kelsey
 */

public class AwsCognitoIdTokenProcessor {

//	Variable "logger" using the ".getLog" method to return a named logger, without the application having to care about factories.
    private static final Log logger = LogFactory.getLog(AwsCognitoIdTokenProcessor.class);

    private static final String ROLE_PREFIX = "ROLE_";
    private static final String EMPTY_PWD = "";
    private static final String BEARER_PREFIX = "Bearer ";

//  Autowire to JwtConfiguration class
    @Autowired
    private JwtConfiguration jwtConfiguration;

//	Autowire to the ConfigurableJwtProcessor class, extending interfaces for methods to
//    	- Parse and processing JSON web tokens (JWTs)
//    	- To verify JWTs based with key selectors on JWS header and application-specitic context information
//    	- To decrypt encrypted JWTs using key selectors
    @Autowired
    private ConfigurableJWTProcessor configurableJWTProcessor;

//   Autowire to the JwtIdTokenCredentialsHolder
    @Autowired
    private JwtIdTokenCredentialsHolder jwtIdTokenCredentialsHolder;

    public Authentication getAuthentication(HttpServletRequest request) throws Exception {

//    	Returns a value of the specified request header as a String. 
//    	If the request does not include a header of the specified name, this method will return null.
        String idToken = request.getHeader(jwtConfiguration.getHttpHeader());
        if (idToken != null) {

            JWTClaimsSet claimsSet = null;

//          Striping down the request header, returning just the string of the idToken
            claimsSet = configurableJWTProcessor.process(stripBearerToken(idToken), null);

//          if the claimSet does not equal from the CognitoIdentityPoolUrl, throw the exception that
//          returns a string format, an Issuer through a specified claim, and 
//          the string format from getCognitoIdentityPoolUrl() in JwtConfiguration class
            if (!isIssuedCorrectly(claimsSet)) {
                throw new Exception(String.format("Issuer %s in JWT token doesn't match cognito idp %s", claimsSet.getIssuer(), jwtConfiguration.getCognitoIdentityPoolUrl()));
            }

//          if the claimSet does not equal the id, throw an exception that
//          says "JWT Token doesn't seem to be an ID Token"
            if (!isIdToken(claimsSet)) {
                throw new Exception("JWT Token doesn't seem to be an ID Token");
            }

//          username from cognitos
            String username = claimsSet.getClaims().get(jwtConfiguration.getUserNameField()).toString();

            if (username != null) {

//            	Setting a List called "groups" with the claims of cognitos groups
                List<String> groups = (List<String>) claimsSet.getClaims().get(jwtConfiguration.getGroupsField());
                
//              Setting a List called "grantedAuthorities" with UPPERCASED Strings of who has granted authority
                List<GrantedAuthority> grantedAuthorities = convertList(groups, group -> new SimpleGrantedAuthority(ROLE_PREFIX + group.toUpperCase()));
              
//              Setting a User allowing usernames, passwords, and if they have granted authority or not
                User user = new User(username, EMPTY_PWD, grantedAuthorities);

//              Setting a token inside idToken
                jwtIdTokenCredentialsHolder.setIdToken(stripBearerToken(idToken));
                
//              Return a new JwtAuthentication with the user
                return new JwtAuthentication(user, claimsSet, grantedAuthorities);
            }

        }

//      Log a message with trace log level.
        logger.trace("No idToken found in HTTP Header");
        return null;
    }

//  Returns the string that the token is identified with the BEARER_PREFIX
    private String stripBearerToken(String token) {
        return token.startsWith(BEARER_PREFIX) ? token.substring(BEARER_PREFIX.length()) : token;
    }

    
//  Logic to see if the claimSet equals Cognito's Identity Pool 
    private boolean isIssuedCorrectly(JWTClaimsSet claimsSet) {
        return claimsSet.getIssuer().equals(jwtConfiguration.getCognitoIdentityPoolUrl());
    }

//  Logic to see if the claim equals the id 
    private boolean isIdToken(JWTClaimsSet claimsSet) {
        return claimsSet.getClaim("token_use").equals("id");
    }

//  Method that takes in a functional argument and returns a function result.
//  Returning a stream of collectors, but do not know if we really need this method.
//  TO-DO: See if there is a need for this method
    private static <T, U> List<U> convertList(List<T> from, Function<T, U> func) {
        return from.stream().map(func).collect(Collectors.toList());
    }
}

