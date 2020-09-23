package com.qfedu.controller;

import com.qfedu.common.JsonResult;
import com.qfedu.entity.User;
import com.qfedu.service.UserService;
import com.qfedu.utils.StrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * projectName: car
 *
 * @author: xr
 * time: 2020/9/17 15:47
 * description:
 */
@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login.do")
    @ResponseBody
    public JsonResult login(String tel, String password, HttpSession session){
        User login = userService.login(tel,password);
        session.setAttribute("loginUser",login);
        JsonResult jsonResult = new JsonResult(1,login);

        return jsonResult;
    }
    @ResponseBody
    @RequestMapping("/register.do")
    public JsonResult register(String tel,String password,String email,String invitation){
        userService.register(tel,password,invitation,email);

        User user = userService.login(tel,password);
        return new JsonResult(1,user);

    }
    @RequestMapping("/query.do")
    @ResponseBody
    public JsonResult query(HttpSession session){
        User user = (User)session.getAttribute("loginUser");
        if (user == null) {
            return new JsonResult(0,"未登录");
        }else{
            return new JsonResult(1,user);
        }

    }
    @ResponseBody
    @RequestMapping("/loginStusta.do")
    public JsonResult LoginStusta(HttpSession session){
        User user = (User) session.getAttribute ("loginUser");
        return new JsonResult (1, user.getTel());
    }
}
