package com.revature.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * This class is a Java Bean for JWTs configurations.
 * 
 * @author Alex Moraga, Richard Iskra, Tosin Onilogbo
 *
 */
@Component
@ConfigurationProperties(prefix = "com.revature.security.jwt.aws")
public class JwtConfiguration {

    private static final String COGNITO_IDENTITY_POOL_URL = "https://cognito-idp.auth.us-east-1.amazonaws.com/_7bWZrc3vS";
    private static final String JSON_WEB_TOKEN_SET_URL_SUFFIX = "/.well-known/jwks.json";

    private String userPoolId;
    private String identityPoolId;

//  Cognitos credentials
//  Change is your credentials are different. 
    private String jwkUrl;
    private String region = "us-east-1";
    private String userNameField = "cognito:username";
    private String groupsField = "cognito:groups";
    private int connectionTimeout = 2000;
    private int readTimeout = 2000;
    private String httpHeader = "Authorization";

    public String getJwkUrl() {
        if (jwkUrl==null || jwkUrl.isEmpty()) {
            return String.format(COGNITO_IDENTITY_POOL_URL + JSON_WEB_TOKEN_SET_URL_SUFFIX,region,userPoolId);
        }
        return jwkUrl;
    }

//  method to return formatted strings of (COGNITO_IDENTITY_POOL_URL,region,userPoolId)
    public String getCognitoIdentityPoolUrl() {
        return String.format(COGNITO_IDENTITY_POOL_URL,region,userPoolId);
    }

    public void setJwkUrl(String jwkUrl) {
        this.jwkUrl = jwkUrl;
    }

    public String getUserPoolId() {
        return userPoolId;
    }

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    public String getIdentityPoolId() {
        return identityPoolId;
    }

    public JwtConfiguration setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    public String getHttpHeader() {
        return httpHeader;
    }

    public void setHttpHeader(String httpHeader) {
        this.httpHeader = httpHeader;
    }

    public String getUserNameField() {
        return userNameField;
    }

    public void setUserNameField(String userNameField) {
        this.userNameField = userNameField;
    }

    public String getGroupsField() {
        return groupsField;
    }

    public void setGroupsField(String groupsField) {
        this.groupsField = groupsField;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public int getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

}