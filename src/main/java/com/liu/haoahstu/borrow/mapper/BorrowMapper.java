package com.liu.haoahstu.borrow.mapper;

import com.liu.haoahstu.borrow.entity.BorrowEntity;
import com.liu.haoahstu.borrow.form.BorrowForm;

import java.util.List;

public interface BorrowMapper {

    List<BorrowEntity> query(BorrowForm form);
}
