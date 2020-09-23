package com.qfedu.service.impl;

import com.qfedu.dao.UserDao;
import com.qfedu.entity.User;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * projectName: car
 *
 * @author: xr
 * time: 2020/9/17 15:42
 * description:
 */


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User login(String tel, String password) {
        User user = userDao.findByTel(tel);
        if(user == null){
            throw new RuntimeException("账号不能为空");
        }else if(!user.getPassword ().equals (password)){
            throw new RuntimeException("账号或者密码错误");

        }
        return user;
    }

    @Override
    public void register(String tel, String password, String invitation, String email) {
        User user = new User ();
        user.setEmail (email);
        user.setPassword (password);
        user.setInvitation (invitation);
        user.setTel (tel);
        userDao.register (user);
    }


}
