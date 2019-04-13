package com.liu.haoahstu.book.form;

import com.liu.haoahstu.common.form.PageForm;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class BookForm extends PageForm {

    private Integer bookId;

    private String bookName;
}
