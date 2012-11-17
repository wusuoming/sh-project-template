package com.template.dao;

import com.template.dao.standard.UserDao;
import com.template.model.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: alexzhong
 * Date: 7/6/11
 * Time: 3:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Override
    public User findUserByGuid(String userGuid) {
        return (User) getHibernateTemplate().find("from User u where u.guid=?", userGuid);
    }

    @Override
    public void saveOrUpdateUser(User user) {
        getHibernateTemplate().saveOrUpdate(user);
    }

    @Override
    public void createUser(User user) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<User> findUsers() {
        return getHibernateTemplate().find("from User");
    }

    @Override
    public List<User> findUsersByUsername(String username) {
        return getHibernateTemplate().find("from User u where u.username=?", username);
    }

}
