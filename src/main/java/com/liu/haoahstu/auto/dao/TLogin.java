package com.liu.haoahstu.auto.dao;

import java.util.Date;

public class TLogin extends TLoginKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login.name
     *
     * @mbg.generated Wed May 01 10:59:25 GMT+08:00 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login.password
     *
     * @mbg.generated Wed May 01 10:59:25 GMT+08:00 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login.create_date
     *
     * @mbg.generated Wed May 01 10:59:25 GMT+08:00 2019
     */
    private Date createDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login.name
     *
     * @return the value of t_login.name
     *
     * @mbg.generated Wed May 01 10:59:25 GMT+08:00 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login.name
     *
     * @param name the value for t_login.name
     *
     * @mbg.generated Wed May 01 10:59:25 GMT+08:00 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login.password
     *
     * @return the value of t_login.password
     *
     * @mbg.generated Wed May 01 10:59:25 GMT+08:00 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login.password
     *
     * @param password the value for t_login.password
     *
     * @mbg.generated Wed May 01 10:59:25 GMT+08:00 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login.create_date
     *
     * @return the value of t_login.create_date
     *
     * @mbg.generated Wed May 01 10:59:25 GMT+08:00 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login.create_date
     *
     * @param createDate the value for t_login.create_date
     *
     * @mbg.generated Wed May 01 10:59:25 GMT+08:00 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}