package com.ihowq.wordpress.api.model.pojo.termrelationship;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Term relationship query.
 */
public class TermRelationshipQuery {
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
     * Instantiates a new Term relationship query.
     */
    public TermRelationshipQuery() {
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
         * And object id is null criteria.
         *
         * @return the criteria
         */
        public Criteria andObjectIdIsNull() {
            addCriterion("object_id is null");
            return (Criteria) this;
        }

        /**
         * And object id is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andObjectIdIsNotNull() {
            addCriterion("object_id is not null");
            return (Criteria) this;
        }

        /**
         * And object id equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andObjectIdEqualTo(Long value) {
            addCriterion("object_id =", value, "objectId");
            return (Criteria) this;
        }

        /**
         * And object id not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andObjectIdNotEqualTo(Long value) {
            addCriterion("object_id <>", value, "objectId");
            return (Criteria) this;
        }

        /**
         * And object id greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andObjectIdGreaterThan(Long value) {
            addCriterion("object_id >", value, "objectId");
            return (Criteria) this;
        }

        /**
         * And object id greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andObjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("object_id >=", value, "objectId");
            return (Criteria) this;
        }

        /**
         * And object id less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andObjectIdLessThan(Long value) {
            addCriterion("object_id <", value, "objectId");
            return (Criteria) this;
        }

        /**
         * And object id less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andObjectIdLessThanOrEqualTo(Long value) {
            addCriterion("object_id <=", value, "objectId");
            return (Criteria) this;
        }

        /**
         * And object id in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andObjectIdIn(List<Long> values) {
            addCriterion("object_id in", values, "objectId");
            return (Criteria) this;
        }

        /**
         * And object id not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andObjectIdNotIn(List<Long> values) {
            addCriterion("object_id not in", values, "objectId");
            return (Criteria) this;
        }

        /**
         * And object id between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andObjectIdBetween(Long value1, Long value2) {
            addCriterion("object_id between", value1, value2, "objectId");
            return (Criteria) this;
        }

        /**
         * And object id not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andObjectIdNotBetween(Long value1, Long value2) {
            addCriterion("object_id not between", value1, value2, "objectId");
            return (Criteria) this;
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
         * And term order is null criteria.
         *
         * @return the criteria
         */
        public Criteria andTermOrderIsNull() {
            addCriterion("term_order is null");
            return (Criteria) this;
        }

        /**
         * And term order is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andTermOrderIsNotNull() {
            addCriterion("term_order is not null");
            return (Criteria) this;
        }

        /**
         * And term order equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTermOrderEqualTo(Integer value) {
            addCriterion("term_order =", value, "termOrder");
            return (Criteria) this;
        }

        /**
         * And term order not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTermOrderNotEqualTo(Integer value) {
            addCriterion("term_order <>", value, "termOrder");
            return (Criteria) this;
        }

        /**
         * And term order greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTermOrderGreaterThan(Integer value) {
            addCriterion("term_order >", value, "termOrder");
            return (Criteria) this;
        }

        /**
         * And term order greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTermOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("term_order >=", value, "termOrder");
            return (Criteria) this;
        }

        /**
         * And term order less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTermOrderLessThan(Integer value) {
            addCriterion("term_order <", value, "termOrder");
            return (Criteria) this;
        }

        /**
         * And term order less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTermOrderLessThanOrEqualTo(Integer value) {
            addCriterion("term_order <=", value, "termOrder");
            return (Criteria) this;
        }

        /**
         * And term order in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTermOrderIn(List<Integer> values) {
            addCriterion("term_order in", values, "termOrder");
            return (Criteria) this;
        }

        /**
         * And term order not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTermOrderNotIn(List<Integer> values) {
            addCriterion("term_order not in", values, "termOrder");
            return (Criteria) this;
        }

        /**
         * And term order between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTermOrderBetween(Integer value1, Integer value2) {
            addCriterion("term_order between", value1, value2, "termOrder");
            return (Criteria) this;
        }

        /**
         * And term order not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTermOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("term_order not between", value1, value2, "termOrder");
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