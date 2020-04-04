package com.zeus.plate.service;

import com.zeus.plate.dao.UserDao;
import com.zeus.plate.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author smile
 * @date 2020/4/4 0004 下午 1:51
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public boolean isExist(String username) {
        User user = getByName(username);
        return null != user;
    }

    public User getByName(String username) {
        return userDao.findByUsername(username);
    }

    public User get(String username, String password) {
        return userDao.getByUsernameAndPassword(username, password);
    }

    public void add(User user) {
        userDao.save(user);
    }
}
