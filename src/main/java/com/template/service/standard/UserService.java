package com.template.service.standard;

import com.template.model.user.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: alexzhong
 * Date: 7/6/11
 * Time: 3:24 PM
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {

    void addUser(User user);

    List<User> loadUsers();
}
