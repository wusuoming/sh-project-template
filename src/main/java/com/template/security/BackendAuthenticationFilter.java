package com.template.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.web.bind.ServletRequestUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: Zhong Gang
 * Date: 12-11-5
 * Time: 下午9:51
 */
public class BackendAuthenticationFilter extends AbstractAuthenticationProcessingFilter {


    /**
     * @param defaultFilterProcessesUrl the default value for <tt>filterProcessesUrl</tt>.
     */
    protected BackendAuthenticationFilter(String defaultFilterProcessesUrl) {
        super(defaultFilterProcessesUrl);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException, ServletException {
        String username = ServletRequestUtils.getRequiredStringParameter(request, "username");
        String password = ServletRequestUtils.getRequiredStringParameter(request, "password");
        String captcha = ServletRequestUtils.getRequiredStringParameter(request, "captcha");
        BackendAuthenticationToken authenticationToken = new BackendAuthenticationToken(username, password, captcha);
        return this.getAuthenticationManager().authenticate(authenticationToken);
    }
}
