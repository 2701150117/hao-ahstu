package com.liu.haoahstu.book.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liu.haoahstu.auto.dao.TBook;
import com.liu.haoahstu.auto.dao.TBookExample;
import com.liu.haoahstu.auto.dao.TBookKey;
import com.liu.haoahstu.auto.mapper.TBookMapper;
import com.liu.haoahstu.book.form.BookForm;
import com.liu.haoahstu.book.service.BookService;
import com.liu.haoahstu.constants.ResultCode;
import com.liu.haoahstu.util.Result;
import com.liu.haoahstu.util.Tools;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    private TBookMapper tBookMapper;

    @Override
    public Result<PageInfo<TBook>> getBook(BookForm form) {

        TBookExample example = new TBookExample();
        TBookExample.Criteria criteria = example.createCriteria();
        if (Tools.isNotEmpty(form.getBookName())) {
            criteria.andBookNameLike(form.getBookName());
        }
        //分页
        PageHelper.startPage(form.getCurrentPage(), form.getPageSize());
        List<TBook> tBooks = tBookMapper.selectByExample(example);
        PageInfo<TBook> pageInfo = new PageInfo<>(tBooks);
        Result<PageInfo<TBook>> result = new Result<>();
        result.setPage(pageInfo);
        return result;
    }

    @Override
    public Result delete(BookForm form) {
        if(Tools.isNotEmpty(form.getBookId())) {
            TBookKey key = new TBookKey();
            key.setBookId(form.getBookId());
            tBookMapper.deleteByPrimaryKey(key);
        }
        return null;
    }

    @Override
    public Result saveOrUpdateBook(BookForm form) {
        if(Tools.isEmpty(form.getBookId())) {
            TBook tBook = new TBook();
            tBook.setBookName(form.getBookName());
            tBook.setCreateDate(new Date());
            return tBookMapper.insert(tBook) >0 ? Result.success(): Result.failure(ResultCode.PARAM_IS_BLANK);
        }
        TBookKey tBookKey = new TBookKey();
        tBookKey.setBookId(form.getBookId());
        TBook tBook = tBookMapper.selectByPrimaryKey(tBookKey);
        tBook.setBookName(form.getBookName());
        tBook.setCreateDate(new Date());
        return tBookMapper.updateByPrimaryKey(tBook)>0 ? Result.success(): Result.failure(ResultCode.PARAM_IS_INVALID);
    }
}
