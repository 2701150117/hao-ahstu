package com.liu.haoahstu.book.controller;

import com.github.pagehelper.PageInfo;
import com.liu.haoahstu.auto.dao.TBook;
import com.liu.haoahstu.book.form.BookForm;
import com.liu.haoahstu.book.service.BookService;
import com.liu.haoahstu.util.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hao/book")
public class BookController {

    @Resource
    private BookService bookService;

    @GetMapping("/getBook")
    public Result<PageInfo<TBook>> getBook(BookForm form){
        return bookService.getBook(form);
    }

    @DeleteMapping("/deleteBook")
    public Result deleteBook(BookForm form) {
        return bookService.delete(form);
    }

    @PostMapping("/saveOrUpdateBook")
    public Result saveOrUpdateBook(BookForm form){
        return bookService.saveOrUpdateBook(form);
    }

}
