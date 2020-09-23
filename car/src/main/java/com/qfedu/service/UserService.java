package com.qfedu.service;

import com.qfedu.entity.User;

/**
 * projectName: car
 *
 * @author: xr
 * time: 2020/9/17 15:40
 * description:
 */

public interface UserService {
    public User login(String tel, String password);
    public void register(String tel,String password,String invitation,String email);



}
