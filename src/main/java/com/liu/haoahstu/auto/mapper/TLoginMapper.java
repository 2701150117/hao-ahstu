package com.liu.haoahstu.auto.mapper;

import com.liu.haoahstu.auto.dao.TLogin;
import com.liu.haoahstu.auto.dao.TLoginExample;
import com.liu.haoahstu.auto.dao.TLoginKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLoginMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login
     *
     * @mbg.generated Wed May 01 10:59:25 GMT+08:00 2019
     */
    long countByExample(TLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login
     *
     * @mbg.generated Wed May 01 10:59:25 GMT+08:00 2019
     */
    int deleteByExample(TLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login
     *
     * @mbg.generated Wed May 01 10:59:25 GMT+08:00 2019
     */
    int deleteByPrimaryKey(TLoginKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login
     *
     * @mbg.generated Wed May 01 10:59:25 GMT+08:00 2019
     */
    int insert(TLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login
     *
     * @mbg.generated Wed May 01 10:59:25 GMT+08:00 2019
     */
    int insertSelective(TLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login
     *
     * @mbg.generated Wed May 01 10:59:25 GMT+08:00 2019
     */
    List<TLogin> selectByExample(TLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login
     *
     * @mbg.generated Wed May 01 10:59:25 GMT+08:00 2019
     */
    TLogin selectByPrimaryKey(TLoginKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login
     *
     * @mbg.generated Wed May 01 10:59:25 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") TLogin record, @Param("example") TLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login
     *
     * @mbg.generated Wed May 01 10:59:25 GMT+08:00 2019
     */
    int updateByExample(@Param("record") TLogin record, @Param("example") TLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login
     *
     * @mbg.generated Wed May 01 10:59:25 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(TLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login
     *
     * @mbg.generated Wed May 01 10:59:25 GMT+08:00 2019
     */
    int updateByPrimaryKey(TLogin record);
}