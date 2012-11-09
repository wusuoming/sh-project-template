package com.template.security.filter;

import com.template.utils.StringUtils;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 * User: Zhong Gang
 * Date: 12-11-9
 * Time: 下午10:27
 */
public abstract class AbstractAuthenticationTokenResolver implements AuthenticationTokenResolver {
    protected String parameterName;
    protected String parameterValue;

    protected AbstractAuthenticationTokenResolver() {
    }

    protected AbstractAuthenticationTokenResolver(String parameterName) {
        this.parameterName = parameterName;
    }

    @Override
    public boolean support(HttpServletRequest request) {
        String parameterValue = request.getParameter(parameterName);
        if (StringUtils.isEmpty(parameterValue)) {
            return false;
        }
        return parameterValue.equals(this.parameterValue);
    }

    @Override
    public abstract Authentication resolve(HttpServletRequest request);

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }
}
