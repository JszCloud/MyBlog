package com.titular.myblog.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andMessageIdIsNull() {
            addCriterion("message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(Short value) {
            addCriterion("message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(Short value) {
            addCriterion("message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(Short value) {
            addCriterion("message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(Short value) {
            addCriterion("message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(Short value) {
            addCriterion("message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(Short value) {
            addCriterion("message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<Short> values) {
            addCriterion("message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<Short> values) {
            addCriterion("message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(Short value1, Short value2) {
            addCriterion("message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(Short value1, Short value2) {
            addCriterion("message_id not between", value1, value2, "messageId");
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

        public Criteria andMessageUserIdIsNull() {
            addCriterion("message_user_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdIsNotNull() {
            addCriterion("message_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdEqualTo(Integer value) {
            addCriterion("message_user_id =", value, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdNotEqualTo(Integer value) {
            addCriterion("message_user_id <>", value, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdGreaterThan(Integer value) {
            addCriterion("message_user_id >", value, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_user_id >=", value, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdLessThan(Integer value) {
            addCriterion("message_user_id <", value, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("message_user_id <=", value, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdIn(List<Integer> values) {
            addCriterion("message_user_id in", values, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdNotIn(List<Integer> values) {
            addCriterion("message_user_id not in", values, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdBetween(Integer value1, Integer value2) {
            addCriterion("message_user_id between", value1, value2, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("message_user_id not between", value1, value2, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageStayTimeIsNull() {
            addCriterion("message_stay_time is null");
            return (Criteria) this;
        }

        public Criteria andMessageStayTimeIsNotNull() {
            addCriterion("message_stay_time is not null");
            return (Criteria) this;
        }

        public Criteria andMessageStayTimeEqualTo(Date value) {
            addCriterion("message_stay_time =", value, "messageStayTime");
            return (Criteria) this;
        }

        public Criteria andMessageStayTimeNotEqualTo(Date value) {
            addCriterion("message_stay_time <>", value, "messageStayTime");
            return (Criteria) this;
        }

        public Criteria andMessageStayTimeGreaterThan(Date value) {
            addCriterion("message_stay_time >", value, "messageStayTime");
            return (Criteria) this;
        }

        public Criteria andMessageStayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("message_stay_time >=", value, "messageStayTime");
            return (Criteria) this;
        }

        public Criteria andMessageStayTimeLessThan(Date value) {
            addCriterion("message_stay_time <", value, "messageStayTime");
            return (Criteria) this;
        }

        public Criteria andMessageStayTimeLessThanOrEqualTo(Date value) {
            addCriterion("message_stay_time <=", value, "messageStayTime");
            return (Criteria) this;
        }

        public Criteria andMessageStayTimeIn(List<Date> values) {
            addCriterion("message_stay_time in", values, "messageStayTime");
            return (Criteria) this;
        }

        public Criteria andMessageStayTimeNotIn(List<Date> values) {
            addCriterion("message_stay_time not in", values, "messageStayTime");
            return (Criteria) this;
        }

        public Criteria andMessageStayTimeBetween(Date value1, Date value2) {
            addCriterion("message_stay_time between", value1, value2, "messageStayTime");
            return (Criteria) this;
        }

        public Criteria andMessageStayTimeNotBetween(Date value1, Date value2) {
            addCriterion("message_stay_time not between", value1, value2, "messageStayTime");
            return (Criteria) this;
        }

        public Criteria andMessageUserIpIsNull() {
            addCriterion("message_user_ip is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserIpIsNotNull() {
            addCriterion("message_user_ip is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserIpEqualTo(String value) {
            addCriterion("message_user_ip =", value, "messageUserIp");
            return (Criteria) this;
        }

        public Criteria andMessageUserIpNotEqualTo(String value) {
            addCriterion("message_user_ip <>", value, "messageUserIp");
            return (Criteria) this;
        }

        public Criteria andMessageUserIpGreaterThan(String value) {
            addCriterion("message_user_ip >", value, "messageUserIp");
            return (Criteria) this;
        }

        public Criteria andMessageUserIpGreaterThanOrEqualTo(String value) {
            addCriterion("message_user_ip >=", value, "messageUserIp");
            return (Criteria) this;
        }

        public Criteria andMessageUserIpLessThan(String value) {
            addCriterion("message_user_ip <", value, "messageUserIp");
            return (Criteria) this;
        }

        public Criteria andMessageUserIpLessThanOrEqualTo(String value) {
            addCriterion("message_user_ip <=", value, "messageUserIp");
            return (Criteria) this;
        }

        public Criteria andMessageUserIpLike(String value) {
            addCriterion("message_user_ip like", value, "messageUserIp");
            return (Criteria) this;
        }

        public Criteria andMessageUserIpNotLike(String value) {
            addCriterion("message_user_ip not like", value, "messageUserIp");
            return (Criteria) this;
        }

        public Criteria andMessageUserIpIn(List<String> values) {
            addCriterion("message_user_ip in", values, "messageUserIp");
            return (Criteria) this;
        }

        public Criteria andMessageUserIpNotIn(List<String> values) {
            addCriterion("message_user_ip not in", values, "messageUserIp");
            return (Criteria) this;
        }

        public Criteria andMessageUserIpBetween(String value1, String value2) {
            addCriterion("message_user_ip between", value1, value2, "messageUserIp");
            return (Criteria) this;
        }

        public Criteria andMessageUserIpNotBetween(String value1, String value2) {
            addCriterion("message_user_ip not between", value1, value2, "messageUserIp");
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