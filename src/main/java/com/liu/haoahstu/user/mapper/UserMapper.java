package com.liu.haoahstu.user.mapper;

import com.liu.haoahstu.auto.dao.TUser;
import com.liu.haoahstu.user.form.UserForm;

import java.util.List;

public interface UserMapper {
    List<TUser> search(UserForm form);
}
