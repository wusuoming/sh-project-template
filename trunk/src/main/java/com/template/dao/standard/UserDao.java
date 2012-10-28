package com.template.dao.standard;

import com.template.model.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: alexzhong
 * Date: 7/6/11
 * Time: 3:04 PM
 * To change this template use File | Settings | File Templates.
 */
public interface UserDao {

    void createUser(User user);

    List findUsers();
}
