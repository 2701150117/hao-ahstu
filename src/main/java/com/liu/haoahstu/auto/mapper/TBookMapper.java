package com.liu.haoahstu.auto.mapper;

import com.liu.haoahstu.auto.dao.TBook;
import com.liu.haoahstu.auto.dao.TBookExample;
import com.liu.haoahstu.auto.dao.TBookKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbg.generated Fri May 31 10:11:08 CST 2019
     */
    long countByExample(TBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbg.generated Fri May 31 10:11:08 CST 2019
     */
    int deleteByExample(TBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbg.generated Fri May 31 10:11:08 CST 2019
     */
    int deleteByPrimaryKey(TBookKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbg.generated Fri May 31 10:11:08 CST 2019
     */
    int insert(TBook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbg.generated Fri May 31 10:11:08 CST 2019
     */
    int insertSelective(TBook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbg.generated Fri May 31 10:11:08 CST 2019
     */
    List<TBook> selectByExample(TBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbg.generated Fri May 31 10:11:08 CST 2019
     */
    TBook selectByPrimaryKey(TBookKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbg.generated Fri May 31 10:11:08 CST 2019
     */
    int updateByExampleSelective(@Param("record") TBook record, @Param("example") TBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbg.generated Fri May 31 10:11:08 CST 2019
     */
    int updateByExample(@Param("record") TBook record, @Param("example") TBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbg.generated Fri May 31 10:11:08 CST 2019
     */
    int updateByPrimaryKeySelective(TBook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbg.generated Fri May 31 10:11:08 CST 2019
     */
    int updateByPrimaryKey(TBook record);
}