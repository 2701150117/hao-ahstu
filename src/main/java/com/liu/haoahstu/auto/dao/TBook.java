package com.liu.haoahstu.auto.dao;

import java.util.Date;

public class TBook extends TBookKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_book.book_name
     *
     * @mbg.generated Thu May 09 10:55:42 GMT+08:00 2019
     */
    private String bookName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_book.status
     *
     * @mbg.generated Thu May 09 10:55:42 GMT+08:00 2019
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_book.create_date
     *
     * @mbg.generated Thu May 09 10:55:42 GMT+08:00 2019
     */
    private Date createDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_book.book_name
     *
     * @return the value of t_book.book_name
     *
     * @mbg.generated Thu May 09 10:55:42 GMT+08:00 2019
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_book.book_name
     *
     * @param bookName the value for t_book.book_name
     *
     * @mbg.generated Thu May 09 10:55:42 GMT+08:00 2019
     */
    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_book.status
     *
     * @return the value of t_book.status
     *
     * @mbg.generated Thu May 09 10:55:42 GMT+08:00 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_book.status
     *
     * @param status the value for t_book.status
     *
     * @mbg.generated Thu May 09 10:55:42 GMT+08:00 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_book.create_date
     *
     * @return the value of t_book.create_date
     *
     * @mbg.generated Thu May 09 10:55:42 GMT+08:00 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_book.create_date
     *
     * @param createDate the value for t_book.create_date
     *
     * @mbg.generated Thu May 09 10:55:42 GMT+08:00 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}