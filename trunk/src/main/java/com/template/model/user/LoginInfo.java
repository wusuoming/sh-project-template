package com.template.model.user;

/**
 * Created by IntelliJ IDEA.
 * User: alexzhong
 * Date: 7/6/11
 * Time: 4:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoginInfo {
    private String username;
    private String password;

    public LoginInfo() {
    }

    public LoginInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
