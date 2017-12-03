package com.ihowq.wordpress.api.model.pojo.usermeta;

import java.util.ArrayList;
import java.util.List;

/**
 * The type User meta query.
 */
public class UserMetaQuery {
    /**
     * The Order by clause.
     */
    protected String orderByClause;

    /**
     * The Distinct.
     */
    protected boolean distinct;

    /**
     * The Ored criteria.
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     * Instantiates a new User meta query.
     */
    public UserMetaQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * Gets order by clause.
     *
     * @return the order by clause
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * Sets order by clause.
     *
     * @param orderByClause the order by clause
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * Is distinct boolean.
     *
     * @return the boolean
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * Sets distinct.
     *
     * @param distinct the distinct
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * Gets ored criteria.
     *
     * @return the ored criteria
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * Or.
     *
     * @param criteria the criteria
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * Or criteria.
     *
     * @return the criteria
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * Create criteria criteria.
     *
     * @return the criteria
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * Create criteria internal criteria.
     *
     * @return the criteria
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * Clear.
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * Gets limit.
     *
     * @return the limit
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Sets limit.
     *
     * @param limit the limit
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * Gets offset.
     *
     * @return the offset
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * Sets offset.
     *
     * @param offset the offset
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * The type Base generated criteria.
     */
    protected abstract static class BaseGeneratedCriteria {
        /**
         * The Criteria.
         */
        protected List<Criterion> criteria;

        /**
         * Instantiates a new Base generated criteria.
         */
        protected BaseGeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        /**
         * Is valid boolean.
         *
         * @return the boolean
         */
        public boolean isValid() {
            return criteria.size() > 0;
        }

        /**
         * Gets all criteria.
         *
         * @return the all criteria
         */
        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        /**
         * Gets criteria.
         *
         * @return the criteria
         */
        public List<Criterion> getCriteria() {
            return criteria;
        }

        /**
         * Add criterion.
         *
         * @param condition the condition
         */
        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        /**
         * Add criterion.
         *
         * @param condition the condition
         * @param value     the value
         * @param property  the property
         */
        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        /**
         * Add criterion.
         *
         * @param condition the condition
         * @param value1    the value 1
         * @param value2    the value 2
         * @param property  the property
         */
        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        /**
         * And umeta id is null criteria.
         *
         * @return the criteria
         */
        public Criteria andUmetaIdIsNull() {
            addCriterion("umeta_id is null");
            return (Criteria) this;
        }

        /**
         * And umeta id is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andUmetaIdIsNotNull() {
            addCriterion("umeta_id is not null");
            return (Criteria) this;
        }

        /**
         * And umeta id equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUmetaIdEqualTo(Long value) {
            addCriterion("umeta_id =", value, "umetaId");
            return (Criteria) this;
        }

        /**
         * And umeta id not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUmetaIdNotEqualTo(Long value) {
            addCriterion("umeta_id <>", value, "umetaId");
            return (Criteria) this;
        }

        /**
         * And umeta id greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUmetaIdGreaterThan(Long value) {
            addCriterion("umeta_id >", value, "umetaId");
            return (Criteria) this;
        }

        /**
         * And umeta id greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUmetaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("umeta_id >=", value, "umetaId");
            return (Criteria) this;
        }

        /**
         * And umeta id less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUmetaIdLessThan(Long value) {
            addCriterion("umeta_id <", value, "umetaId");
            return (Criteria) this;
        }

        /**
         * And umeta id less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUmetaIdLessThanOrEqualTo(Long value) {
            addCriterion("umeta_id <=", value, "umetaId");
            return (Criteria) this;
        }

        /**
         * And umeta id in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andUmetaIdIn(List<Long> values) {
            addCriterion("umeta_id in", values, "umetaId");
            return (Criteria) this;
        }

        /**
         * And umeta id not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andUmetaIdNotIn(List<Long> values) {
            addCriterion("umeta_id not in", values, "umetaId");
            return (Criteria) this;
        }

        /**
         * And umeta id between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andUmetaIdBetween(Long value1, Long value2) {
            addCriterion("umeta_id between", value1, value2, "umetaId");
            return (Criteria) this;
        }

        /**
         * And umeta id not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andUmetaIdNotBetween(Long value1, Long value2) {
            addCriterion("umeta_id not between", value1, value2, "umetaId");
            return (Criteria) this;
        }

        /**
         * And user id is null criteria.
         *
         * @return the criteria
         */
        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        /**
         * And user id is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        /**
         * And user id equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        /**
         * And user id not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        /**
         * And user id greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        /**
         * And user id greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        /**
         * And user id less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        /**
         * And user id less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        /**
         * And user id in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        /**
         * And user id not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        /**
         * And user id between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        /**
         * And user id not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        /**
         * And meta key is null criteria.
         *
         * @return the criteria
         */
        public Criteria andMetaKeyIsNull() {
            addCriterion("meta_key is null");
            return (Criteria) this;
        }

