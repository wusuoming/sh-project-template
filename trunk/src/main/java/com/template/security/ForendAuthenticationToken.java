package com.template.security;

import org.springframework.security.authentication.AbstractAuthenticationToken;

/**
 * Created by IntelliJ IDEA.
 * User: Zhong Gang
 * Date: 12-11-4
 * Time: 下午11:23
 */
public class ForendAuthenticationToken extends AbstractAuthenticationToken {
    private String email;
    private String phone;

    public ForendAuthenticationToken(String email, String phone) {
        super(null);
        this.email = email;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }
}
