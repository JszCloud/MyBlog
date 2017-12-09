package com.titular.myblog.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DynamicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DynamicExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andDynamicIdIsNull() {
            addCriterion("dynamic_id is null");
            return (Criteria) this;
        }

        public Criteria andDynamicIdIsNotNull() {
            addCriterion("dynamic_id is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicIdEqualTo(Integer value) {
            addCriterion("dynamic_id =", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdNotEqualTo(Integer value) {
            addCriterion("dynamic_id <>", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdGreaterThan(Integer value) {
            addCriterion("dynamic_id >", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dynamic_id >=", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdLessThan(Integer value) {
            addCriterion("dynamic_id <", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdLessThanOrEqualTo(Integer value) {
            addCriterion("dynamic_id <=", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdIn(List<Integer> values) {
            addCriterion("dynamic_id in", values, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdNotIn(List<Integer> values) {
            addCriterion("dynamic_id not in", values, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdBetween(Integer value1, Integer value2) {
            addCriterion("dynamic_id between", value1, value2, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dynamic_id not between", value1, value2, "dynamicId");
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

        public Criteria andDynamicTimeIsNull() {
            addCriterion("dynamic_time is null");
            return (Criteria) this;
        }

        public Criteria andDynamicTimeIsNotNull() {
            addCriterion("dynamic_time is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicTimeEqualTo(Date value) {
            addCriterion("dynamic_time =", value, "dynamicTime");
            return (Criteria) this;
        }

        public Criteria andDynamicTimeNotEqualTo(Date value) {
            addCriterion("dynamic_time <>", value, "dynamicTime");
            return (Criteria) this;
        }

        public Criteria andDynamicTimeGreaterThan(Date value) {
            addCriterion("dynamic_time >", value, "dynamicTime");
            return (Criteria) this;
        }

        public Criteria andDynamicTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dynamic_time >=", value, "dynamicTime");
            return (Criteria) this;
        }

        public Criteria andDynamicTimeLessThan(Date value) {
            addCriterion("dynamic_time <", value, "dynamicTime");
            return (Criteria) this;
        }

        public Criteria andDynamicTimeLessThanOrEqualTo(Date value) {
            addCriterion("dynamic_time <=", value, "dynamicTime");
            return (Criteria) this;
        }

        public Criteria andDynamicTimeIn(List<Date> values) {
            addCriterion("dynamic_time in", values, "dynamicTime");
            return (Criteria) this;
        }

        public Criteria andDynamicTimeNotIn(List<Date> values) {
            addCriterion("dynamic_time not in", values, "dynamicTime");
            return (Criteria) this;
        }

        public Criteria andDynamicTimeBetween(Date value1, Date value2) {
            addCriterion("dynamic_time between", value1, value2, "dynamicTime");
            return (Criteria) this;
        }

        public Criteria andDynamicTimeNotBetween(Date value1, Date value2) {
            addCriterion("dynamic_time not between", value1, value2, "dynamicTime");
            return (Criteria) this;
        }

        public Criteria andDynamicIpIsNull() {
            addCriterion("dynamic_ip is null");
            return (Criteria) this;
        }

        public Criteria andDynamicIpIsNotNull() {
            addCriterion("dynamic_ip is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicIpEqualTo(String value) {
            addCriterion("dynamic_ip =", value, "dynamicIp");
            return (Criteria) this;
        }

        public Criteria andDynamicIpNotEqualTo(String value) {
            addCriterion("dynamic_ip <>", value, "dynamicIp");
            return (Criteria) this;
        }

        public Criteria andDynamicIpGreaterThan(String value) {
            addCriterion("dynamic_ip >", value, "dynamicIp");
            return (Criteria) this;
        }

        public Criteria andDynamicIpGreaterThanOrEqualTo(String value) {
            addCriterion("dynamic_ip >=", value, "dynamicIp");
            return (Criteria) this;
        }

        public Criteria andDynamicIpLessThan(String value) {
            addCriterion("dynamic_ip <", value, "dynamicIp");
            return (Criteria) this;
        }

        public Criteria andDynamicIpLessThanOrEqualTo(String value) {
            addCriterion("dynamic_ip <=", value, "dynamicIp");
            return (Criteria) this;
        }

        public Criteria andDynamicIpLike(String value) {
            addCriterion("dynamic_ip like", value, "dynamicIp");
            return (Criteria) this;
        }

        public Criteria andDynamicIpNotLike(String value) {
            addCriterion("dynamic_ip not like", value, "dynamicIp");
            return (Criteria) this;
        }

        public Criteria andDynamicIpIn(List<String> values) {
            addCriterion("dynamic_ip in", values, "dynamicIp");
            return (Criteria) this;
        }

        public Criteria andDynamicIpNotIn(List<String> values) {
            addCriterion("dynamic_ip not in", values, "dynamicIp");
            return (Criteria) this;
        }

        public Criteria andDynamicIpBetween(String value1, String value2) {
            addCriterion("dynamic_ip between", value1, value2, "dynamicIp");
            return (Criteria) this;
        }

        public Criteria andDynamicIpNotBetween(String value1, String value2) {
            addCriterion("dynamic_ip not between", value1, value2, "dynamicIp");
            return (Criteria) this;
        }

        public Criteria andDynamicContentIsNull() {
            addCriterion("dynamic_content is null");
            return (Criteria) this;
        }

        public Criteria andDynamicContentIsNotNull() {
            addCriterion("dynamic_content is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicContentEqualTo(String value) {
            addCriterion("dynamic_content =", value, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentNotEqualTo(String value) {
            addCriterion("dynamic_content <>", value, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentGreaterThan(String value) {
            addCriterion("dynamic_content >", value, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentGreaterThanOrEqualTo(String value) {
            addCriterion("dynamic_content >=", value, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentLessThan(String value) {
            addCriterion("dynamic_content <", value, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentLessThanOrEqualTo(String value) {
            addCriterion("dynamic_content <=", value, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentLike(String value) {
            addCriterion("dynamic_content like", value, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentNotLike(String value) {
            addCriterion("dynamic_content not like", value, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentIn(List<String> values) {
            addCriterion("dynamic_content in", values, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentNotIn(List<String> values) {
            addCriterion("dynamic_content not in", values, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentBetween(String value1, String value2) {
            addCriterion("dynamic_content between", value1, value2, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentNotBetween(String value1, String value2) {
            addCriterion("dynamic_content not between", value1, value2, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Byte value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Byte value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Byte value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Byte value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Byte value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Byte> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Byte> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Byte value1, Byte value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Byte value1, Byte value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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