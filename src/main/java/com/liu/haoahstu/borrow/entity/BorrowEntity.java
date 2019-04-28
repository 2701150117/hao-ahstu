package com.liu.haoahstu.borrow.entity;

import lombok.Data;

import java.util.Date;

@Data
public class BorrowEntity {

    private String bookId;

    private String bookName;

    private Integer userId;

    private String userName;

    private Date borrowStart;

    private Date endDate;

    private Integer borrowEnd;
}
