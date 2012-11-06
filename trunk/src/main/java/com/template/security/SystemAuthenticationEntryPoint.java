package com.template.security;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: Zhong Gang
 * Date: 12-11-5
 * Time: 下午11:58
 */
public class SystemAuthenticationEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        StringBuffer requestURL = request.getRequestURL();
        if (requestURL.toString().contains("backend")) {
            response.sendRedirect("/backend/login.do");
        }
        if (requestURL.toString().contains("forend")) {
            response.sendRedirect("/forend/login.do");
        }
    }
}
