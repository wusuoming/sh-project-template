package com.template.security.authentication.token;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: Zhong Gang
 * Date: 12-11-4
 * Time: 下午11:24
 */
public class BackendAuthenticationToken extends UsernamePasswordAuthenticationToken {
    private String captcha;

    public BackendAuthenticationToken(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities, String captcha) {
        super(principal, credentials, authorities);
        this.captcha = captcha;
    }

    public String getCaptcha() {
        return captcha;
    }
}
