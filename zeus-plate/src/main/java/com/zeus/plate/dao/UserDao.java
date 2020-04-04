package com.zeus.plate.dao;

import com.zeus.plate.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author smile
 * @date 2020/4/4 0004 下午 1:47
 */
public interface UserDao extends JpaRepository<User, Integer> {

    User findByUsername(String username);

    User getByUsernameAndPassword(String username, String password);


}
