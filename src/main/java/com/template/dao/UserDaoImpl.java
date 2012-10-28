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

    public void createUser(User user) {
        getHibernateTemplate().saveOrUpdate(user);
    }

    public List<User> findUsers() {
        return getHibernateTemplate().find("from User");
    }

}
