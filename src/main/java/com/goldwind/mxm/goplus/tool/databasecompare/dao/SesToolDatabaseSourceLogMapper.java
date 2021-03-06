package com.goldwind.mxm.goplus.tool.databasecompare.dao;

import com.goldwind.mxm.goplus.tool.databasecompare.model.SesToolDatabaseSourceLog;
import com.goldwind.mxm.goplus.tool.databasecompare.model.SesToolDatabaseSourceLogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SesToolDatabaseSourceLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log
     *
     * @mbggenerated
     */
    int countByExample(SesToolDatabaseSourceLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log
     *
     * @mbggenerated
     */
    int deleteByExample(SesToolDatabaseSourceLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log
     *
     * @mbggenerated
     */
    int insert(SesToolDatabaseSourceLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log
     *
     * @mbggenerated
     */
    int insertSelective(SesToolDatabaseSourceLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log
     *
     * @mbggenerated
     */
    List<SesToolDatabaseSourceLog> selectByExample(SesToolDatabaseSourceLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log
     *
     * @mbggenerated
     */
    SesToolDatabaseSourceLog selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SesToolDatabaseSourceLog record, @Param("example") SesToolDatabaseSourceLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SesToolDatabaseSourceLog record, @Param("example") SesToolDatabaseSourceLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SesToolDatabaseSourceLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SesToolDatabaseSourceLog record);
}