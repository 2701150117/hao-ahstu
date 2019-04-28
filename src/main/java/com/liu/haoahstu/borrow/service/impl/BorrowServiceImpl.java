package com.liu.haoahstu.borrow.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liu.haoahstu.auto.dao.TBorrow;
import com.liu.haoahstu.auto.mapper.TBorrowMapper;
import com.liu.haoahstu.borrow.entity.BorrowEntity;
import com.liu.haoahstu.borrow.form.BorrowForm;
import com.liu.haoahstu.borrow.mapper.BorrowMapper;
import com.liu.haoahstu.borrow.service.BorrowService;
import com.liu.haoahstu.constants.ResultCode;
import com.liu.haoahstu.util.Result;
import com.liu.haoahstu.util.Tools;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

@Service
public class BorrowServiceImpl implements BorrowService {

    @Resource
    private TBorrowMapper tBorrowMapper;

    @Resource
    private BorrowMapper borrowMapper;

    @Override
    public Result borrowBookByUserId(BorrowForm form) {
        TBorrow tBorrow = new TBorrow();
        if (Tools.isEmpty(form)) {
            return Result.failure(ResultCode.PARAM_IS_BLANK);
        }
        tBorrow.setBookId(form.getBookId());
        tBorrow.setUserId(form.getUserId());
        tBorrow.setCreateDate(new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.MONTH, 3);
        tBorrow.setEndDate(calendar.getTime());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return tBorrowMapper.insert(tBorrow) > 0 ? Result.success(formatter.format(calendar.getTime())) : Result.failure(ResultCode.DATA_IS_WRONG);
    }

    @Override
    public Result getBorrow(BorrowForm form) {
        PageHelper.startPage(form.getCurrentPage(), form.getPageSize());
        List<BorrowEntity> borrowEntityList = borrowMapper.query(form);
        borrowEntityList.forEach(borrowEntity -> {
            Date date = new Date();
            long longTime = ((borrowEntity.getEndDate().getTime() - date.getTime()) / (1000 * 60 * 60 * 24));
            borrowEntity.setBorrowEnd(Integer.parseInt(Long.toString(longTime)));
        });
        PageInfo<BorrowEntity> pageInfo = new PageInfo<>(borrowEntityList);
        Result<PageInfo<BorrowEntity>> result = new Result<>();
        result.setPage(pageInfo);
        return result;
    }
}
