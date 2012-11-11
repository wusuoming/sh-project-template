package com.template.security.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * Created by IntelliJ IDEA.
 * User: Zhong Gang
 * Date: 12-11-11
 * Time: 上午1:12
 */
public class PhoneNotFoundException extends AuthenticationException {

    public PhoneNotFoundException(String msg) {
        super(msg);
    }
}
