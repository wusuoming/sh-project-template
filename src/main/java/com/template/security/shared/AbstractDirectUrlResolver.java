package com.template.security.shared;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 * User: Zhong Gang
 * Date: 12-11-9
 * Time: 下午7:12
 */
public abstract class AbstractDirectUrlResolver implements DirectUrlResolver {
    protected String pattern;
    protected String loginUrl;

    @Override
    public abstract boolean support(HttpServletRequest request);

    @Override
    public String directUrl() {
        return this.loginUrl;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }
}
