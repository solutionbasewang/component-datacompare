package com.goldwind.mxm.goplus.tool.databasecompare.model;

import java.util.ArrayList;
import java.util.List;

public class SesToolDatabaseJobPropertyruleExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ses_tool_database_job_propertyrule
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ses_tool_database_job_propertyrule
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ses_tool_database_job_propertyrule
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_job_propertyrule
     *
     * @mbggenerated
     */
    public SesToolDatabaseJobPropertyruleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_job_propertyrule
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_job_propertyrule
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_job_propertyrule
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_job_propertyrule
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_job_propertyrule
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_job_propertyrule
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_job_propertyrule
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
     * This method corresponds to the database table ses_tool_database_job_propertyrule
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
     * This method corresponds to the database table ses_tool_database_job_propertyrule
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_job_propertyrule
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
     * This class corresponds to the database table ses_tool_database_job_propertyrule
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

        public Criteria andPropertyNameIsNull() {
            addCriterion("property_name is null");
            return (Criteria) this;
        }

        public Criteria andPropertyNameIsNotNull() {
            addCriterion("property_name is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyNameEqualTo(String value) {
            addCriterion("property_name =", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameNotEqualTo(String value) {
            addCriterion("property_name <>", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameGreaterThan(String value) {
            addCriterion("property_name >", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameGreaterThanOrEqualTo(String value) {
            addCriterion("property_name >=", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameLessThan(String value) {
            addCriterion("property_name <", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameLessThanOrEqualTo(String value) {
            addCriterion("property_name <=", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameLike(String value) {
            addCriterion("property_name like", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameNotLike(String value) {
            addCriterion("property_name not like", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameIn(List<String> values) {
            addCriterion("property_name in", values, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameNotIn(List<String> values) {
            addCriterion("property_name not in", values, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameBetween(String value1, String value2) {
            addCriterion("property_name between", value1, value2, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameNotBetween(String value1, String value2) {
            addCriterion("property_name not between", value1, value2, "propertyName");
            return (Criteria) this;
        }

        public Criteria andIsnullIsNull() {
            addCriterion("isnull is null");
            return (Criteria) this;
        }

        public Criteria andIsnullIsNotNull() {
            addCriterion("isnull is not null");
            return (Criteria) this;
        }

        public Criteria andIsnullEqualTo(Integer value) {
            addCriterion("isnull =", value, "isnull");
            return (Criteria) this;
        }

        public Criteria andIsnullNotEqualTo(Integer value) {
            addCriterion("isnull <>", value, "isnull");
            return (Criteria) this;
        }

        public Criteria andIsnullGreaterThan(Integer value) {
            addCriterion("isnull >", value, "isnull");
            return (Criteria) this;
        }

        public Criteria andIsnullGreaterThanOrEqualTo(Integer value) {
            addCriterion("isnull >=", value, "isnull");
            return (Criteria) this;
        }

        public Criteria andIsnullLessThan(Integer value) {
            addCriterion("isnull <", value, "isnull");
            return (Criteria) this;
        }

        public Criteria andIsnullLessThanOrEqualTo(Integer value) {
            addCriterion("isnull <=", value, "isnull");
            return (Criteria) this;
        }

        public Criteria andIsnullIn(List<Integer> values) {
            addCriterion("isnull in", values, "isnull");
            return (Criteria) this;
        }

        public Criteria andIsnullNotIn(List<Integer> values) {
            addCriterion("isnull not in", values, "isnull");
            return (Criteria) this;
        }

        public Criteria andIsnullBetween(Integer value1, Integer value2) {
            addCriterion("isnull between", value1, value2, "isnull");
            return (Criteria) this;
        }

        public Criteria andIsnullNotBetween(Integer value1, Integer value2) {
            addCriterion("isnull not between", value1, value2, "isnull");
            return (Criteria) this;
        }

        public Criteria andMaxIsNull() {
            addCriterion("max is null");
            return (Criteria) this;
        }

        public Criteria andMaxIsNotNull() {
            addCriterion("max is not null");
            return (Criteria) this;
        }

        public Criteria andMaxEqualTo(Double value) {
            addCriterion("max =", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxNotEqualTo(Double value) {
            addCriterion("max <>", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxGreaterThan(Double value) {
            addCriterion("max >", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxGreaterThanOrEqualTo(Double value) {
            addCriterion("max >=", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxLessThan(Double value) {
            addCriterion("max <", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxLessThanOrEqualTo(Double value) {
            addCriterion("max <=", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxIn(List<Double> values) {
            addCriterion("max in", values, "max");
            return (Criteria) this;
        }

        public Criteria andMaxNotIn(List<Double> values) {
            addCriterion("max not in", values, "max");
            return (Criteria) this;
        }

        public Criteria andMaxBetween(Double value1, Double value2) {
            addCriterion("max between", value1, value2, "max");
            return (Criteria) this;
        }

        public Criteria andMaxNotBetween(Double value1, Double value2) {
            addCriterion("max not between", value1, value2, "max");
            return (Criteria) this;
        }

        public Criteria andMinIsNull() {
            addCriterion("min is null");
            return (Criteria) this;
        }

        public Criteria andMinIsNotNull() {
            addCriterion("min is not null");
            return (Criteria) this;
        }

        public Criteria andMinEqualTo(Double value) {
            addCriterion("min =", value, "min");
            return (Criteria) this;
        }

        public Criteria andMinNotEqualTo(Double value) {
            addCriterion("min <>", value, "min");
            return (Criteria) this;
        }

        public Criteria andMinGreaterThan(Double value) {
            addCriterion("min >", value, "min");
            return (Criteria) this;
        }

        public Criteria andMinGreaterThanOrEqualTo(Double value) {
            addCriterion("min >=", value, "min");
            return (Criteria) this;
        }

        public Criteria andMinLessThan(Double value) {
            addCriterion("min <", value, "min");
            return (Criteria) this;
        }

        public Criteria andMinLessThanOrEqualTo(Double value) {
            addCriterion("min <=", value, "min");
            return (Criteria) this;
        }

        public Criteria andMinIn(List<Double> values) {
            addCriterion("min in", values, "min");
            return (Criteria) this;
        }

        public Criteria andMinNotIn(List<Double> values) {
            addCriterion("min not in", values, "min");
            return (Criteria) this;
        }

        public Criteria andMinBetween(Double value1, Double value2) {
            addCriterion("min between", value1, value2, "min");
            return (Criteria) this;
        }

        public Criteria andMinNotBetween(Double value1, Double value2) {
            addCriterion("min not between", value1, value2, "min");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeIsNull() {
            addCriterion("property_type is null");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeIsNotNull() {
            addCriterion("property_type is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeEqualTo(String value) {
            addCriterion("property_type =", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeNotEqualTo(String value) {
            addCriterion("property_type <>", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeGreaterThan(String value) {
            addCriterion("property_type >", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("property_type >=", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeLessThan(String value) {
            addCriterion("property_type <", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeLessThanOrEqualTo(String value) {
            addCriterion("property_type <=", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeLike(String value) {
            addCriterion("property_type like", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeNotLike(String value) {
            addCriterion("property_type not like", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeIn(List<String> values) {
            addCriterion("property_type in", values, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeNotIn(List<String> values) {
            addCriterion("property_type not in", values, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeBetween(String value1, String value2) {
            addCriterion("property_type between", value1, value2, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeNotBetween(String value1, String value2) {
            addCriterion("property_type not between", value1, value2, "propertyType");
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

        public Criteria andEqualIsNull() {
            addCriterion("equal is null");
            return (Criteria) this;
        }

        public Criteria andEqualIsNotNull() {
            addCriterion("equal is not null");
            return (Criteria) this;
        }

        public Criteria andEqualEqualTo(String value) {
            addCriterion("equal =", value, "equal");
            return (Criteria) this;
        }

        public Criteria andEqualNotEqualTo(String value) {
            addCriterion("equal <>", value, "equal");
            return (Criteria) this;
        }

        public Criteria andEqualGreaterThan(String value) {
            addCriterion("equal >", value, "equal");
            return (Criteria) this;
        }

        public Criteria andEqualGreaterThanOrEqualTo(String value) {
            addCriterion("equal >=", value, "equal");
            return (Criteria) this;
        }

        public Criteria andEqualLessThan(String value) {
            addCriterion("equal <", value, "equal");
            return (Criteria) this;
        }

        public Criteria andEqualLessThanOrEqualTo(String value) {
            addCriterion("equal <=", value, "equal");
            return (Criteria) this;
        }

        public Criteria andEqualLike(String value) {
            addCriterion("equal like", value, "equal");
            return (Criteria) this;
        }

        public Criteria andEqualNotLike(String value) {
            addCriterion("equal not like", value, "equal");
            return (Criteria) this;
        }

        public Criteria andEqualIn(List<String> values) {
            addCriterion("equal in", values, "equal");
            return (Criteria) this;
        }

        public Criteria andEqualNotIn(List<String> values) {
            addCriterion("equal not in", values, "equal");
            return (Criteria) this;
        }

        public Criteria andEqualBetween(String value1, String value2) {
            addCriterion("equal between", value1, value2, "equal");
            return (Criteria) this;
        }

        public Criteria andEqualNotBetween(String value1, String value2) {
            addCriterion("equal not between", value1, value2, "equal");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ses_tool_database_job_propertyrule
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
     * This class corresponds to the database table ses_tool_database_job_propertyrule
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