package com.template.service;

import com.template.dao.standard.UserDao;
import com.template.model.user.User;
import com.template.service.standard.UserService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: alexzhong
 * Date: 7/6/11
 * Time: 3:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;


    public void addUser(User user) {
        userDao.createUser(user);
    }

    public List<User> loadUsers() {
        return userDao.findUsers();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}
