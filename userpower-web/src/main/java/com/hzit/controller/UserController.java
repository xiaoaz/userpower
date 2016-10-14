package com.hzit.controller;

import com.hzit.dao.entity.Userinfo;
import com.hzit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/10/13.
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/checklogin")
    public String login(@RequestParam("username")String username,@RequestParam("userpwd")String userpwd,HttpSession session){
        System.out.println("欢迎来到登录控制器");
        Userinfo userinfo1=userService.selectOne(username,userpwd);
        if (userinfo1!=null){
            session.setAttribute("userinfo",userinfo1);
            return "redirect:index.html";
        }else
            return "redirect:login.html";
    }
}
