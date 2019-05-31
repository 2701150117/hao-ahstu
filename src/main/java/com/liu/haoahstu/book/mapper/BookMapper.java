package com.liu.haoahstu.book.mapper;

import com.liu.haoahstu.auto.dao.TBook;
import com.liu.haoahstu.book.form.BookForm;

import java.util.List;

public interface BookMapper {
    List<TBook> getBook(BookForm form);
}
