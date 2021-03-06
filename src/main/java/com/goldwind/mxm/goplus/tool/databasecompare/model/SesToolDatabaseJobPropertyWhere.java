package com.goldwind.mxm.goplus.tool.databasecompare.model;

public class SesToolDatabaseJobPropertyWhere {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ses_tool_database_job_property_where.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ses_tool_database_job_property_where.fk_job_id
     *
     * @mbggenerated
     */
    private String fkJobId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ses_tool_database_job_property_where.property_name
     *
     * @mbggenerated
     */
    private String propertyName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ses_tool_database_job_property_where.property_type
     *
     * @mbggenerated
     */
    private Integer propertyType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ses_tool_database_job_property_where.where_context
     *
     * @mbggenerated
     */
    private String whereContext;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ses_tool_database_job_property_where.id
     *
     * @return the value of ses_tool_database_job_property_where.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ses_tool_database_job_property_where.id
     *
     * @param id the value for ses_tool_database_job_property_where.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ses_tool_database_job_property_where.fk_job_id
     *
     * @return the value of ses_tool_database_job_property_where.fk_job_id
     *
     * @mbggenerated
     */
    public String getFkJobId() {
        return fkJobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ses_tool_database_job_property_where.fk_job_id
     *
     * @param fkJobId the value for ses_tool_database_job_property_where.fk_job_id
     *
     * @mbggenerated
     */
    public void setFkJobId(String fkJobId) {
        this.fkJobId = fkJobId == null ? null : fkJobId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ses_tool_database_job_property_where.property_name
     *
     * @return the value of ses_tool_database_job_property_where.property_name
     *
     * @mbggenerated
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ses_tool_database_job_property_where.property_name
     *
     * @param propertyName the value for ses_tool_database_job_property_where.property_name
     *
     * @mbggenerated
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName == null ? null : propertyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ses_tool_database_job_property_where.property_type
     *
     * @return the value of ses_tool_database_job_property_where.property_type
     *
     * @mbggenerated
     */
    public Integer getPropertyType() {
        return propertyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ses_tool_database_job_property_where.property_type
     *
     * @param propertyType the value for ses_tool_database_job_property_where.property_type
     *
     * @mbggenerated
     */
    public void setPropertyType(Integer propertyType) {
        this.propertyType = propertyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ses_tool_database_job_property_where.where_context
     *
     * @return the value of ses_tool_database_job_property_where.where_context
     *
     * @mbggenerated
     */
    public String getWhereContext() {
        return whereContext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ses_tool_database_job_property_where.where_context
     *
     * @param whereContext the value for ses_tool_database_job_property_where.where_context
     *
     * @mbggenerated
     */
    public void setWhereContext(String whereContext) {
        this.whereContext = whereContext == null ? null : whereContext.trim();
    }
}