package com.qfedu.dao;

import com.qfedu.entity.User;

/**
 * projectName: car
 *
 * @author: xr
 * time: 2020/9/17 15:38
 * description:
 */

public interface UserDao {
    public User findByTel(String tel);
    public void register(User user);


}
