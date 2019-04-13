package com.liu.haoahstu.book.service;

import com.github.pagehelper.PageInfo;
import com.liu.haoahstu.auto.dao.TBook;
import com.liu.haoahstu.book.form.BookForm;
import com.liu.haoahstu.util.Result;

public interface BookService {

    Result<PageInfo<TBook>> getBook(BookForm form);

    Result delete(BookForm form);

    Result saveOrUpdateBook(BookForm form);
}
