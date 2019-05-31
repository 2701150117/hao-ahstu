package com.liu.haoahstu.login.service;

import com.liu.haoahstu.login.form.LoginForm;
import com.liu.haoahstu.util.Result;

public interface LoginService {
    Result add(LoginForm form);

    Result re(LoginForm form);

    Result get(LoginForm form);

    Result delete(LoginForm form);

    Result login(LoginForm form);

    Result update(LoginForm form);
}
