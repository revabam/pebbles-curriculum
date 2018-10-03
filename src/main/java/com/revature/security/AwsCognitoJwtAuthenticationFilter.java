package com.revature.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

/**
 * The purpose of this class is too distinguish non-authentic tokens from authentic tokens 
 * and take accorded action.
 * 
 * @author Tosin Onilogbo, Alex Moraga | Spark1806-USF-Java | Steven Kelsey
 */

public class AwsCognitoJwtAuthenticationFilter extends GenericFilterBean {

//	Variable "logger" using the ".getLogger" method to return a named logger, without the application having to care about factories.
    private static final Logger logger = LoggerFactory.getLogger(AwsCognitoJwtAuthenticationFilter.class);

//  Setting from AwsCognitoIdTokenProcessor
    private AwsCognitoIdTokenProcessor awsCognitoIdTokenProcessor;

//  To filter AwsCognitoIdTokenProcessor
    public AwsCognitoJwtAuthenticationFilter(AwsCognitoIdTokenProcessor awsCognitoIdTokenProcessor) {
        this.awsCognitoIdTokenProcessor = awsCognitoIdTokenProcessor;
    }

    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        Authentication authentication = null;
        try {
        	
//        	Retrieving a return value from awsCognitoIdTokenProcessor from the incoming HTTP request.
            authentication = awsCognitoIdTokenProcessor.getAuthentication((HttpServletRequest)request);

//          if the authentication != null, then set the authentication to change 
//          the currently authenticated prinicple or removes authentication information.
            if (authentication!=null) {
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
            
//          If not, it will throw a message w/"Access Denied".
            else if(authentication==null) {
            	 throw new ServletException("Access Denied");
            	 
            	
            }

        } catch (Exception e) {
        	
//        	Catch the exception and explicitly clears the context value from the current thread
            logger.error("Access Denied",e);
            SecurityContextHolder.clearContext();
        }
        
        
//      Calling the doFilter method from the filter chain class
        filterChain.doFilter(request,response);
    }
}