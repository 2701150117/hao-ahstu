package com.liu.haoahstu.borrow.controller;

import com.liu.haoahstu.borrow.form.BorrowForm;
import com.liu.haoahstu.borrow.service.BorrowService;
import com.liu.haoahstu.user.form.UserForm;
import com.liu.haoahstu.util.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hao/borrow")
public class        BorrowController {

    @Resource
    private BorrowService borrowService;

    @PostMapping("/borrowBookByUserId")
    public Result borrowBookByUserId(BorrowForm form) {
        return borrowService.borrowBookByUserId(form);
    }

    @GetMapping("/getBorrow")
    public Result getBorrow(BorrowForm form) {
        return borrowService.getBorrow(form);
    }

    @DeleteMapping("/delete")
    public Result deleteBorrow(BorrowForm form) {
        return borrowService.delete(form);
    }
}
