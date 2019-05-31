package com.liu.haoahstu.user.controller;

import com.github.pagehelper.PageInfo;
import com.liu.haoahstu.auto.dao.TUser;
import com.liu.haoahstu.user.form.UserForm;
import com.liu.haoahstu.user.service.UserService;
import com.liu.haoahstu.util.Result;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/search")
    public Result<PageInfo<TUser>> search(UserForm form) {
        return userService.search(form);
    }

    @DeleteMapping("/delete")
    public Result delete(UserForm form) {
        return userService.delete(form);
    }

}
