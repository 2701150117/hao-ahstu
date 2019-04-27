package com.liu.haoahstu.user.form;

import com.liu.haoahstu.common.form.PageForm;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserForm extends PageForm {

    private Integer userId;

    private String userName;

    private String userAddress;

    private String userPhone;

    private String userNumber;
}
