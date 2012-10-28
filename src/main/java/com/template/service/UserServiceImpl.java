package com.template.service;

import com.template.dao.standard.UserDao;
import com.template.dto.UserDTO;
import com.template.model.User;
import com.template.service.standard.UserService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Zhong Gang
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;


    public void addUser(User user) {
        userDao.createUser(user);
    }

    public List<User> loadUsers() {
        return userDao.findUsers();
    }

    @Override
    public User loadUserByGuid(String userGuid) {
        return userDao.findUserByGuid(userGuid);
    }

    @Override
    public void saveOrUpdateUserDTO(UserDTO userDTO) {
        User user = userDTO.toUser();
        userDao.saveOrUpdateUser(user);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}
