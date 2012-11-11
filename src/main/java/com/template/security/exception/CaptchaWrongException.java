package com.template.security.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * Created by IntelliJ IDEA.
 * User: Zhong Gang
 * Date: 12-11-11
 * Time: 上午1:12
 */
public class CaptchaWrongException extends AuthenticationException {

    public CaptchaWrongException(String msg) {
        super(msg);
    }
}
