package com.template.security.authentication.handler;

import com.template.security.shared.DirectUrlResolver;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

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
public class MultipleAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
    private List<DirectUrlResolver> resolvers = new ArrayList<DirectUrlResolver>();

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        for (DirectUrlResolver resolver : resolvers) {
            if (resolver.support(request)) {
                String directUrl = resolver.directUrl();
                setDefaultTargetUrl(directUrl);
            }
        }

        super.onAuthenticationSuccess(request, response, authentication);
    }

    public void setResolvers(List<DirectUrlResolver> resolvers) {
        this.resolvers = resolvers;
    }
}
