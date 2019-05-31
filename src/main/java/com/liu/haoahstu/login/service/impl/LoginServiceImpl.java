package com.liu.haoahstu.login.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liu.haoahstu.auto.dao.TLogin;
import com.liu.haoahstu.auto.dao.TLoginExample;
import com.liu.haoahstu.auto.dao.TLoginKey;
import com.liu.haoahstu.auto.mapper.TLoginMapper;
import com.liu.haoahstu.constants.ResultCode;
import com.liu.haoahstu.login.form.LoginForm;
import com.liu.haoahstu.login.mapper.LoginMapper;
import com.liu.haoahstu.login.service.LoginService;
import com.liu.haoahstu.util.Result;
import com.liu.haoahstu.util.Tools;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private TLoginMapper tLoginMapper;

    @Resource
    private LoginMapper loginMapper;

    @Override
    public Result add(LoginForm form) {
        if (Tools.isEmpty(form)) {
            return Result.failure(ResultCode.PARAM_IS_BLANK);
        }
        TLogin tLogin = new TLogin();
        tLogin.setId(form.getId());
        tLogin.setName(form.getName());
        tLogin.setCreateDate(new Date());
        tLogin.setPassword("123456");
        return tLoginMapper.insert(tLogin) > 0 ? Result.success() : Result.failure(ResultCode.INTERFACE_INNER_INVOKE_ERROR);
    }

    @Override
    public Result re(LoginForm form) {
        if (Tools.isEmpty(form) || Tools.isEmpty(form.getId())) {
            return Result.failure(ResultCode.PARAM_IS_BLANK);
        }
        TLoginKey tLoginKey = new TLoginKey();
        tLoginKey.setId(form.getId());
        TLogin tLogin = tLoginMapper.selectByPrimaryKey(tLoginKey);
        tLogin.setPassword("123456");
        return tLoginMapper.updateByPrimaryKey(tLogin) > 0 ? Result.success() : Result.failure(ResultCode.INTERFACE_INNER_INVOKE_ERROR);
    }

    @Override
    public Result<PageInfo<TLogin>> get(LoginForm form) {
        PageHelper.startPage(form.getCurrentPage(), form.getPageSize());
        List<TLogin> logins = loginMapper.get(form);
        PageInfo<TLogin> pageInfo = new PageInfo<>(logins);
        Result<PageInfo<TLogin>> result = new Result<>();
        result.setPage(pageInfo);
        return result;
    }

    @Override
    public Result delete(LoginForm form) {
        if (Tools.isEmpty(form) || Tools.isEmpty(form.getId())) {
            return Result.failure(ResultCode.PARAM_IS_BLANK);
        }
        if (form.getId() == 123456) {
            return Result.failure(ResultCode.EMPLOY_NOT_DELETE);
        }
        TLoginKey tLoginKey = new TLoginKey();
        tLoginKey.setId(form.getId());
        return tLoginMapper.deleteByPrimaryKey(tLoginKey) > 0 ? Result.success() : Result.failure(ResultCode.EMPLOY_NOT_EXIST);
    }

    @Override
    public Result login(LoginForm form) {
        TLoginExample example = new TLoginExample();
        TLoginExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(form.getName());
        List<TLogin> tLoginList = tLoginMapper.selectByExample(example);
        return tLoginList.size() > 0 && tLoginList.get(0).getPassword().equals(form.getPassword()) ? Result.success(tLoginList.get(0)) : Result.failure(ResultCode.EMPLOY_LOGIN_ERROR);
    }

    @Override
    public Result update(LoginForm form) {
        if (Tools.isEmpty(form) || Tools.isEmpty(form.getId())) {
            return Result.failure(ResultCode.PARAM_IS_BLANK);
        }
        TLogin tLogin = new TLogin();
        tLogin.setId(form.getId());
        tLogin = tLoginMapper.selectByPrimaryKey(tLogin);
        if (Tools.isEmpty(tLogin)) return Result.failure(ResultCode.DATA_IS_WRONG);
        tLogin.setPassword(form.getPassword());
        return tLoginMapper.updateByPrimaryKey(tLogin) > 0 ? Result.success() : Result.failure(ResultCode.INTERFACE_INNER_INVOKE_ERROR);
    }
}
