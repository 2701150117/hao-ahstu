package com.liu.haoahstu.borrow.form;

import com.liu.haoahstu.common.form.PageForm;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class BorrowForm extends PageForm {

    private String bookId;

    private Integer userId;

    private String bookName;

    private String userName;
}
