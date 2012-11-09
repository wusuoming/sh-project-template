package com.template.security.authentication.handler;

import com.template.security.shared.DirectUrlResolver;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

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
 * Time: 下午11:20
 */
public class MultipleAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {
    private List<DirectUrlResolver> resolvers = new ArrayList<DirectUrlResolver>();

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        for (DirectUrlResolver resolver : resolvers) {
            if (resolver.support(request)) {
                String directUrl = resolver.directUrl();
                setDefaultFailureUrl(directUrl);
            }
        }

        super.onAuthenticationFailure(request, response, exception);
    }

    public void setResolvers(List<DirectUrlResolver> resolvers) {
        this.resolvers = resolvers;
    }
}
