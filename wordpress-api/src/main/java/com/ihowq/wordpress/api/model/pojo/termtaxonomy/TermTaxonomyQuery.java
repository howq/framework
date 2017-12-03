package com.ihowq.wordpress.api.model.pojo.termtaxonomy;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Term taxonomy query.
 */
public class TermTaxonomyQuery {
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
     * Instantiates a new Term taxonomy query.
     */
    public TermTaxonomyQuery() {
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
         * And term taxonomy id is null criteria.
         *
         * @return the criteria
         */
        public Criteria andTermTaxonomyIdIsNull() {
            addCriterion("term_taxonomy_id is null");
            return (Criteria) this;
        }

        /**
         * And term taxonomy id is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andTermTaxonomyIdIsNotNull() {
            addCriterion("term_taxonomy_id is not null");
            return (Criteria) this;
        }

        /**
         * And term taxonomy id equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTermTaxonomyIdEqualTo(Long value) {
            addCriterion("term_taxonomy_id =", value, "termTaxonomyId");
            return (Criteria) this;
        }

        /**
         * And term taxonomy id not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTermTaxonomyIdNotEqualTo(Long value) {
            addCriterion("term_taxonomy_id <>", value, "termTaxonomyId");
            return (Criteria) this;
        }

        /**
         * And term taxonomy id greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTermTaxonomyIdGreaterThan(Long value) {
            addCriterion("term_taxonomy_id >", value, "termTaxonomyId");
            return (Criteria) this;
        }

        /**
         * And term taxonomy id greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTermTaxonomyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("term_taxonomy_id >=", value, "termTaxonomyId");
            return (Criteria) this;
        }

        /**
         * And term taxonomy id less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTermTaxonomyIdLessThan(Long value) {
            addCriterion("term_taxonomy_id <", value, "termTaxonomyId");
            return (Criteria) this;
        }

        /**
         * And term taxonomy id less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTermTaxonomyIdLessThanOrEqualTo(Long value) {
            addCriterion("term_taxonomy_id <=", value, "termTaxonomyId");
            return (Criteria) this;
        }

        /**
         * And term taxonomy id in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTermTaxonomyIdIn(List<Long> values) {
            addCriterion("term_taxonomy_id in", values, "termTaxonomyId");
            return (Criteria) this;
        }

        /**
         * And term taxonomy id not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTermTaxonomyIdNotIn(List<Long> values) {
            addCriterion("term_taxonomy_id not in", values, "termTaxonomyId");
            return (Criteria) this;
        }

        /**
         * And term taxonomy id between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTermTaxonomyIdBetween(Long value1, Long value2) {
            addCriterion("term_taxonomy_id between", value1, value2, "termTaxonomyId");
            return (Criteria) this;
        }

        /**
         * And term taxonomy id not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTermTaxonomyIdNotBetween(Long value1, Long value2) {
            addCriterion("term_taxonomy_id not between", value1, value2, "termTaxonomyId");
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
         * And taxonomy is null criteria.
         *
         * @return the criteria
         */
        public Criteria andTaxonomyIsNull() {
            addCriterion("taxonomy is null");
            return (Criteria) this;
        }

        /**
         * And taxonomy is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andTaxonomyIsNotNull() {
            addCriterion("taxonomy is not null");
            return (Criteria) this;
        }

        /**
         * And taxonomy equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTaxonomyEqualTo(String value) {
            addCriterion("taxonomy =", value, "taxonomy");
            return (Criteria) this;
        }

        /**
         * And taxonomy not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTaxonomyNotEqualTo(String value) {
            addCriterion("taxonomy <>", value, "taxonomy");
            return (Criteria) this;
        }

        /**
         * And taxonomy greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTaxonomyGreaterThan(String value) {
            addCriterion("taxonomy >", value, "taxonomy");
            return (Criteria) this;
        }

        /**
         * And taxonomy greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTaxonomyGreaterThanOrEqualTo(String value) {
            addCriterion("taxonomy >=", value, "taxonomy");
            return (Criteria) this;
        }

        /**
         * And taxonomy less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTaxonomyLessThan(String value) {
            addCriterion("taxonomy <", value, "taxonomy");
            return (Criteria) this;
        }

        /**
         * And taxonomy less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTaxonomyLessThanOrEqualTo(String value) {
            addCriterion("taxonomy <=", value, "taxonomy");
            return (Criteria) this;
        }

        /**
         * And taxonomy like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTaxonomyLike(String value) {
            addCriterion("taxonomy like", value, "taxonomy");
            return (Criteria) this;
        }

        /**
         * And taxonomy not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTaxonomyNotLike(String value) {
            addCriterion("taxonomy not like", value, "taxonomy");
            return (Criteria) this;
        }

        /**
         * And taxonomy in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTaxonomyIn(List<String> values) {
            addCriterion("taxonomy in", values, "taxonomy");
            return (Criteria) this;
        }

        /**
         * And taxonomy not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTaxonomyNotIn(List<String> values) {
            addCriterion("taxonomy not in", values, "taxonomy");
            return (Criteria) this;
        }

        /**
         * And taxonomy between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTaxonomyBetween(String value1, String value2) {
            addCriterion("taxonomy between", value1, value2, "taxonomy");
            return (Criteria) this;
        }

        /**
         * And taxonomy not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTaxonomyNotBetween(String value1, String value2) {
            addCriterion("taxonomy not between", value1, value2, "taxonomy");
            return (Criteria) this;
        }

        /**
         * And parent is null criteria.
         *
         * @return the criteria
         */
        public Criteria andParentIsNull() {
            addCriterion("parent is null");
            return (Criteria) this;
        }

        /**
         * And parent is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andParentIsNotNull() {
            addCriterion("parent is not null");
            return (Criteria) this;
        }

        /**
         * And parent equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andParentEqualTo(Long value) {
            addCriterion("parent =", value, "parent");
            return (Criteria) this;
        }

        /**
         * And parent not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andParentNotEqualTo(Long value) {
            addCriterion("parent <>", value, "parent");
            return (Criteria) this;
        }

        /**
         * And parent greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andParentGreaterThan(Long value) {
            addCriterion("parent >", value, "parent");
            return (Criteria) this;
        }

        /**
         * And parent greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andParentGreaterThanOrEqualTo(Long value) {
            addCriterion("parent >=", value, "parent");
            return (Criteria) this;
        }

        /**
         * And parent less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andParentLessThan(Long value) {
            addCriterion("parent <", value, "parent");
            return (Criteria) this;
        }

        /**
         * And parent less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andParentLessThanOrEqualTo(Long value) {
            addCriterion("parent <=", value, "parent");
            return (Criteria) this;
        }

        /**
         * And parent in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andParentIn(List<Long> values) {
            addCriterion("parent in", values, "parent");
            return (Criteria) this;
        }

        /**
         * And parent not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andParentNotIn(List<Long> values) {
            addCriterion("parent not in", values, "parent");
            return (Criteria) this;
        }

        /**
         * And parent between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andParentBetween(Long value1, Long value2) {
            addCriterion("parent between", value1, value2, "parent");
            return (Criteria) this;
        }

        /**
         * And parent not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andParentNotBetween(Long value1, Long value2) {
            addCriterion("parent not between", value1, value2, "parent");
            return (Criteria) this;
        }

        /**
         * And count is null criteria.
         *
         * @return the criteria
         */
        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        /**
         * And count is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        /**
         * And count equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCountEqualTo(Long value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        /**
         * And count not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCountNotEqualTo(Long value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        /**
         * And count greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCountGreaterThan(Long value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        /**
         * And count greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCountGreaterThanOrEqualTo(Long value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        /**
         * And count less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCountLessThan(Long value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        /**
         * And count less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCountLessThanOrEqualTo(Long value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        /**
         * And count in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCountIn(List<Long> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        /**
         * And count not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCountNotIn(List<Long> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        /**
         * And count between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCountBetween(Long value1, Long value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        /**
         * And count not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCountNotBetween(Long value1, Long value2) {
            addCriterion("count not between", value1, value2, "count");
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