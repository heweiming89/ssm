package cn.heweiming.ssm.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OperationLogExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 16:56:17 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 16:56:17 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 16:56:17 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 16:56:17 CST 2017
     */
    public OperationLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 16:56:17 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 16:56:17 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 16:56:17 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 16:56:17 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 16:56:17 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 16:56:17 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 16:56:17 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 16:56:17 CST 2017
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
     * This method corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 16:56:17 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 16:56:17 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 16:56:17 CST 2017
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNull() {
            addCriterion("operation_type is null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNotNull() {
            addCriterion("operation_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeEqualTo(String value) {
            addCriterion("operation_type =", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotEqualTo(String value) {
            addCriterion("operation_type <>", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThan(String value) {
            addCriterion("operation_type >", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("operation_type >=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThan(String value) {
            addCriterion("operation_type <", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThanOrEqualTo(String value) {
            addCriterion("operation_type <=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLike(String value) {
            addCriterion("operation_type like", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotLike(String value) {
            addCriterion("operation_type not like", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIn(List<String> values) {
            addCriterion("operation_type in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotIn(List<String> values) {
            addCriterion("operation_type not in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeBetween(String value1, String value2) {
            addCriterion("operation_type between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotBetween(String value1, String value2) {
            addCriterion("operation_type not between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationModuleIsNull() {
            addCriterion("operation_module is null");
            return (Criteria) this;
        }

        public Criteria andOperationModuleIsNotNull() {
            addCriterion("operation_module is not null");
            return (Criteria) this;
        }

        public Criteria andOperationModuleEqualTo(String value) {
            addCriterion("operation_module =", value, "operationModule");
            return (Criteria) this;
        }

        public Criteria andOperationModuleNotEqualTo(String value) {
            addCriterion("operation_module <>", value, "operationModule");
            return (Criteria) this;
        }

        public Criteria andOperationModuleGreaterThan(String value) {
            addCriterion("operation_module >", value, "operationModule");
            return (Criteria) this;
        }

        public Criteria andOperationModuleGreaterThanOrEqualTo(String value) {
            addCriterion("operation_module >=", value, "operationModule");
            return (Criteria) this;
        }

        public Criteria andOperationModuleLessThan(String value) {
            addCriterion("operation_module <", value, "operationModule");
            return (Criteria) this;
        }

        public Criteria andOperationModuleLessThanOrEqualTo(String value) {
            addCriterion("operation_module <=", value, "operationModule");
            return (Criteria) this;
        }

        public Criteria andOperationModuleLike(String value) {
            addCriterion("operation_module like", value, "operationModule");
            return (Criteria) this;
        }

        public Criteria andOperationModuleNotLike(String value) {
            addCriterion("operation_module not like", value, "operationModule");
            return (Criteria) this;
        }

        public Criteria andOperationModuleIn(List<String> values) {
            addCriterion("operation_module in", values, "operationModule");
            return (Criteria) this;
        }

        public Criteria andOperationModuleNotIn(List<String> values) {
            addCriterion("operation_module not in", values, "operationModule");
            return (Criteria) this;
        }

        public Criteria andOperationModuleBetween(String value1, String value2) {
            addCriterion("operation_module between", value1, value2, "operationModule");
            return (Criteria) this;
        }

        public Criteria andOperationModuleNotBetween(String value1, String value2) {
            addCriterion("operation_module not between", value1, value2, "operationModule");
            return (Criteria) this;
        }

        public Criteria andOperationContentIsNull() {
            addCriterion("operation_content is null");
            return (Criteria) this;
        }

        public Criteria andOperationContentIsNotNull() {
            addCriterion("operation_content is not null");
            return (Criteria) this;
        }

        public Criteria andOperationContentEqualTo(String value) {
            addCriterion("operation_content =", value, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentNotEqualTo(String value) {
            addCriterion("operation_content <>", value, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentGreaterThan(String value) {
            addCriterion("operation_content >", value, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentGreaterThanOrEqualTo(String value) {
            addCriterion("operation_content >=", value, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentLessThan(String value) {
            addCriterion("operation_content <", value, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentLessThanOrEqualTo(String value) {
            addCriterion("operation_content <=", value, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentLike(String value) {
            addCriterion("operation_content like", value, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentNotLike(String value) {
            addCriterion("operation_content not like", value, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentIn(List<String> values) {
            addCriterion("operation_content in", values, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentNotIn(List<String> values) {
            addCriterion("operation_content not in", values, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentBetween(String value1, String value2) {
            addCriterion("operation_content between", value1, value2, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentNotBetween(String value1, String value2) {
            addCriterion("operation_content not between", value1, value2, "operationContent");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIsNull() {
            addCriterion("operation_time is null");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIsNotNull() {
            addCriterion("operation_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTimeEqualTo(LocalDateTime value) {
            addCriterion("operation_time =", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotEqualTo(LocalDateTime value) {
            addCriterion("operation_time <>", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeGreaterThan(LocalDateTime value) {
            addCriterion("operation_time >", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("operation_time >=", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeLessThan(LocalDateTime value) {
            addCriterion("operation_time <", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("operation_time <=", value, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeIn(List<LocalDateTime> values) {
            addCriterion("operation_time in", values, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotIn(List<LocalDateTime> values) {
            addCriterion("operation_time not in", values, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("operation_time between", value1, value2, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("operation_time not between", value1, value2, "operationTime");
            return (Criteria) this;
        }

        public Criteria andOperationIpIsNull() {
            addCriterion("operation_ip is null");
            return (Criteria) this;
        }

        public Criteria andOperationIpIsNotNull() {
            addCriterion("operation_ip is not null");
            return (Criteria) this;
        }

        public Criteria andOperationIpEqualTo(String value) {
            addCriterion("operation_ip =", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpNotEqualTo(String value) {
            addCriterion("operation_ip <>", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpGreaterThan(String value) {
            addCriterion("operation_ip >", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpGreaterThanOrEqualTo(String value) {
            addCriterion("operation_ip >=", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpLessThan(String value) {
            addCriterion("operation_ip <", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpLessThanOrEqualTo(String value) {
            addCriterion("operation_ip <=", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpLike(String value) {
            addCriterion("operation_ip like", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpNotLike(String value) {
            addCriterion("operation_ip not like", value, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpIn(List<String> values) {
            addCriterion("operation_ip in", values, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpNotIn(List<String> values) {
            addCriterion("operation_ip not in", values, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpBetween(String value1, String value2) {
            addCriterion("operation_ip between", value1, value2, "operationIp");
            return (Criteria) this;
        }

        public Criteria andOperationIpNotBetween(String value1, String value2) {
            addCriterion("operation_ip not between", value1, value2, "operationIp");
            return (Criteria) this;
        }

        public Criteria andActivatedIsNull() {
            addCriterion("activated is null");
            return (Criteria) this;
        }

        public Criteria andActivatedIsNotNull() {
            addCriterion("activated is not null");
            return (Criteria) this;
        }

        public Criteria andActivatedEqualTo(Boolean value) {
            addCriterion("activated =", value, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedNotEqualTo(Boolean value) {
            addCriterion("activated <>", value, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedGreaterThan(Boolean value) {
            addCriterion("activated >", value, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("activated >=", value, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedLessThan(Boolean value) {
            addCriterion("activated <", value, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedLessThanOrEqualTo(Boolean value) {
            addCriterion("activated <=", value, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedIn(List<Boolean> values) {
            addCriterion("activated in", values, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedNotIn(List<Boolean> values) {
            addCriterion("activated not in", values, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedBetween(Boolean value1, Boolean value2) {
            addCriterion("activated between", value1, value2, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("activated not between", value1, value2, "activated");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("created_date is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("created_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(LocalDateTime value) {
            addCriterion("created_date =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(LocalDateTime value) {
            addCriterion("created_date <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(LocalDateTime value) {
            addCriterion("created_date >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("created_date >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(LocalDateTime value) {
            addCriterion("created_date <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("created_date <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<LocalDateTime> values) {
            addCriterion("created_date in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<LocalDateTime> values) {
            addCriterion("created_date not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("created_date between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("created_date not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByIsNull() {
            addCriterion("last_modified_by is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByIsNotNull() {
            addCriterion("last_modified_by is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByEqualTo(String value) {
            addCriterion("last_modified_by =", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByNotEqualTo(String value) {
            addCriterion("last_modified_by <>", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByGreaterThan(String value) {
            addCriterion("last_modified_by >", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByGreaterThanOrEqualTo(String value) {
            addCriterion("last_modified_by >=", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByLessThan(String value) {
            addCriterion("last_modified_by <", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByLessThanOrEqualTo(String value) {
            addCriterion("last_modified_by <=", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByLike(String value) {
            addCriterion("last_modified_by like", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByNotLike(String value) {
            addCriterion("last_modified_by not like", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByIn(List<String> values) {
            addCriterion("last_modified_by in", values, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByNotIn(List<String> values) {
            addCriterion("last_modified_by not in", values, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByBetween(String value1, String value2) {
            addCriterion("last_modified_by between", value1, value2, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByNotBetween(String value1, String value2) {
            addCriterion("last_modified_by not between", value1, value2, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateIsNull() {
            addCriterion("last_modified_date is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateIsNotNull() {
            addCriterion("last_modified_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateEqualTo(LocalDateTime value) {
            addCriterion("last_modified_date =", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotEqualTo(LocalDateTime value) {
            addCriterion("last_modified_date <>", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateGreaterThan(LocalDateTime value) {
            addCriterion("last_modified_date >", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("last_modified_date >=", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateLessThan(LocalDateTime value) {
            addCriterion("last_modified_date <", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("last_modified_date <=", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateIn(List<LocalDateTime> values) {
            addCriterion("last_modified_date in", values, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotIn(List<LocalDateTime> values) {
            addCriterion("last_modified_date not in", values, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("last_modified_date between", value1, value2, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("last_modified_date not between", value1, value2, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_operation_log
     *
     * @mbg.generated do_not_delete_during_merge Sat Sep 23 16:56:17 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_operation_log
     *
     * @mbg.generated Sat Sep 23 16:56:17 CST 2017
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