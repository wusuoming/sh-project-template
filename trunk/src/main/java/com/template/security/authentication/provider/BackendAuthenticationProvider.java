package com.template.security.authentication.provider;

import com.template.security.authentication.token.BackendAuthenticationToken;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Created by IntelliJ IDEA.
 * User: Zhong Gang
 * Date: 12-11-4
 * Time: 下午11:16
 */
public class BackendAuthenticationProvider implements AuthenticationProvider {

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        BackendAuthenticationToken authenticationToken = (BackendAuthenticationToken) authentication;
//        String captcha = authenticationToken.getCaptcha();
//        if (captcha.startsWith("ZZ")) {
//            throw new AuthenticationServiceException("The captcha is wrong!");
//        }
        String username = (String) authenticationToken.getPrincipal();
        String password = (String) authenticationToken.getCredentials();

        if (username.equalsIgnoreCase("ZHONGGANG") && password.equalsIgnoreCase("123")) {
            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
            return authenticationToken;
        }

        throw new UsernameNotFoundException("The username or password is not correct!");
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return BackendAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
