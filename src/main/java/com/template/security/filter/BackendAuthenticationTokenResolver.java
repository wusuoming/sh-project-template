package com.template.security.filter;

import com.template.security.authentication.token.BackendAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Zhong Gang
 * Date: 12-11-9
 * Time: 下午10:29
 */
public class BackendAuthenticationTokenResolver extends AbstractAuthenticationTokenResolver {

    protected BackendAuthenticationTokenResolver() {
        super();
    }

    @Override
    public Authentication resolve(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String captcha = request.getParameter("captcha");
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        return new BackendAuthenticationToken(username, password, authorities, captcha);
    }
}
