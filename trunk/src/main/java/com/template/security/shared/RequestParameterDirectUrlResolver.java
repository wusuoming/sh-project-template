package com.template.security.shared;

import com.template.utils.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 * User: Zhong Gang
 * Date: 12-11-9
 * Time: 下午7:13
 */
public class RequestParameterDirectUrlResolver extends AbstractDirectUrlResolver {
    private String parameterName;

    @Override
    public boolean support(HttpServletRequest request) {
        String parameterValue = request.getParameter(parameterName);
        if (StringUtils.isEmpty(parameterValue)) {
            return false;
        }
        return parameterValue.equals(this.pattern);
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }
}
