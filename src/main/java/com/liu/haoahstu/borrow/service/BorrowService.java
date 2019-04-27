package com.liu.haoahstu.borrow.service;

import com.liu.haoahstu.borrow.form.BorrowForm;
import com.liu.haoahstu.util.Result;

public interface BorrowService {
    Result borrowBookByUserId(BorrowForm form);
}
