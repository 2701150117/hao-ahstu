package com.liu.haoahstu.borrow.service.impl;

import com.liu.haoahstu.auto.dao.TBorrow;
import com.liu.haoahstu.auto.mapper.TBorrowMapper;
import com.liu.haoahstu.borrow.form.BorrowForm;
import com.liu.haoahstu.borrow.service.BorrowService;
import com.liu.haoahstu.constants.ResultCode;
import com.liu.haoahstu.util.Result;
import com.liu.haoahstu.util.Tools;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

@Service
public class BorrowServiceImpl implements BorrowService {

    @Resource
    private TBorrowMapper tBorrowMapper;

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
}
