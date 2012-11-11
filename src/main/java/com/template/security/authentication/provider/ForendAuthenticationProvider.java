package com.template.security.authentication.provider;

import com.template.security.authentication.token.ForendAuthenticationToken;
import com.template.security.exception.EmailNotFoundException;
import com.template.security.exception.PhoneNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by IntelliJ IDEA.
 * User: Zhong Gang
 * Date: 12-11-4
 * Time: 下午11:16
 */
public class ForendAuthenticationProvider implements AuthenticationProvider {

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        ForendAuthenticationToken authenticationToken = (ForendAuthenticationToken) authentication;
        String email = authenticationToken.getEmail();
        String phone = authenticationToken.getPhone();

        if (!email.endsWith("@qq.com")) {
            throw new EmailNotFoundException("Email not found!");
        }

        if (!phone.startsWith("139")) {
            throw new PhoneNotFoundException("Phone not found");
        }


        if (email.endsWith("@qq.com") && phone.startsWith("139")) {
            authenticationToken.setAuthenticated(true);
            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
            return authenticationToken;
        }

        throw new AuthenticationServiceException("The email or phone is not correct!");
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return ForendAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
