package com.liu.haoahstu.book.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liu.haoahstu.auto.dao.TBook;
import com.liu.haoahstu.auto.dao.TBookExample;
import com.liu.haoahstu.auto.dao.TBookKey;
import com.liu.haoahstu.auto.mapper.TBookMapper;
import com.liu.haoahstu.book.form.BookForm;
import com.liu.haoahstu.book.mapper.BookMapper;
import com.liu.haoahstu.book.service.BookService;
import com.liu.haoahstu.constants.ResultCode;
import com.liu.haoahstu.user.form.UserForm;
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

    @Resource
    private BookMapper bookMapper;

    @Override
    public Result<PageInfo<TBook>> getBook(BookForm form) {

        PageHelper.startPage(form.getCurrentPage(), form.getPageSize());
        List<TBook> tBooks = bookMapper.getBook(form);
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
        TBookKey key = new TBookKey();
        key.setBookId(form.getBookId());
        TBook book = tBookMapper.selectByPrimaryKey(key);
        if(Tools.isEmpty(book)) {
            book = new TBook();
            book.setBookId(form.getBookId());
            book.setBookName(form.getBookName());
            book.setStatus(1);
            book.setCreateDate(new Date());
            return tBookMapper.insert(book) >0 ? Result.success(): Result.failure(ResultCode.PARAM_IS_BLANK);
        }
        book.setBookName(form.getBookName());
        book.setStatus(form.getStatus());
        return tBookMapper.updateByPrimaryKey(book)>0 ? Result.success(): Result.failure(ResultCode.PARAM_IS_INVALID);
    }

}
