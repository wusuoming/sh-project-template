package com.template.security.login;

import com.template.security.shared.DirectUrlResolver;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

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
 * Time: 下午7:40
 */
public class MultipleAuthenticationLoginEntry implements AuthenticationEntryPoint {
    private String defaultLoginUrl;
    private List<DirectUrlResolver> directUrlResolvers = new ArrayList<DirectUrlResolver>();


    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        for (DirectUrlResolver directUrlResolver : directUrlResolvers) {
            if (directUrlResolver.support(request)) {
                String loginUrl = directUrlResolver.directUrl();
                response.sendRedirect(loginUrl);
                return;
            }
        }

        response.sendRedirect(defaultLoginUrl);
    }

    public void setDefaultLoginUrl(String defaultLoginUrl) {
        this.defaultLoginUrl = defaultLoginUrl;
    }

    public void setDirectUrlResolvers(List<DirectUrlResolver> directUrlResolvers) {
        this.directUrlResolvers = directUrlResolvers;
    }
}
