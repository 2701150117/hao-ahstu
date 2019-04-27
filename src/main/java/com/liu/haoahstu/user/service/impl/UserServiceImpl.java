package com.liu.haoahstu.user.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liu.haoahstu.auto.dao.TUser;
import com.liu.haoahstu.auto.dao.TUserExample;
import com.liu.haoahstu.auto.dao.TUserKey;
import com.liu.haoahstu.auto.mapper.TUserMapper;
import com.liu.haoahstu.constants.ResultCode;
import com.liu.haoahstu.user.form.UserForm;
import com.liu.haoahstu.user.service.UserService;
import com.liu.haoahstu.util.Result;
import com.liu.haoahstu.util.Tools;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private TUserMapper tUserMapper;

    @Override
    public Result saveOrUpdate(UserForm form) {
        TUserKey key = new TUserKey();
        key.setUserId(form.getUserId());
        TUser user = tUserMapper.selectByPrimaryKey(key);
        if (Tools.isEmpty(user)) {
            user = new TUser();
            user.setUserName(form.getUserName());
            user.setUserNumber(form.getUserNumber());
            user.setUserAddress(form.getUserAddress());
            user.setUserPhone(form.getUserPhone());
            return tUserMapper.insert(user) > 0 ? Result.success() : Result.failure(ResultCode.DATA_IS_WRONG);

        }
        user.setUserName(form.getUserName());
        user.setUserNumber(form.getUserNumber());
        user.setUserPhone(form.getUserPhone());
        user.setUserAddress(form.getUserAddress());
        return tUserMapper.updateByPrimaryKey(user) > 0 ? Result.success() : Result.failure(ResultCode.RESULT_DATA_NONE);
    }

    @Override
    public Result<PageInfo<TUser>> search(UserForm form) {
        TUserExample example = new TUserExample();
        TUserExample.Criteria criteria = example.createCriteria();
        if (Tools.isNotEmpty(form.getUserName())) {
            criteria.andUserNameLike(form.getUserName());
        }
        PageHelper.startPage(form.getCurrentPage(), form.getPageSize());
        List<TUser> users = tUserMapper.selectByExample(example);
        PageInfo<TUser> pageInfo = new PageInfo<>(users);
        Result<PageInfo<TUser>> result = new Result<>();
        result.setPage(pageInfo);
        return result;
    }

    @Override
    public Result delete(UserForm form) {
        TUserKey key = new TUserKey();
        if (Tools.isNotEmpty(form.getUserId())) {
            key.setUserId(form.getUserId());
        }
        return tUserMapper.deleteByPrimaryKey(key) > 0 ? Result.success() : Result.failure(ResultCode.RESULT_DATA_NONE);
    }
}
