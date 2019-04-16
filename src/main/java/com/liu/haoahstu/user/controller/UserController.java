package com.liu.haoahstu.user.controller;

import com.liu.haoahstu.user.form.UserForm;
import com.liu.haoahstu.user.service.UserService;
import com.liu.haoahstu.util.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hao/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/saveOrUpdate")
    public Result saveOrUpdate(UserForm form) {
        return userService.saveOrUpdate(form);
    }
}
