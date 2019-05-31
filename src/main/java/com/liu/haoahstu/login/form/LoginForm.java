package com.liu.haoahstu.login.form;

import com.liu.haoahstu.common.form.PageForm;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class LoginForm extends PageForm {
    private Integer id;

    private String name;

    private String password;
}
