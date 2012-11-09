package com.template.security.filter;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Zhong Gang
 * Date: 12-11-9
 * Time: 下午10:00
 */
public class MultipleAuthenticationProcessingFilter extends AbstractAuthenticationProcessingFilter {
    private List<AuthenticationTokenResolver> tokenResolvers = new ArrayList<AuthenticationTokenResolver>();

    /**
     * @param defaultFilterProcessesUrl the default value for <tt>filterProcessesUrl</tt>.
     */
    protected MultipleAuthenticationProcessingFilter(String defaultFilterProcessesUrl) {
        super(defaultFilterProcessesUrl);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException, ServletException {
        for (AuthenticationTokenResolver tokenResolver : tokenResolvers) {
            if (tokenResolver.support(request)) {
                Authentication authentication = tokenResolver.resolve(request);
                return this.getAuthenticationManager().authenticate(authentication);
            }
        }

        throw new UnsupportedOperationException("No authentication token resolver found!");
    }

    public void setTokenResolvers(List<AuthenticationTokenResolver> tokenResolvers) {
        this.tokenResolvers = tokenResolvers;
    }
}