        /**
         * And meta key is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andMetaKeyIsNotNull() {
            addCriterion("meta_key is not null");
            return (Criteria) this;
        }

        /**
         * And meta key equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andMetaKeyEqualTo(String value) {
            addCriterion("meta_key =", value, "metaKey");
            return (Criteria) this;
        }

        /**
         * And meta key not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andMetaKeyNotEqualTo(String value) {
            addCriterion("meta_key <>", value, "metaKey");
            return (Criteria) this;
        }

        /**
         * And meta key greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andMetaKeyGreaterThan(String value) {
            addCriterion("meta_key >", value, "metaKey");
            return (Criteria) this;
        }

        /**
         * And meta key greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andMetaKeyGreaterThanOrEqualTo(String value) {
            addCriterion("meta_key >=", value, "metaKey");
            return (Criteria) this;
        }

        /**
         * And meta key less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andMetaKeyLessThan(String value) {
            addCriterion("meta_key <", value, "metaKey");
            return (Criteria) this;
        }

        /**
         * And meta key less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andMetaKeyLessThanOrEqualTo(String value) {
            addCriterion("meta_key <=", value, "metaKey");
            return (Criteria) this;
        }

        /**
         * And meta key like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andMetaKeyLike(String value) {
            addCriterion("meta_key like", value, "metaKey");
            return (Criteria) this;
        }

        /**
         * And meta key not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andMetaKeyNotLike(String value) {
            addCriterion("meta_key not like", value, "metaKey");
            return (Criteria) this;
        }

        /**
         * And meta key in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andMetaKeyIn(List<String> values) {
            addCriterion("meta_key in", values, "metaKey");
            return (Criteria) this;
        }

        /**
         * And meta key not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andMetaKeyNotIn(List<String> values) {
            addCriterion("meta_key not in", values, "metaKey");
            return (Criteria) this;
        }

        /**
         * And meta key between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andMetaKeyBetween(String value1, String value2) {
            addCriterion("meta_key between", value1, value2, "metaKey");
            return (Criteria) this;
        }

        /**
         * And meta key not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andMetaKeyNotBetween(String value1, String value2) {
            addCriterion("meta_key not between", value1, value2, "metaKey");
            return (Criteria) this;
        }
    }

    /**
     * The type Criteria.
     */
    public static class Criteria extends BaseGeneratedCriteria {

        /**
         * Instantiates a new Criteria.
         */
        protected Criteria() {
            super();
        }
    }

    /**
     * The type Criterion.
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

        /**
         * Instantiates a new Criterion.
         *
         * @param condition the condition
         */
        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        /**
         * Instantiates a new Criterion.
         *
         * @param condition   the condition
         * @param value       the value
         * @param typeHandler the type handler
         */
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

        /**
         * Instantiates a new Criterion.
         *
         * @param condition the condition
         * @param value     the value
         */
        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        /**
         * Instantiates a new Criterion.
         *
         * @param condition   the condition
         * @param value       the value
         * @param secondValue the second value
         * @param typeHandler the type handler
         */
        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        /**
         * Instantiates a new Criterion.
         *
         * @param condition   the condition
         * @param value       the value
         * @param secondValue the second value
         */
        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }

        /**
         * Gets condition.
         *
         * @return the condition
         */
        public String getCondition() {
            return condition;
        }

        /**
         * Gets value.
         *
         * @return the value
         */
        public Object getValue() {
            return value;
        }

        /**
         * Gets second value.
         *
         * @return the second value
         */
        public Object getSecondValue() {
            return secondValue;
        }

        /**
         * Is no value boolean.
         *
         * @return the boolean
         */
        public boolean isNoValue() {
            return noValue;
        }

        /**
         * Is single value boolean.
         *
         * @return the boolean
         */
        public boolean isSingleValue() {
            return singleValue;
        }

        /**
         * Is between value boolean.
         *
         * @return the boolean
         */
        public boolean isBetweenValue() {
            return betweenValue;
        }

        /**
         * Is list value boolean.
         *
         * @return the boolean
         */
        public boolean isListValue() {
            return listValue;
        }

        /**
         * Gets type handler.
         *
         * @return the type handler
         */
        public String getTypeHandler() {
            return typeHandler;
        }
    }
}