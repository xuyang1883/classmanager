package com.xuyang.classmanager.controller;

import com.xuyang.classmanager.entity.User;
import com.xuyang.classmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping ("/login")
    public User login(@RequestParam String username, @RequestParam String password) {
        User user = userService.login(username, password);
        if (user != null) {
            // 登录成功，返回用户信息（密码不返回，设为null）
            user.setPassword(null);
            return user;
        } else {
            // 登录失败，返回 null 或者可以抛异常
            return null;
        }
    }
}