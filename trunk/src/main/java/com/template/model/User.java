package com.template.model;

import com.template.model.BasicObject;

/**
 * User: Zhong Gang
 */
public class User extends BasicObject {
    private String username;
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String username() {
        return username;
    }

    public String password() {
        return password;
    }
}
