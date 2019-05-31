package com.liu.haoahstu.login.controller;

import com.liu.haoahstu.login.form.LoginForm;
import com.liu.haoahstu.login.service.LoginService;
import com.liu.haoahstu.util.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hao/login")
public class LoginController {

    @Resource
    private LoginService loginService;

    @PostMapping("/add")
    public Result add(LoginForm form) {
        return loginService.add(form);
    }

    @GetMapping("/re")
    public Result re(LoginForm form) {
        return loginService.re(form);
    }

    @GetMapping("/get")
    public Result get(LoginForm form) {
        return loginService.get(form);
    }

    @DeleteMapping("/delete")
    public Result delete(LoginForm form) {
        return loginService.delete(form);
    }

    @PostMapping("/login")
    public Result login(LoginForm form) {
        return loginService.login(form);
    }

    @PostMapping("/update")
    public Result update(LoginForm form) {
        return loginService.update(form);
    }
}
