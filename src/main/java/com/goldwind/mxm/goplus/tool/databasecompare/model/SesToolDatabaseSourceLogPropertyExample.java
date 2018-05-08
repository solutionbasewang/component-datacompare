package com.goldwind.mxm.goplus.tool.databasecompare.model;

import java.util.ArrayList;
import java.util.List;

public class SesToolDatabaseSourceLogPropertyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    public SesToolDatabaseSourceLogPropertyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFkDatasourceidIsNull() {
            addCriterion("fk_datasourceid is null");
            return (Criteria) this;
        }

        public Criteria andFkDatasourceidIsNotNull() {
            addCriterion("fk_datasourceid is not null");
            return (Criteria) this;
        }

        public Criteria andFkDatasourceidEqualTo(String value) {
            addCriterion("fk_datasourceid =", value, "fkDatasourceid");
            return (Criteria) this;
        }

        public Criteria andFkDatasourceidNotEqualTo(String value) {
            addCriterion("fk_datasourceid <>", value, "fkDatasourceid");
            return (Criteria) this;
        }

        public Criteria andFkDatasourceidGreaterThan(String value) {
            addCriterion("fk_datasourceid >", value, "fkDatasourceid");
            return (Criteria) this;
        }

        public Criteria andFkDatasourceidGreaterThanOrEqualTo(String value) {
            addCriterion("fk_datasourceid >=", value, "fkDatasourceid");
            return (Criteria) this;
        }

        public Criteria andFkDatasourceidLessThan(String value) {
            addCriterion("fk_datasourceid <", value, "fkDatasourceid");
            return (Criteria) this;
        }

        public Criteria andFkDatasourceidLessThanOrEqualTo(String value) {
            addCriterion("fk_datasourceid <=", value, "fkDatasourceid");
            return (Criteria) this;
        }

        public Criteria andFkDatasourceidLike(String value) {
            addCriterion("fk_datasourceid like", value, "fkDatasourceid");
            return (Criteria) this;
        }

        public Criteria andFkDatasourceidNotLike(String value) {
            addCriterion("fk_datasourceid not like", value, "fkDatasourceid");
            return (Criteria) this;
        }

        public Criteria andFkDatasourceidIn(List<String> values) {
            addCriterion("fk_datasourceid in", values, "fkDatasourceid");
            return (Criteria) this;
        }

        public Criteria andFkDatasourceidNotIn(List<String> values) {
            addCriterion("fk_datasourceid not in", values, "fkDatasourceid");
            return (Criteria) this;
        }

        public Criteria andFkDatasourceidBetween(String value1, String value2) {
            addCriterion("fk_datasourceid between", value1, value2, "fkDatasourceid");
            return (Criteria) this;
        }

        public Criteria andFkDatasourceidNotBetween(String value1, String value2) {
            addCriterion("fk_datasourceid not between", value1, value2, "fkDatasourceid");
            return (Criteria) this;
        }

        public Criteria andFkJobIdIsNull() {
            addCriterion("fk_job_id is null");
            return (Criteria) this;
        }

        public Criteria andFkJobIdIsNotNull() {
            addCriterion("fk_job_id is not null");
            return (Criteria) this;
        }

        public Criteria andFkJobIdEqualTo(String value) {
            addCriterion("fk_job_id =", value, "fkJobId");
            return (Criteria) this;
        }

        public Criteria andFkJobIdNotEqualTo(String value) {
            addCriterion("fk_job_id <>", value, "fkJobId");
            return (Criteria) this;
        }

        public Criteria andFkJobIdGreaterThan(String value) {
            addCriterion("fk_job_id >", value, "fkJobId");
            return (Criteria) this;
        }

        public Criteria andFkJobIdGreaterThanOrEqualTo(String value) {
            addCriterion("fk_job_id >=", value, "fkJobId");
            return (Criteria) this;
        }

        public Criteria andFkJobIdLessThan(String value) {
            addCriterion("fk_job_id <", value, "fkJobId");
            return (Criteria) this;
        }

        public Criteria andFkJobIdLessThanOrEqualTo(String value) {
            addCriterion("fk_job_id <=", value, "fkJobId");
            return (Criteria) this;
        }

        public Criteria andFkJobIdLike(String value) {
            addCriterion("fk_job_id like", value, "fkJobId");
            return (Criteria) this;
        }

        public Criteria andFkJobIdNotLike(String value) {
            addCriterion("fk_job_id not like", value, "fkJobId");
            return (Criteria) this;
        }

        public Criteria andFkJobIdIn(List<String> values) {
            addCriterion("fk_job_id in", values, "fkJobId");
            return (Criteria) this;
        }

        public Criteria andFkJobIdNotIn(List<String> values) {
            addCriterion("fk_job_id not in", values, "fkJobId");
            return (Criteria) this;
        }

        public Criteria andFkJobIdBetween(String value1, String value2) {
            addCriterion("fk_job_id between", value1, value2, "fkJobId");
            return (Criteria) this;
        }

        public Criteria andFkJobIdNotBetween(String value1, String value2) {
            addCriterion("fk_job_id not between", value1, value2, "fkJobId");
            return (Criteria) this;
        }

        public Criteria andFkJobPropertyIdIsNull() {
            addCriterion("fk_job_property_id is null");
            return (Criteria) this;
        }

        public Criteria andFkJobPropertyIdIsNotNull() {
            addCriterion("fk_job_property_id is not null");
            return (Criteria) this;
        }

        public Criteria andFkJobPropertyIdEqualTo(String value) {
            addCriterion("fk_job_property_id =", value, "fkJobPropertyId");
            return (Criteria) this;
        }

        public Criteria andFkJobPropertyIdNotEqualTo(String value) {
            addCriterion("fk_job_property_id <>", value, "fkJobPropertyId");
            return (Criteria) this;
        }

        public Criteria andFkJobPropertyIdGreaterThan(String value) {
            addCriterion("fk_job_property_id >", value, "fkJobPropertyId");
            return (Criteria) this;
        }

        public Criteria andFkJobPropertyIdGreaterThanOrEqualTo(String value) {
            addCriterion("fk_job_property_id >=", value, "fkJobPropertyId");
            return (Criteria) this;
        }

        public Criteria andFkJobPropertyIdLessThan(String value) {
            addCriterion("fk_job_property_id <", value, "fkJobPropertyId");
            return (Criteria) this;
        }

        public Criteria andFkJobPropertyIdLessThanOrEqualTo(String value) {
            addCriterion("fk_job_property_id <=", value, "fkJobPropertyId");
            return (Criteria) this;
        }

        public Criteria andFkJobPropertyIdLike(String value) {
            addCriterion("fk_job_property_id like", value, "fkJobPropertyId");
            return (Criteria) this;
        }

        public Criteria andFkJobPropertyIdNotLike(String value) {
            addCriterion("fk_job_property_id not like", value, "fkJobPropertyId");
            return (Criteria) this;
        }

        public Criteria andFkJobPropertyIdIn(List<String> values) {
            addCriterion("fk_job_property_id in", values, "fkJobPropertyId");
            return (Criteria) this;
        }

        public Criteria andFkJobPropertyIdNotIn(List<String> values) {
            addCriterion("fk_job_property_id not in", values, "fkJobPropertyId");
            return (Criteria) this;
        }

        public Criteria andFkJobPropertyIdBetween(String value1, String value2) {
            addCriterion("fk_job_property_id between", value1, value2, "fkJobPropertyId");
            return (Criteria) this;
        }

        public Criteria andFkJobPropertyIdNotBetween(String value1, String value2) {
            addCriterion("fk_job_property_id not between", value1, value2, "fkJobPropertyId");
            return (Criteria) this;
        }

        public Criteria andLogResultIsNull() {
            addCriterion("log_result is null");
            return (Criteria) this;
        }

        public Criteria andLogResultIsNotNull() {
            addCriterion("log_result is not null");
            return (Criteria) this;
        }

        public Criteria andLogResultEqualTo(String value) {
            addCriterion("log_result =", value, "logResult");
            return (Criteria) this;
        }

        public Criteria andLogResultNotEqualTo(String value) {
            addCriterion("log_result <>", value, "logResult");
            return (Criteria) this;
        }

        public Criteria andLogResultGreaterThan(String value) {
            addCriterion("log_result >", value, "logResult");
            return (Criteria) this;
        }

        public Criteria andLogResultGreaterThanOrEqualTo(String value) {
            addCriterion("log_result >=", value, "logResult");
            return (Criteria) this;
        }

        public Criteria andLogResultLessThan(String value) {
            addCriterion("log_result <", value, "logResult");
            return (Criteria) this;
        }

        public Criteria andLogResultLessThanOrEqualTo(String value) {
            addCriterion("log_result <=", value, "logResult");
            return (Criteria) this;
        }

        public Criteria andLogResultLike(String value) {
            addCriterion("log_result like", value, "logResult");
            return (Criteria) this;
        }

        public Criteria andLogResultNotLike(String value) {
            addCriterion("log_result not like", value, "logResult");
            return (Criteria) this;
        }

        public Criteria andLogResultIn(List<String> values) {
            addCriterion("log_result in", values, "logResult");
            return (Criteria) this;
        }

        public Criteria andLogResultNotIn(List<String> values) {
            addCriterion("log_result not in", values, "logResult");
            return (Criteria) this;
        }

        public Criteria andLogResultBetween(String value1, String value2) {
            addCriterion("log_result between", value1, value2, "logResult");
            return (Criteria) this;
        }

        public Criteria andLogResultNotBetween(String value1, String value2) {
            addCriterion("log_result not between", value1, value2, "logResult");
            return (Criteria) this;
        }

        public Criteria andFkVersionIdIsNull() {
            addCriterion("fk_version_id is null");
            return (Criteria) this;
        }

        public Criteria andFkVersionIdIsNotNull() {
            addCriterion("fk_version_id is not null");
            return (Criteria) this;
        }

        public Criteria andFkVersionIdEqualTo(String value) {
            addCriterion("fk_version_id =", value, "fkVersionId");
            return (Criteria) this;
        }

        public Criteria andFkVersionIdNotEqualTo(String value) {
            addCriterion("fk_version_id <>", value, "fkVersionId");
            return (Criteria) this;
        }

        public Criteria andFkVersionIdGreaterThan(String value) {
            addCriterion("fk_version_id >", value, "fkVersionId");
            return (Criteria) this;
        }

        public Criteria andFkVersionIdGreaterThanOrEqualTo(String value) {
            addCriterion("fk_version_id >=", value, "fkVersionId");
            return (Criteria) this;
        }

        public Criteria andFkVersionIdLessThan(String value) {
            addCriterion("fk_version_id <", value, "fkVersionId");
            return (Criteria) this;
        }

        public Criteria andFkVersionIdLessThanOrEqualTo(String value) {
            addCriterion("fk_version_id <=", value, "fkVersionId");
            return (Criteria) this;
        }

        public Criteria andFkVersionIdLike(String value) {
            addCriterion("fk_version_id like", value, "fkVersionId");
            return (Criteria) this;
        }

        public Criteria andFkVersionIdNotLike(String value) {
            addCriterion("fk_version_id not like", value, "fkVersionId");
            return (Criteria) this;
        }

        public Criteria andFkVersionIdIn(List<String> values) {
            addCriterion("fk_version_id in", values, "fkVersionId");
            return (Criteria) this;
        }

        public Criteria andFkVersionIdNotIn(List<String> values) {
            addCriterion("fk_version_id not in", values, "fkVersionId");
            return (Criteria) this;
        }

        public Criteria andFkVersionIdBetween(String value1, String value2) {
            addCriterion("fk_version_id between", value1, value2, "fkVersionId");
            return (Criteria) this;
        }

        public Criteria andFkVersionIdNotBetween(String value1, String value2) {
            addCriterion("fk_version_id not between", value1, value2, "fkVersionId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ses_tool_database_source_log_property
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}