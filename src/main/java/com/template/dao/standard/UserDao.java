package com.template.dao.standard;

import com.template.model.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Lenovo
 * Date: 12-10-28
 * Time: 下午1:18
 */
public interface UserDao {

    User findUserByGuid(String userGuid);

    void saveOrUpdateUser(User user);

    void createUser(User user);

    List<User> findUsers();
}
