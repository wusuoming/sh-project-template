package com.template.security;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

/**
 * Created by IntelliJ IDEA.
 * User: Zhong Gang
 * Date: 12-11-4
 * Time: 下午11:24
 */
public class BackendAuthenticationToken extends UsernamePasswordAuthenticationToken {
    private String captcha;

    public BackendAuthenticationToken(Object principal, Object credentials, String captcha) {
        super(principal, credentials);
        this.captcha = captcha;
    }

    public String getCaptcha() {
        return captcha;
    }
}
