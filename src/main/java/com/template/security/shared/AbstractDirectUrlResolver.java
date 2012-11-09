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
    protected String directUrl;

    @Override
    public abstract boolean support(HttpServletRequest request);

    @Override
    public String directUrl() {
        return this.directUrl;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public void setDirectUrl(String directUrl) {
        this.directUrl = directUrl;
    }
}
