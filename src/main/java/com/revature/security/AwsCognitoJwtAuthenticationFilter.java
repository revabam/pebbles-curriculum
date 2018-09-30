package com.revature.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
<<<<<<< HEAD
=======
import javax.servlet.http.HttpServletResponse;
>>>>>>> de47c8913e6d20e002aa5126f5f2bb4b65144bf8

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

/**
 * 
 * The purpose of this class is too distinguish non-authentic tokens from authentic tokens and take accorded action.
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
<<<<<<< HEAD

=======
>>>>>>> de47c8913e6d20e002aa5126f5f2bb4b65144bf8
        Authentication authentication = null;
        try {
            authentication = awsCognitoIdTokenProcessor.getAuthentication((HttpServletRequest)request);

            if (authentication!=null) {
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
            
            else if(authentication==null) {
            	 throw new ServletException("Access Denied");
<<<<<<< HEAD
=======
            	 
>>>>>>> de47c8913e6d20e002aa5126f5f2bb4b65144bf8
            	
            }

        } catch (Exception e) {
            logger.error("Access Denied",e);
            SecurityContextHolder.clearContext();
        }
<<<<<<< HEAD

        //Calling the doFilter method from the filter chain class
        filterChain.doFilter(request,response);

    }
}
=======
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        System.out.println(httpServletResponse.getStatus());
        httpServletResponse.setStatus(401);
        System.out.println(httpServletResponse.getStatus());
        //Calling the doFilter method from the filter chain class
        filterChain.doFilter(request,httpServletResponse);
    }
}
>>>>>>> de47c8913e6d20e002aa5126f5f2bb4b65144bf8
