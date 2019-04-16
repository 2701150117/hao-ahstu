package com.liu.haoahstu.user.service;

import com.liu.haoahstu.user.form.UserForm;
import com.liu.haoahstu.util.Result;

public interface UserService {

    Result saveOrUpdate(UserForm form);
}
