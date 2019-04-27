package com.liu.haoahstu.borrow.controller;

import com.liu.haoahstu.borrow.form.BorrowForm;
import com.liu.haoahstu.borrow.service.BorrowService;
import com.liu.haoahstu.user.form.UserForm;
import com.liu.haoahstu.util.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hao/borrow")
public class BorrowController {

    @Resource
    private BorrowService borrowService;

    @PostMapping("/borrowBookByUserId")
    public Result borrowBookByUserId(BorrowForm form) {
        return borrowService.borrowBookByUserId(form);
    }
}
