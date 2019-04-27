package com.liu.haoahstu.user.service;

import com.github.pagehelper.PageInfo;
import com.liu.haoahstu.auto.dao.TUser;
import com.liu.haoahstu.user.form.UserForm;
import com.liu.haoahstu.util.Result;

public interface UserService {

    Result saveOrUpdate(UserForm form);

    Result<PageInfo<TUser>> search(UserForm form);

    Result delete(UserForm form);
}
