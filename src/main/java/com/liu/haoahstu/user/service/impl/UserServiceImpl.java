package com.liu.haoahstu.user.service.impl;

import com.liu.haoahstu.auto.mapper.TUserMapper;
import com.liu.haoahstu.user.form.UserForm;
import com.liu.haoahstu.user.service.UserService;
import com.liu.haoahstu.util.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private TUserMapper tUserMapper;

    @Override
    public Result saveOrUpdate(UserForm form) {
        return null;
    }
}
