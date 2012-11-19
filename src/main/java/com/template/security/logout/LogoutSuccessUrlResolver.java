package com.template.security.logout;

import org.springframework.security.core.Authentication;

/**
 * Created by IntelliJ IDEA.
 * User: Zhong Gang
 * Date: 12-11-18
 * Time: 下午9:24
 */
public interface LogoutSuccessUrlResolver {

    boolean support(Authentication authentication);

    String resolve();
}
