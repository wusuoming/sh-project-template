package com.template.security.logout;

import com.template.security.authentication.token.BackendAuthenticationToken;
import com.template.security.authentication.token.ForendAuthenticationToken;
import org.springframework.security.core.Authentication;

/**
 * Created by IntelliJ IDEA.
 * User: Zhong Gang
 * Date: 12-11-18
 * Time: 下午9:25
 */
public class BackendLogoutSuccessUrlResolver extends AbstractLogoutSuccessUrlResolver {

    @Override
    public boolean support(Authentication authentication) {
        return BackendAuthenticationToken.class.isAssignableFrom(authentication.getClass());
    }

}
