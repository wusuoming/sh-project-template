package com.template.service;

import com.template.dao.standard.UserDao;
import com.template.dto.UserDTO;
import com.template.model.User;
import com.template.service.standard.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
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

    @Override
    public List<UserDTO> loadUserDTOs() {
        List<User> users = userDao.findUsers();
        List<UserDTO> userDTOs = new ArrayList<UserDTO>();
        for (User user : users) {
            UserDTO userDTO = new UserDTO(user);
            userDTOs.add(userDTO);
        }
        return userDTOs;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<User> users = this.userDao.findUsersByUsername(username);
        if (users.isEmpty()) {
            return null;
        }
        return users.get(0);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
