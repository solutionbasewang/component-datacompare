package com.goldwind.mxm.goplus.tool.databasecompare.dao;

import com.goldwind.mxm.goplus.tool.databasecompare.model.SesToolDatabaseSourceLogProperty;
import com.goldwind.mxm.goplus.tool.databasecompare.model.SesToolDatabaseSourceLogPropertyExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SesToolDatabaseSourceLogPropertyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    int countByExample(SesToolDatabaseSourceLogPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    int deleteByExample(SesToolDatabaseSourceLogPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    int insert(SesToolDatabaseSourceLogProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    int insertSelective(SesToolDatabaseSourceLogProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    List<SesToolDatabaseSourceLogProperty> selectByExample(SesToolDatabaseSourceLogPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    SesToolDatabaseSourceLogProperty selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SesToolDatabaseSourceLogProperty record, @Param("example") SesToolDatabaseSourceLogPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SesToolDatabaseSourceLogProperty record, @Param("example") SesToolDatabaseSourceLogPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SesToolDatabaseSourceLogProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SesToolDatabaseSourceLogProperty record);
}