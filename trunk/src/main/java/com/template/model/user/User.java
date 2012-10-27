package com.template.model.user;

import com.template.model.BasicObject;

/**
 * Created by IntelliJ IDEA.
 * User: alexzhong
 * Date: 7/6/11
 * Time: 2:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class User extends BasicObject{
    private LoginInfo loginInfo;
    private Name name;

    public User() {
    }

    public User(String username, String password) {
        this.loginInfo = new LoginInfo(username, password);
        this.name = new Name("Zhong", "", "Gang", "Alex");
    }

    public LoginInfo getLoginInfo() {
        return loginInfo;
    }

    public Name getName() {
        return name;
    }
}
