package com.goldwind.mxm.goplus.tool.databasecompare.model;

import java.util.ArrayList;
import java.util.List;

public class SesToolDatabaseJobNodeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ses_tool_database_job_node
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ses_tool_database_job_node
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ses_tool_database_job_node
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_job_node
     *
     * @mbggenerated
     */
    public SesToolDatabaseJobNodeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_job_node
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_job_node
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_job_node
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_job_node
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_job_node
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_job_node
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_job_node
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
     * This method corresponds to the database table ses_tool_database_job_node
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
     * This method corresponds to the database table ses_tool_database_job_node
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ses_tool_database_job_node
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
     * This class corresponds to the database table ses_tool_database_job_node
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

        public Criteria andNodeNameIsNull() {
            addCriterion("node_name is null");
            return (Criteria) this;
        }

        public Criteria andNodeNameIsNotNull() {
            addCriterion("node_name is not null");
            return (Criteria) this;
        }

        public Criteria andNodeNameEqualTo(String value) {
            addCriterion("node_name =", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotEqualTo(String value) {
            addCriterion("node_name <>", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameGreaterThan(String value) {
            addCriterion("node_name >", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("node_name >=", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameLessThan(String value) {
            addCriterion("node_name <", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameLessThanOrEqualTo(String value) {
            addCriterion("node_name <=", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameLike(String value) {
            addCriterion("node_name like", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotLike(String value) {
            addCriterion("node_name not like", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameIn(List<String> values) {
            addCriterion("node_name in", values, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotIn(List<String> values) {
            addCriterion("node_name not in", values, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameBetween(String value1, String value2) {
            addCriterion("node_name between", value1, value2, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotBetween(String value1, String value2) {
            addCriterion("node_name not between", value1, value2, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIsNull() {
            addCriterion("node_type is null");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIsNotNull() {
            addCriterion("node_type is not null");
            return (Criteria) this;
        }

        public Criteria andNodeTypeEqualTo(Integer value) {
            addCriterion("node_type =", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeNotEqualTo(Integer value) {
            addCriterion("node_type <>", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeGreaterThan(Integer value) {
            addCriterion("node_type >", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("node_type >=", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeLessThan(Integer value) {
            addCriterion("node_type <", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("node_type <=", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIn(List<Integer> values) {
            addCriterion("node_type in", values, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeNotIn(List<Integer> values) {
            addCriterion("node_type not in", values, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeBetween(Integer value1, Integer value2) {
            addCriterion("node_type between", value1, value2, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("node_type not between", value1, value2, "nodeType");
            return (Criteria) this;
        }

        public Criteria andDatasetIsNull() {
            addCriterion("dataset is null");
            return (Criteria) this;
        }

        public Criteria andDatasetIsNotNull() {
            addCriterion("dataset is not null");
            return (Criteria) this;
        }

        public Criteria andDatasetEqualTo(String value) {
            addCriterion("dataset =", value, "dataset");
            return (Criteria) this;
        }

        public Criteria andDatasetNotEqualTo(String value) {
            addCriterion("dataset <>", value, "dataset");
            return (Criteria) this;
        }

        public Criteria andDatasetGreaterThan(String value) {
            addCriterion("dataset >", value, "dataset");
            return (Criteria) this;
        }

        public Criteria andDatasetGreaterThanOrEqualTo(String value) {
            addCriterion("dataset >=", value, "dataset");
            return (Criteria) this;
        }

        public Criteria andDatasetLessThan(String value) {
            addCriterion("dataset <", value, "dataset");
            return (Criteria) this;
        }

        public Criteria andDatasetLessThanOrEqualTo(String value) {
            addCriterion("dataset <=", value, "dataset");
            return (Criteria) this;
        }

        public Criteria andDatasetLike(String value) {
            addCriterion("dataset like", value, "dataset");
            return (Criteria) this;
        }

        public Criteria andDatasetNotLike(String value) {
            addCriterion("dataset not like", value, "dataset");
            return (Criteria) this;
        }

        public Criteria andDatasetIn(List<String> values) {
            addCriterion("dataset in", values, "dataset");
            return (Criteria) this;
        }

        public Criteria andDatasetNotIn(List<String> values) {
            addCriterion("dataset not in", values, "dataset");
            return (Criteria) this;
        }

        public Criteria andDatasetBetween(String value1, String value2) {
            addCriterion("dataset between", value1, value2, "dataset");
            return (Criteria) this;
        }

        public Criteria andDatasetNotBetween(String value1, String value2) {
            addCriterion("dataset not between", value1, value2, "dataset");
            return (Criteria) this;
        }

        public Criteria andPkeyIsNull() {
            addCriterion("pkey is null");
            return (Criteria) this;
        }

        public Criteria andPkeyIsNotNull() {
            addCriterion("pkey is not null");
            return (Criteria) this;
        }

        public Criteria andPkeyEqualTo(String value) {
            addCriterion("pkey =", value, "pkey");
            return (Criteria) this;
        }

        public Criteria andPkeyNotEqualTo(String value) {
            addCriterion("pkey <>", value, "pkey");
            return (Criteria) this;
        }

        public Criteria andPkeyGreaterThan(String value) {
            addCriterion("pkey >", value, "pkey");
            return (Criteria) this;
        }

        public Criteria andPkeyGreaterThanOrEqualTo(String value) {
            addCriterion("pkey >=", value, "pkey");
            return (Criteria) this;
        }

        public Criteria andPkeyLessThan(String value) {
            addCriterion("pkey <", value, "pkey");
            return (Criteria) this;
        }

        public Criteria andPkeyLessThanOrEqualTo(String value) {
            addCriterion("pkey <=", value, "pkey");
            return (Criteria) this;
        }

        public Criteria andPkeyLike(String value) {
            addCriterion("pkey like", value, "pkey");
            return (Criteria) this;
        }

        public Criteria andPkeyNotLike(String value) {
            addCriterion("pkey not like", value, "pkey");
            return (Criteria) this;
        }

        public Criteria andPkeyIn(List<String> values) {
            addCriterion("pkey in", values, "pkey");
            return (Criteria) this;
        }

        public Criteria andPkeyNotIn(List<String> values) {
            addCriterion("pkey not in", values, "pkey");
            return (Criteria) this;
        }

        public Criteria andPkeyBetween(String value1, String value2) {
            addCriterion("pkey between", value1, value2, "pkey");
            return (Criteria) this;
        }

        public Criteria andPkeyNotBetween(String value1, String value2) {
            addCriterion("pkey not between", value1, value2, "pkey");
            return (Criteria) this;
        }

        public Criteria andIshaveIsNull() {
            addCriterion("ishave is null");
            return (Criteria) this;
        }

        public Criteria andIshaveIsNotNull() {
            addCriterion("ishave is not null");
            return (Criteria) this;
        }

        public Criteria andIshaveEqualTo(Integer value) {
            addCriterion("ishave =", value, "ishave");
            return (Criteria) this;
        }

        public Criteria andIshaveNotEqualTo(Integer value) {
            addCriterion("ishave <>", value, "ishave");
            return (Criteria) this;
        }

        public Criteria andIshaveGreaterThan(Integer value) {
            addCriterion("ishave >", value, "ishave");
            return (Criteria) this;
        }

        public Criteria andIshaveGreaterThanOrEqualTo(Integer value) {
            addCriterion("ishave >=", value, "ishave");
            return (Criteria) this;
        }

        public Criteria andIshaveLessThan(Integer value) {
            addCriterion("ishave <", value, "ishave");
            return (Criteria) this;
        }

        public Criteria andIshaveLessThanOrEqualTo(Integer value) {
            addCriterion("ishave <=", value, "ishave");
            return (Criteria) this;
        }

        public Criteria andIshaveIn(List<Integer> values) {
            addCriterion("ishave in", values, "ishave");
            return (Criteria) this;
        }

        public Criteria andIshaveNotIn(List<Integer> values) {
            addCriterion("ishave not in", values, "ishave");
            return (Criteria) this;
        }

        public Criteria andIshaveBetween(Integer value1, Integer value2) {
            addCriterion("ishave between", value1, value2, "ishave");
            return (Criteria) this;
        }

        public Criteria andIshaveNotBetween(Integer value1, Integer value2) {
            addCriterion("ishave not between", value1, value2, "ishave");
            return (Criteria) this;
        }

        public Criteria andNodeIndexIsNull() {
            addCriterion("node_index is null");
            return (Criteria) this;
        }

        public Criteria andNodeIndexIsNotNull() {
            addCriterion("node_index is not null");
            return (Criteria) this;
        }

        public Criteria andNodeIndexEqualTo(Integer value) {
            addCriterion("node_index =", value, "nodeIndex");
            return (Criteria) this;
        }

        public Criteria andNodeIndexNotEqualTo(Integer value) {
            addCriterion("node_index <>", value, "nodeIndex");
            return (Criteria) this;
        }

        public Criteria andNodeIndexGreaterThan(Integer value) {
            addCriterion("node_index >", value, "nodeIndex");
            return (Criteria) this;
        }

        public Criteria andNodeIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("node_index >=", value, "nodeIndex");
            return (Criteria) this;
        }

        public Criteria andNodeIndexLessThan(Integer value) {
            addCriterion("node_index <", value, "nodeIndex");
            return (Criteria) this;
        }

        public Criteria andNodeIndexLessThanOrEqualTo(Integer value) {
            addCriterion("node_index <=", value, "nodeIndex");
            return (Criteria) this;
        }

        public Criteria andNodeIndexIn(List<Integer> values) {
            addCriterion("node_index in", values, "nodeIndex");
            return (Criteria) this;
        }

        public Criteria andNodeIndexNotIn(List<Integer> values) {
            addCriterion("node_index not in", values, "nodeIndex");
            return (Criteria) this;
        }

        public Criteria andNodeIndexBetween(Integer value1, Integer value2) {
            addCriterion("node_index between", value1, value2, "nodeIndex");
            return (Criteria) this;
        }

        public Criteria andNodeIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("node_index not between", value1, value2, "nodeIndex");
            return (Criteria) this;
        }

        public Criteria andExpirydateIsNull() {
            addCriterion("expirydate is null");
            return (Criteria) this;
        }

        public Criteria andExpirydateIsNotNull() {
            addCriterion("expirydate is not null");
            return (Criteria) this;
        }

        public Criteria andExpirydateEqualTo(Integer value) {
            addCriterion("expirydate =", value, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateNotEqualTo(Integer value) {
            addCriterion("expirydate <>", value, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateGreaterThan(Integer value) {
            addCriterion("expirydate >", value, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateGreaterThanOrEqualTo(Integer value) {
            addCriterion("expirydate >=", value, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateLessThan(Integer value) {
            addCriterion("expirydate <", value, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateLessThanOrEqualTo(Integer value) {
            addCriterion("expirydate <=", value, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateIn(List<Integer> values) {
            addCriterion("expirydate in", values, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateNotIn(List<Integer> values) {
            addCriterion("expirydate not in", values, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateBetween(Integer value1, Integer value2) {
            addCriterion("expirydate between", value1, value2, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateNotBetween(Integer value1, Integer value2) {
            addCriterion("expirydate not between", value1, value2, "expirydate");
            return (Criteria) this;
        }

        public Criteria andRecordCountIsNull() {
            addCriterion("record_count is null");
            return (Criteria) this;
        }

        public Criteria andRecordCountIsNotNull() {
            addCriterion("record_count is not null");
            return (Criteria) this;
        }

        public Criteria andRecordCountEqualTo(Integer value) {
            addCriterion("record_count =", value, "recordCount");
            return (Criteria) this;
        }

        public Criteria andRecordCountNotEqualTo(Integer value) {
            addCriterion("record_count <>", value, "recordCount");
            return (Criteria) this;
        }

        public Criteria andRecordCountGreaterThan(Integer value) {
            addCriterion("record_count >", value, "recordCount");
            return (Criteria) this;
        }

        public Criteria andRecordCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_count >=", value, "recordCount");
            return (Criteria) this;
        }

        public Criteria andRecordCountLessThan(Integer value) {
            addCriterion("record_count <", value, "recordCount");
            return (Criteria) this;
        }

        public Criteria andRecordCountLessThanOrEqualTo(Integer value) {
            addCriterion("record_count <=", value, "recordCount");
            return (Criteria) this;
        }

        public Criteria andRecordCountIn(List<Integer> values) {
            addCriterion("record_count in", values, "recordCount");
            return (Criteria) this;
        }

        public Criteria andRecordCountNotIn(List<Integer> values) {
            addCriterion("record_count not in", values, "recordCount");
            return (Criteria) this;
        }

        public Criteria andRecordCountBetween(Integer value1, Integer value2) {
            addCriterion("record_count between", value1, value2, "recordCount");
            return (Criteria) this;
        }

        public Criteria andRecordCountNotBetween(Integer value1, Integer value2) {
            addCriterion("record_count not between", value1, value2, "recordCount");
            return (Criteria) this;
        }

        public Criteria andCompareIsNull() {
            addCriterion("compare is null");
            return (Criteria) this;
        }

        public Criteria andCompareIsNotNull() {
            addCriterion("compare is not null");
            return (Criteria) this;
        }

        public Criteria andCompareEqualTo(String value) {
            addCriterion("compare =", value, "compare");
            return (Criteria) this;
        }

        public Criteria andCompareNotEqualTo(String value) {
            addCriterion("compare <>", value, "compare");
            return (Criteria) this;
        }

        public Criteria andCompareGreaterThan(String value) {
            addCriterion("compare >", value, "compare");
            return (Criteria) this;
        }

        public Criteria andCompareGreaterThanOrEqualTo(String value) {
            addCriterion("compare >=", value, "compare");
            return (Criteria) this;
        }

        public Criteria andCompareLessThan(String value) {
            addCriterion("compare <", value, "compare");
            return (Criteria) this;
        }

        public Criteria andCompareLessThanOrEqualTo(String value) {
            addCriterion("compare <=", value, "compare");
            return (Criteria) this;
        }

        public Criteria andCompareLike(String value) {
            addCriterion("compare like", value, "compare");
            return (Criteria) this;
        }

        public Criteria andCompareNotLike(String value) {
            addCriterion("compare not like", value, "compare");
            return (Criteria) this;
        }

        public Criteria andCompareIn(List<String> values) {
            addCriterion("compare in", values, "compare");
            return (Criteria) this;
        }

        public Criteria andCompareNotIn(List<String> values) {
            addCriterion("compare not in", values, "compare");
            return (Criteria) this;
        }

        public Criteria andCompareBetween(String value1, String value2) {
            addCriterion("compare between", value1, value2, "compare");
            return (Criteria) this;
        }

        public Criteria andCompareNotBetween(String value1, String value2) {
            addCriterion("compare not between", value1, value2, "compare");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ses_tool_database_job_node
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
     * This class corresponds to the database table ses_tool_database_job_node
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