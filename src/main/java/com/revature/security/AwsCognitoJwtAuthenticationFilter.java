package com.revature.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

/**
 * 
 * The purpose of this class is too distinguish between non-authentic tokens from authentic tokens
 * @author Tosin Onilogbo
 *
 */
public class AwsCognitoJwtAuthenticationFilter extends GenericFilterBean {

    private static final Logger logger = LoggerFactory.getLogger(AwsCognitoJwtAuthenticationFilter.class);

    private AwsCognitoIdTokenProcessor awsCognitoIdTokenProcessor;

    public AwsCognitoJwtAuthenticationFilter(AwsCognitoIdTokenProcessor awsCognitoIdTokenProcessor) {
        this.awsCognitoIdTokenProcessor = awsCognitoIdTokenProcessor;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {

        Authentication authentication = null;
        try {
            authentication = awsCognitoIdTokenProcessor.getAuthentication((HttpServletRequest)request);

            if (authentication!=null) {
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
            
            else if(authentication==null) {
            	 throw new ServletException("Access Denied");
            	
            }

        } catch (Exception e) {
            logger.error("Access Denied",e);
            SecurityContextHolder.clearContext();
        }

        //Calling the doFilter method from the filter chain class
        filterChain.doFilter(request,response);

    }
}
