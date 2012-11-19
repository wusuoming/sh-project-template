package com.template.security.logout;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Zhong Gang
 * Date: 12-11-18
 * Time: 下午8:48
 */
public class MultipleLogoutSuccessHandler implements LogoutSuccessHandler {
    private List<LogoutSuccessUrlResolver> resolvers = new ArrayList<LogoutSuccessUrlResolver>();

    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        for (LogoutSuccessUrlResolver resolver : resolvers) {
            if (resolver.support(authentication)) {
                String url = resolver.resolve();
                response.sendRedirect(url);
                return;
            }
        }
        throw new UnsupportedOperationException("No login success url resolver found!");
    }

    public void setResolvers(List<LogoutSuccessUrlResolver> resolvers) {
        this.resolvers = resolvers;
    }
}
