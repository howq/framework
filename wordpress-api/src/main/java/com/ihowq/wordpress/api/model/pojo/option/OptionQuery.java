package com.ihowq.wordpress.api.model.pojo.option;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Option query.
 */
public class OptionQuery {
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
     * Instantiates a new Option query.
     */
    public OptionQuery() {
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
         * And option id is null criteria.
         *
         * @return the criteria
         */
        public Criteria andOptionIdIsNull() {
            addCriterion("option_id is null");
            return (Criteria) this;
        }

        /**
         * And option id is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andOptionIdIsNotNull() {
            addCriterion("option_id is not null");
            return (Criteria) this;
        }

        /**
         * And option id equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andOptionIdEqualTo(Long value) {
            addCriterion("option_id =", value, "optionId");
            return (Criteria) this;
        }

        /**
         * And option id not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andOptionIdNotEqualTo(Long value) {
            addCriterion("option_id <>", value, "optionId");
            return (Criteria) this;
        }

        /**
         * And option id greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andOptionIdGreaterThan(Long value) {
            addCriterion("option_id >", value, "optionId");
            return (Criteria) this;
        }

        /**
         * And option id greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andOptionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("option_id >=", value, "optionId");
            return (Criteria) this;
        }

        /**
         * And option id less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andOptionIdLessThan(Long value) {
            addCriterion("option_id <", value, "optionId");
            return (Criteria) this;
        }

        /**
         * And option id less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andOptionIdLessThanOrEqualTo(Long value) {
            addCriterion("option_id <=", value, "optionId");
            return (Criteria) this;
        }

        /**
         * And option id in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andOptionIdIn(List<Long> values) {
            addCriterion("option_id in", values, "optionId");
            return (Criteria) this;
        }

        /**
         * And option id not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andOptionIdNotIn(List<Long> values) {
            addCriterion("option_id not in", values, "optionId");
            return (Criteria) this;
        }

        /**
         * And option id between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andOptionIdBetween(Long value1, Long value2) {
            addCriterion("option_id between", value1, value2, "optionId");
            return (Criteria) this;
        }

        /**
         * And option id not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andOptionIdNotBetween(Long value1, Long value2) {
            addCriterion("option_id not between", value1, value2, "optionId");
            return (Criteria) this;
        }

        /**
         * And option name is null criteria.
         *
         * @return the criteria
         */
        public Criteria andOptionNameIsNull() {
            addCriterion("option_name is null");
            return (Criteria) this;
        }

        /**
         * And option name is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andOptionNameIsNotNull() {
            addCriterion("option_name is not null");
            return (Criteria) this;
        }

        /**
         * And option name equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andOptionNameEqualTo(String value) {
            addCriterion("option_name =", value, "optionName");
            return (Criteria) this;
        }

        /**
         * And option name not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andOptionNameNotEqualTo(String value) {
            addCriterion("option_name <>", value, "optionName");
            return (Criteria) this;
        }

        /**
         * And option name greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andOptionNameGreaterThan(String value) {
            addCriterion("option_name >", value, "optionName");
            return (Criteria) this;
        }

        /**
         * And option name greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andOptionNameGreaterThanOrEqualTo(String value) {
            addCriterion("option_name >=", value, "optionName");
            return (Criteria) this;
        }

        /**
         * And option name less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andOptionNameLessThan(String value) {
            addCriterion("option_name <", value, "optionName");
            return (Criteria) this;
        }

        /**
         * And option name less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andOptionNameLessThanOrEqualTo(String value) {
            addCriterion("option_name <=", value, "optionName");
            return (Criteria) this;
        }

        /**
         * And option name like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andOptionNameLike(String value) {
            addCriterion("option_name like", value, "optionName");
            return (Criteria) this;
        }

        /**
         * And option name not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andOptionNameNotLike(String value) {
            addCriterion("option_name not like", value, "optionName");
            return (Criteria) this;
        }

        /**
         * And option name in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andOptionNameIn(List<String> values) {
            addCriterion("option_name in", values, "optionName");
            return (Criteria) this;
        }

        /**
         * And option name not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andOptionNameNotIn(List<String> values) {
            addCriterion("option_name not in", values, "optionName");
            return (Criteria) this;
        }

        /**
         * And option name between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andOptionNameBetween(String value1, String value2) {
            addCriterion("option_name between", value1, value2, "optionName");
            return (Criteria) this;
        }

        /**
         * And option name not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andOptionNameNotBetween(String value1, String value2) {
            addCriterion("option_name not between", value1, value2, "optionName");
            return (Criteria) this;
        }

        /**
         * And autoload is null criteria.
         *
         * @return the criteria
         */
        public Criteria andAutoloadIsNull() {
            addCriterion("autoload is null");
            return (Criteria) this;
        }

        /**
         * And autoload is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andAutoloadIsNotNull() {
            addCriterion("autoload is not null");
            return (Criteria) this;
        }

        /**
         * And autoload equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAutoloadEqualTo(String value) {
            addCriterion("autoload =", value, "autoload");
            return (Criteria) this;
        }

        /**
         * And autoload not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAutoloadNotEqualTo(String value) {
            addCriterion("autoload <>", value, "autoload");
            return (Criteria) this;
        }

        /**
         * And autoload greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAutoloadGreaterThan(String value) {
            addCriterion("autoload >", value, "autoload");
            return (Criteria) this;
        }

        /**
         * And autoload greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAutoloadGreaterThanOrEqualTo(String value) {
            addCriterion("autoload >=", value, "autoload");
            return (Criteria) this;
        }

        /**
         * And autoload less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAutoloadLessThan(String value) {
            addCriterion("autoload <", value, "autoload");
            return (Criteria) this;
        }

        /**
         * And autoload less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAutoloadLessThanOrEqualTo(String value) {
            addCriterion("autoload <=", value, "autoload");
            return (Criteria) this;
        }

        /**
         * And autoload like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAutoloadLike(String value) {
            addCriterion("autoload like", value, "autoload");
            return (Criteria) this;
        }

        /**
         * And autoload not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAutoloadNotLike(String value) {
            addCriterion("autoload not like", value, "autoload");
            return (Criteria) this;
        }

        /**
         * And autoload in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andAutoloadIn(List<String> values) {
            addCriterion("autoload in", values, "autoload");
            return (Criteria) this;
        }

        /**
         * And autoload not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andAutoloadNotIn(List<String> values) {
            addCriterion("autoload not in", values, "autoload");
            return (Criteria) this;
        }

        /**
         * And autoload between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andAutoloadBetween(String value1, String value2) {
            addCriterion("autoload between", value1, value2, "autoload");
            return (Criteria) this;
        }

        /**
         * And autoload not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andAutoloadNotBetween(String value1, String value2) {
            addCriterion("autoload not between", value1, value2, "autoload");
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