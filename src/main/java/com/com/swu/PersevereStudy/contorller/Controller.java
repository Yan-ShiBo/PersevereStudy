
/*
 * Copyright (c) Yan ShiBo . 2023-2023. All rights reserved.
 */

package com.com.swu.PersevereStudy.contorller;

import com.com.swu.PersevereStudy.domain.Manager;
import com.com.swu.PersevereStudy.domain.User;
import com.com.swu.PersevereStudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping("/api")
public class Controller {
    @Autowired
    private UserService userService;

    @PostMapping("/m_login")
    @ResponseBody
    public Manager m_login(@RequestBody Manager manager) {
        // 在这里处理登录逻辑
        // user是前端发送的请求体，包含了用户名和密码等信息
        System.out.println(manager.getUserName() + "---" + manager.getPassword());
        return manager;
    }

    @PostMapping("/u_login")
    @ResponseBody
    public User u_login(@RequestBody User user) {
        // 在这里处理登录逻辑
        // user是前端发送的请求体，包含了用户名和密码等信息
        System.out.println(user.getUname() + "---" + user.getUpassword());
        List<User> listdata = userService.list();


        if (user.getUname() == null || user.getUname().equals("")) {
            System.out.println("用户名为空");
            return null;
        }
        if (user.getUpassword() == null || user.getUpassword().equals("")) {
            System.out.println("密码为空");
            return null;
        }

        for (User i : listdata) {
            if (i.getUname().equals(user.getUname()) && i.getUpassword().equals(user.getUpassword())) {
                System.out.println("登录成功" + i);
                return i;
            }
        }

        return null;
    }
}