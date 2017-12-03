package com.ihowq.wordpress.api.model.pojo.termmeta;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Term meta query.
 */
public class TermMetaQuery {
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
     * Constructs a new TermMetaQuery.
     */
    public TermMetaQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * Getter for property 'orderByClause'.
     *
     * @return Value for property 'orderByClause'.
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * Setter for property 'orderByClause'.
     *
     * @param orderByClause Value to set for property 'orderByClause'.
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * Getter for property 'distinct'.
     *
     * @return Value for property 'distinct'.
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * Setter for property 'distinct'.
     *
     * @param distinct Value to set for property 'distinct'.
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * Getter for property 'oredCriteria'.
     *
     * @return Value for property 'oredCriteria'.
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
     * Getter for property 'limit'.
     *
     * @return Value for property 'limit'.
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Setter for property 'limit'.
     *
     * @param limit Value to set for property 'limit'.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * Getter for property 'offset'.
     *
     * @return Value for property 'offset'.
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * Setter for property 'offset'.
     *
     * @param offset Value to set for property 'offset'.
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
         * Constructs a new BaseGeneratedCriteria.
         */
        protected BaseGeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        /**
         * Getter for property 'valid'.
         *
         * @return Value for property 'valid'.
         */
        public boolean isValid() {
            return criteria.size() > 0;
        }

        /**
         * Getter for property 'allCriteria'.
         *
         * @return Value for property 'allCriteria'.
         */
        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        /**
         * Getter for property 'criteria'.
         *
         * @return Value for property 'criteria'.
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
         * And meta id is null criteria.
         *
         * @return the criteria
         */
        public Criteria andMetaIdIsNull() {
            addCriterion("meta_id is null");
            return (Criteria) this;
        }

        /**
         * And meta id is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andMetaIdIsNotNull() {
            addCriterion("meta_id is not null");
            return (Criteria) this;
        }

        /**
         * And meta id equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andMetaIdEqualTo(Long value) {
            addCriterion("meta_id =", value, "metaId");
            return (Criteria) this;
        }

        /**
         * And meta id not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andMetaIdNotEqualTo(Long value) {
            addCriterion("meta_id <>", value, "metaId");
            return (Criteria) this;
        }

        /**
         * And meta id greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andMetaIdGreaterThan(Long value) {
            addCriterion("meta_id >", value, "metaId");
            return (Criteria) this;
        }

        /**
         * And meta id greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andMetaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("meta_id >=", value, "metaId");
            return (Criteria) this;
        }

        /**
         * And meta id less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andMetaIdLessThan(Long value) {
            addCriterion("meta_id <", value, "metaId");
            return (Criteria) this;
        }

        /**
         * And meta id less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andMetaIdLessThanOrEqualTo(Long value) {
            addCriterion("meta_id <=", value, "metaId");
            return (Criteria) this;
        }

        /**
         * And meta id in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andMetaIdIn(List<Long> values) {
            addCriterion("meta_id in", values, "metaId");
            return (Criteria) this;
        }

        /**
         * And meta id not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andMetaIdNotIn(List<Long> values) {
            addCriterion("meta_id not in", values, "metaId");
            return (Criteria) this;
        }

        /**
         * And meta id between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andMetaIdBetween(Long value1, Long value2) {
            addCriterion("meta_id between", value1, value2, "metaId");
            return (Criteria) this;
        }

        /**
         * And meta id not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andMetaIdNotBetween(Long value1, Long value2) {
            addCriterion("meta_id not between", value1, value2, "metaId");
            return (Criteria) this;
        }

        /**
         * And term id is null criteria.
         *
         * @return the criteria
         */
        public Criteria andTermIdIsNull() {
            addCriterion("term_id is null");
            return (Criteria) this;
        }

        /**
         * And term id is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andTermIdIsNotNull() {
            addCriterion("term_id is not null");
            return (Criteria) this;
        }

        /**
         * And term id equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTermIdEqualTo(Long value) {
            addCriterion("term_id =", value, "termId");
            return (Criteria) this;
        }

        /**
         * And term id not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTermIdNotEqualTo(Long value) {
            addCriterion("term_id <>", value, "termId");
            return (Criteria) this;
        }

        /**
         * And term id greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTermIdGreaterThan(Long value) {
            addCriterion("term_id >", value, "termId");
            return (Criteria) this;
        }

        /**
         * And term id greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTermIdGreaterThanOrEqualTo(Long value) {
            addCriterion("term_id >=", value, "termId");
            return (Criteria) this;
        }

        /**
         * And term id less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTermIdLessThan(Long value) {
            addCriterion("term_id <", value, "termId");
            return (Criteria) this;
        }

        /**
         * And term id less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTermIdLessThanOrEqualTo(Long value) {
            addCriterion("term_id <=", value, "termId");
            return (Criteria) this;
        }

        /**
         * And term id in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTermIdIn(List<Long> values) {
            addCriterion("term_id in", values, "termId");
            return (Criteria) this;
        }

        /**
         * And term id not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTermIdNotIn(List<Long> values) {
            addCriterion("term_id not in", values, "termId");
            return (Criteria) this;
        }

        /**
         * And term id between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTermIdBetween(Long value1, Long value2) {
            addCriterion("term_id between", value1, value2, "termId");
            return (Criteria) this;
        }

        /**
         * And term id not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTermIdNotBetween(Long value1, Long value2) {
            addCriterion("term_id not between", value1, value2, "termId");
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
         * Constructs a new Criteria.
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
         * Getter for property 'condition'.
         *
         * @return Value for property 'condition'.
         */
        public String getCondition() {
            return condition;
        }

        /**
         * Getter for property 'value'.
         *
         * @return Value for property 'value'.
         */
        public Object getValue() {
            return value;
        }

        /**
         * Getter for property 'secondValue'.
         *
         * @return Value for property 'secondValue'.
         */
        public Object getSecondValue() {
            return secondValue;
        }

        /**
         * Getter for property 'noValue'.
         *
         * @return Value for property 'noValue'.
         */
        public boolean isNoValue() {
            return noValue;
        }

        /**
         * Getter for property 'singleValue'.
         *
         * @return Value for property 'singleValue'.
         */
        public boolean isSingleValue() {
            return singleValue;
        }

        /**
         * Getter for property 'betweenValue'.
         *
         * @return Value for property 'betweenValue'.
         */
        public boolean isBetweenValue() {
            return betweenValue;
        }

        /**
         * Getter for property 'listValue'.
         *
         * @return Value for property 'listValue'.
         */
        public boolean isListValue() {
            return listValue;
        }

        /**
         * Getter for property 'typeHandler'.
         *
         * @return Value for property 'typeHandler'.
         */
        public String getTypeHandler() {
            return typeHandler;
        }
    }
}