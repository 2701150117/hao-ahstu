package com.liu.haoahstu.login.mapper;

import com.liu.haoahstu.auto.dao.TLogin;
import com.liu.haoahstu.login.form.LoginForm;

import java.util.List;

public interface LoginMapper {
    List<TLogin> get(LoginForm form);
}
