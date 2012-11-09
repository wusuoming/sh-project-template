package com.template.security.filter;

import com.template.security.authentication.token.ForendAuthenticationToken;
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
public class ForendAuthenticationTokenResolver extends AbstractAuthenticationTokenResolver {

    protected ForendAuthenticationTokenResolver() {
        super();
    }

    @Override
    public Authentication resolve(HttpServletRequest request) {
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        return new ForendAuthenticationToken(email, phone, authorities);
    }

}
