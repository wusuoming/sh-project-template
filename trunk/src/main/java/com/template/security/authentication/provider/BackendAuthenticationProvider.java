package com.template.security.authentication.provider;

import com.template.security.authentication.token.BackendAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;

/**
 * Created by IntelliJ IDEA.
 * User: Zhong Gang
 * Date: 12-11-4
 * Time: 下午11:16
 */
public class BackendAuthenticationProvider extends DaoAuthenticationProvider {

    @Override
    public boolean supports(Class<?> authentication) {
        return BackendAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
