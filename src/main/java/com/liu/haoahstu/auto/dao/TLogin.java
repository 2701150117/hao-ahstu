package com.liu.haoahstu.auto.dao;

public class TLogin extends TLoginKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login.name
     *
     * @mbg.generated Tue Apr 16 13:34:54 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login.password
     *
     * @mbg.generated Tue Apr 16 13:34:54 CST 2019
     */
    private String password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login.name
     *
     * @return the value of t_login.name
     *
     * @mbg.generated Tue Apr 16 13:34:54 CST 2019
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
     * @mbg.generated Tue Apr 16 13:34:54 CST 2019
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
     * @mbg.generated Tue Apr 16 13:34:54 CST 2019
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
     * @mbg.generated Tue Apr 16 13:34:54 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}