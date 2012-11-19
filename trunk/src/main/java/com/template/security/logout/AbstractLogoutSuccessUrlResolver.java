package com.template.security.logout;

import org.springframework.security.core.Authentication;

/**
 * Created by IntelliJ IDEA.
 * User: Zhong Gang
 * Date: 12-11-18
 * Time: 下午9:26
 */
public abstract class AbstractLogoutSuccessUrlResolver implements LogoutSuccessUrlResolver {
    private String url;

    public abstract boolean support(Authentication authentication);

    @Override
    public String resolve() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
