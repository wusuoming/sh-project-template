package com.template.security.shared;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 * User: Zhong Gang
 * Date: 12-11-9
 * Time: 下午7:13
 */
public class RequestUriDirectUrlResolver extends AbstractDirectUrlResolver {

    @Override
    public boolean support(HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        return requestURI.contains(this.pattern);
    }
}
