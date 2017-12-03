package com.ihowq.wordpress.api.model.pojo.link;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The type Link query.
 */
public class LinkQuery {
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
     * Instantiates a new Link query.
     */
    public LinkQuery() {
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
         * And link id is null criteria.
         *
         * @return the criteria
         */
        public Criteria andLinkIdIsNull() {
            addCriterion("link_id is null");
            return (Criteria) this;
        }

        /**
         * And link id is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andLinkIdIsNotNull() {
            addCriterion("link_id is not null");
            return (Criteria) this;
        }

        /**
         * And link id equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkIdEqualTo(Long value) {
            addCriterion("link_id =", value, "linkId");
            return (Criteria) this;
        }

        /**
         * And link id not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkIdNotEqualTo(Long value) {
            addCriterion("link_id <>", value, "linkId");
            return (Criteria) this;
        }

        /**
         * And link id greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkIdGreaterThan(Long value) {
            addCriterion("link_id >", value, "linkId");
            return (Criteria) this;
        }

        /**
         * And link id greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkIdGreaterThanOrEqualTo(Long value) {
            addCriterion("link_id >=", value, "linkId");
            return (Criteria) this;
        }

        /**
         * And link id less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkIdLessThan(Long value) {
            addCriterion("link_id <", value, "linkId");
            return (Criteria) this;
        }

        /**
         * And link id less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkIdLessThanOrEqualTo(Long value) {
            addCriterion("link_id <=", value, "linkId");
            return (Criteria) this;
        }

        /**
         * And link id in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLinkIdIn(List<Long> values) {
            addCriterion("link_id in", values, "linkId");
            return (Criteria) this;
        }

        /**
         * And link id not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLinkIdNotIn(List<Long> values) {
            addCriterion("link_id not in", values, "linkId");
            return (Criteria) this;
        }

        /**
         * And link id between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLinkIdBetween(Long value1, Long value2) {
            addCriterion("link_id between", value1, value2, "linkId");
            return (Criteria) this;
        }

        /**
         * And link id not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLinkIdNotBetween(Long value1, Long value2) {
            addCriterion("link_id not between", value1, value2, "linkId");
            return (Criteria) this;
        }

        /**
         * And link url is null criteria.
         *
         * @return the criteria
         */
        public Criteria andLinkUrlIsNull() {
            addCriterion("link_url is null");
            return (Criteria) this;
        }

        /**
         * And link url is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andLinkUrlIsNotNull() {
            addCriterion("link_url is not null");
            return (Criteria) this;
        }

        /**
         * And link url equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkUrlEqualTo(String value) {
            addCriterion("link_url =", value, "linkUrl");
            return (Criteria) this;
        }

        /**
         * And link url not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkUrlNotEqualTo(String value) {
            addCriterion("link_url <>", value, "linkUrl");
            return (Criteria) this;
        }

        /**
         * And link url greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkUrlGreaterThan(String value) {
            addCriterion("link_url >", value, "linkUrl");
            return (Criteria) this;
        }

        /**
         * And link url greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("link_url >=", value, "linkUrl");
            return (Criteria) this;
        }

        /**
         * And link url less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkUrlLessThan(String value) {
            addCriterion("link_url <", value, "linkUrl");
            return (Criteria) this;
        }

        /**
         * And link url less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkUrlLessThanOrEqualTo(String value) {
            addCriterion("link_url <=", value, "linkUrl");
            return (Criteria) this;
        }

        /**
         * And link url like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkUrlLike(String value) {
            addCriterion("link_url like", value, "linkUrl");
            return (Criteria) this;
        }

        /**
         * And link url not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkUrlNotLike(String value) {
            addCriterion("link_url not like", value, "linkUrl");
            return (Criteria) this;
        }

        /**
         * And link url in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLinkUrlIn(List<String> values) {
            addCriterion("link_url in", values, "linkUrl");
            return (Criteria) this;
        }

        /**
         * And link url not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLinkUrlNotIn(List<String> values) {
            addCriterion("link_url not in", values, "linkUrl");
            return (Criteria) this;
        }

        /**
         * And link url between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLinkUrlBetween(String value1, String value2) {
            addCriterion("link_url between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        /**
         * And link url not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLinkUrlNotBetween(String value1, String value2) {
            addCriterion("link_url not between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        /**
         * And link name is null criteria.
         *
         * @return the criteria
         */
        public Criteria andLinkNameIsNull() {
            addCriterion("link_name is null");
            return (Criteria) this;
        }

        /**
         * And link name is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andLinkNameIsNotNull() {
            addCriterion("link_name is not null");
            return (Criteria) this;
        }

        /**
         * And link name equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkNameEqualTo(String value) {
            addCriterion("link_name =", value, "linkName");
            return (Criteria) this;
        }

        /**
         * And link name not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkNameNotEqualTo(String value) {
            addCriterion("link_name <>", value, "linkName");
            return (Criteria) this;
        }

        /**
         * And link name greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkNameGreaterThan(String value) {
            addCriterion("link_name >", value, "linkName");
            return (Criteria) this;
        }

        /**
         * And link name greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkNameGreaterThanOrEqualTo(String value) {
            addCriterion("link_name >=", value, "linkName");
            return (Criteria) this;
        }

        /**
         * And link name less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkNameLessThan(String value) {
            addCriterion("link_name <", value, "linkName");
            return (Criteria) this;
        }

        /**
         * And link name less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkNameLessThanOrEqualTo(String value) {
            addCriterion("link_name <=", value, "linkName");
            return (Criteria) this;
        }

        /**
         * And link name like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkNameLike(String value) {
            addCriterion("link_name like", value, "linkName");
            return (Criteria) this;
        }

        /**
         * And link name not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkNameNotLike(String value) {
            addCriterion("link_name not like", value, "linkName");
            return (Criteria) this;
        }

        /**
         * And link name in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLinkNameIn(List<String> values) {
            addCriterion("link_name in", values, "linkName");
            return (Criteria) this;
        }

        /**
         * And link name not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLinkNameNotIn(List<String> values) {
            addCriterion("link_name not in", values, "linkName");
            return (Criteria) this;
        }

        /**
         * And link name between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLinkNameBetween(String value1, String value2) {
            addCriterion("link_name between", value1, value2, "linkName");
            return (Criteria) this;
        }

        /**
         * And link name not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLinkNameNotBetween(String value1, String value2) {
            addCriterion("link_name not between", value1, value2, "linkName");
            return (Criteria) this;
        }

        /**
         * And link image is null criteria.
         *
         * @return the criteria
         */
        public Criteria andLinkImageIsNull() {
            addCriterion("link_image is null");
            return (Criteria) this;
        }

        /**
         * And link image is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andLinkImageIsNotNull() {
            addCriterion("link_image is not null");
            return (Criteria) this;
        }

        /**
         * And link image equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkImageEqualTo(String value) {
            addCriterion("link_image =", value, "linkImage");
            return (Criteria) this;
        }

        /**
         * And link image not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkImageNotEqualTo(String value) {
            addCriterion("link_image <>", value, "linkImage");
            return (Criteria) this;
        }

        /**
         * And link image greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkImageGreaterThan(String value) {
            addCriterion("link_image >", value, "linkImage");
            return (Criteria) this;
        }

        /**
         * And link image greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkImageGreaterThanOrEqualTo(String value) {
            addCriterion("link_image >=", value, "linkImage");
            return (Criteria) this;
        }

        /**
         * And link image less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkImageLessThan(String value) {
            addCriterion("link_image <", value, "linkImage");
            return (Criteria) this;
        }

        /**
         * And link image less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkImageLessThanOrEqualTo(String value) {
            addCriterion("link_image <=", value, "linkImage");
            return (Criteria) this;
        }

        /**
         * And link image like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkImageLike(String value) {
            addCriterion("link_image like", value, "linkImage");
            return (Criteria) this;
        }

        /**
         * And link image not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkImageNotLike(String value) {
            addCriterion("link_image not like", value, "linkImage");
            return (Criteria) this;
        }

        /**
         * And link image in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLinkImageIn(List<String> values) {
            addCriterion("link_image in", values, "linkImage");
            return (Criteria) this;
        }

        /**
         * And link image not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLinkImageNotIn(List<String> values) {
            addCriterion("link_image not in", values, "linkImage");
            return (Criteria) this;
        }

        /**
         * And link image between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLinkImageBetween(String value1, String value2) {
            addCriterion("link_image between", value1, value2, "linkImage");
            return (Criteria) this;
        }

        /**
         * And link image not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLinkImageNotBetween(String value1, String value2) {
            addCriterion("link_image not between", value1, value2, "linkImage");
            return (Criteria) this;
        }

        /**
         * And link target is null criteria.
         *
         * @return the criteria
         */
        public Criteria andLinkTargetIsNull() {
            addCriterion("link_target is null");
            return (Criteria) this;
        }

        /**
         * And link target is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andLinkTargetIsNotNull() {
            addCriterion("link_target is not null");
            return (Criteria) this;
        }

        /**
         * And link target equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkTargetEqualTo(String value) {
            addCriterion("link_target =", value, "linkTarget");
            return (Criteria) this;
        }

        /**
         * And link target not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkTargetNotEqualTo(String value) {
            addCriterion("link_target <>", value, "linkTarget");
            return (Criteria) this;
        }

        /**
         * And link target greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkTargetGreaterThan(String value) {
            addCriterion("link_target >", value, "linkTarget");
            return (Criteria) this;
        }

        /**
         * And link target greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkTargetGreaterThanOrEqualTo(String value) {
            addCriterion("link_target >=", value, "linkTarget");
            return (Criteria) this;
        }

        /**
         * And link target less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkTargetLessThan(String value) {
            addCriterion("link_target <", value, "linkTarget");
            return (Criteria) this;
        }

        /**
         * And link target less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkTargetLessThanOrEqualTo(String value) {
            addCriterion("link_target <=", value, "linkTarget");
            return (Criteria) this;
        }

        /**
         * And link target like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkTargetLike(String value) {
            addCriterion("link_target like", value, "linkTarget");
            return (Criteria) this;
        }

        /**
         * And link target not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkTargetNotLike(String value) {
            addCriterion("link_target not like", value, "linkTarget");
            return (Criteria) this;
        }

        /**
         * And link target in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLinkTargetIn(List<String> values) {
            addCriterion("link_target in", values, "linkTarget");
            return (Criteria) this;
        }

        /**
         * And link target not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLinkTargetNotIn(List<String> values) {
            addCriterion("link_target not in", values, "linkTarget");
            return (Criteria) this;
        }

        /**
         * And link target between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLinkTargetBetween(String value1, String value2) {
            addCriterion("link_target between", value1, value2, "linkTarget");
            return (Criteria) this;
        }

        /**
         * And link target not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLinkTargetNotBetween(String value1, String value2) {
            addCriterion("link_target not between", value1, value2, "linkTarget");
            return (Criteria) this;
        }

        /**
         * And link description is null criteria.
         *
         * @return the criteria
         */
        public Criteria andLinkDescriptionIsNull() {
            addCriterion("link_description is null");
            return (Criteria) this;
        }

        /**
         * And link description is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andLinkDescriptionIsNotNull() {
            addCriterion("link_description is not null");
            return (Criteria) this;
        }

        /**
         * And link description equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkDescriptionEqualTo(String value) {
            addCriterion("link_description =", value, "linkDescription");
            return (Criteria) this;
        }

        /**
         * And link description not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkDescriptionNotEqualTo(String value) {
            addCriterion("link_description <>", value, "linkDescription");
            return (Criteria) this;
        }

        /**
         * And link description greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkDescriptionGreaterThan(String value) {
            addCriterion("link_description >", value, "linkDescription");
            return (Criteria) this;
        }

        /**
         * And link description greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("link_description >=", value, "linkDescription");
            return (Criteria) this;
        }

        /**
         * And link description less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkDescriptionLessThan(String value) {
            addCriterion("link_description <", value, "linkDescription");
            return (Criteria) this;
        }

        /**
         * And link description less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkDescriptionLessThanOrEqualTo(String value) {
            addCriterion("link_description <=", value, "linkDescription");
            return (Criteria) this;
        }

        /**
         * And link description like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkDescriptionLike(String value) {
            addCriterion("link_description like", value, "linkDescription");
            return (Criteria) this;
        }

        /**
         * And link description not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkDescriptionNotLike(String value) {
            addCriterion("link_description not like", value, "linkDescription");
            return (Criteria) this;
        }

        /**
         * And link description in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLinkDescriptionIn(List<String> values) {
            addCriterion("link_description in", values, "linkDescription");
            return (Criteria) this;
        }

        /**
         * And link description not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLinkDescriptionNotIn(List<String> values) {
            addCriterion("link_description not in", values, "linkDescription");
            return (Criteria) this;
        }

        /**
         * And link description between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLinkDescriptionBetween(String value1, String value2) {
            addCriterion("link_description between", value1, value2, "linkDescription");
            return (Criteria) this;
        }

        /**
         * And link description not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLinkDescriptionNotBetween(String value1, String value2) {
            addCriterion("link_description not between", value1, value2, "linkDescription");
            return (Criteria) this;
        }

        /**
         * And link visible is null criteria.
         *
         * @return the criteria
         */
        public Criteria andLinkVisibleIsNull() {
            addCriterion("link_visible is null");
            return (Criteria) this;
        }

        /**
         * And link visible is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andLinkVisibleIsNotNull() {
            addCriterion("link_visible is not null");
            return (Criteria) this;
        }

        /**
         * And link visible equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkVisibleEqualTo(String value) {
            addCriterion("link_visible =", value, "linkVisible");
            return (Criteria) this;
        }

        /**
         * And link visible not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkVisibleNotEqualTo(String value) {
            addCriterion("link_visible <>", value, "linkVisible");
            return (Criteria) this;
        }

        /**
         * And link visible greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkVisibleGreaterThan(String value) {
            addCriterion("link_visible >", value, "linkVisible");
            return (Criteria) this;
        }

        /**
         * And link visible greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkVisibleGreaterThanOrEqualTo(String value) {
            addCriterion("link_visible >=", value, "linkVisible");
            return (Criteria) this;
        }

        /**
         * And link visible less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkVisibleLessThan(String value) {
            addCriterion("link_visible <", value, "linkVisible");
            return (Criteria) this;
        }

        /**
         * And link visible less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkVisibleLessThanOrEqualTo(String value) {
            addCriterion("link_visible <=", value, "linkVisible");
            return (Criteria) this;
        }

        /**
         * And link visible like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkVisibleLike(String value) {
            addCriterion("link_visible like", value, "linkVisible");
            return (Criteria) this;
        }

        /**
         * And link visible not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkVisibleNotLike(String value) {
            addCriterion("link_visible not like", value, "linkVisible");
            return (Criteria) this;
        }

        /**
         * And link visible in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLinkVisibleIn(List<String> values) {
            addCriterion("link_visible in", values, "linkVisible");
            return (Criteria) this;
        }

        /**
         * And link visible not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLinkVisibleNotIn(List<String> values) {
            addCriterion("link_visible not in", values, "linkVisible");
            return (Criteria) this;
        }

        /**
         * And link visible between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLinkVisibleBetween(String value1, String value2) {
            addCriterion("link_visible between", value1, value2, "linkVisible");
            return (Criteria) this;
        }

        /**
         * And link visible not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLinkVisibleNotBetween(String value1, String value2) {
            addCriterion("link_visible not between", value1, value2, "linkVisible");
            return (Criteria) this;
        }

        /**
         * And link owner is null criteria.
         *
         * @return the criteria
         */
        public Criteria andLinkOwnerIsNull() {
            addCriterion("link_owner is null");
            return (Criteria) this;
        }

        /**
         * And link owner is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andLinkOwnerIsNotNull() {
            addCriterion("link_owner is not null");
            return (Criteria) this;
        }

        /**
         * And link owner equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkOwnerEqualTo(Long value) {
            addCriterion("link_owner =", value, "linkOwner");
            return (Criteria) this;
        }

        /**
         * And link owner not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkOwnerNotEqualTo(Long value) {
            addCriterion("link_owner <>", value, "linkOwner");
            return (Criteria) this;
        }

        /**
         * And link owner greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkOwnerGreaterThan(Long value) {
            addCriterion("link_owner >", value, "linkOwner");
            return (Criteria) this;
        }

        /**
         * And link owner greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkOwnerGreaterThanOrEqualTo(Long value) {
            addCriterion("link_owner >=", value, "linkOwner");
            return (Criteria) this;
        }

        /**
         * And link owner less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkOwnerLessThan(Long value) {
            addCriterion("link_owner <", value, "linkOwner");
            return (Criteria) this;
        }

        /**
         * And link owner less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkOwnerLessThanOrEqualTo(Long value) {
            addCriterion("link_owner <=", value, "linkOwner");
            return (Criteria) this;
        }

        /**
         * And link owner in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLinkOwnerIn(List<Long> values) {
            addCriterion("link_owner in", values, "linkOwner");
            return (Criteria) this;
        }

        /**
         * And link owner not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLinkOwnerNotIn(List<Long> values) {
            addCriterion("link_owner not in", values, "linkOwner");
            return (Criteria) this;
        }

        /**
         * And link owner between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLinkOwnerBetween(Long value1, Long value2) {
            addCriterion("link_owner between", value1, value2, "linkOwner");
            return (Criteria) this;
        }

        /**
         * And link owner not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLinkOwnerNotBetween(Long value1, Long value2) {
            addCriterion("link_owner not between", value1, value2, "linkOwner");
            return (Criteria) this;
        }

        /**
         * And link rating is null criteria.
         *
         * @return the criteria
         */
        public Criteria andLinkRatingIsNull() {
            addCriterion("link_rating is null");
            return (Criteria) this;
        }

        /**
         * And link rating is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andLinkRatingIsNotNull() {
            addCriterion("link_rating is not null");
            return (Criteria) this;
        }

        /**
         * And link rating equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkRatingEqualTo(Integer value) {
            addCriterion("link_rating =", value, "linkRating");
            return (Criteria) this;
        }

        /**
         * And link rating not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkRatingNotEqualTo(Integer value) {
            addCriterion("link_rating <>", value, "linkRating");
            return (Criteria) this;
        }

        /**
         * And link rating greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkRatingGreaterThan(Integer value) {
            addCriterion("link_rating >", value, "linkRating");
            return (Criteria) this;
        }

        /**
         * And link rating greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkRatingGreaterThanOrEqualTo(Integer value) {
            addCriterion("link_rating >=", value, "linkRating");
            return (Criteria) this;
        }

        /**
         * And link rating less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkRatingLessThan(Integer value) {
            addCriterion("link_rating <", value, "linkRating");
            return (Criteria) this;
        }

        /**
         * And link rating less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkRatingLessThanOrEqualTo(Integer value) {
            addCriterion("link_rating <=", value, "linkRating");
            return (Criteria) this;
        }

        /**
         * And link rating in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLinkRatingIn(List<Integer> values) {
            addCriterion("link_rating in", values, "linkRating");
            return (Criteria) this;
        }

        /**
         * And link rating not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLinkRatingNotIn(List<Integer> values) {
            addCriterion("link_rating not in", values, "linkRating");
            return (Criteria) this;
        }

        /**
         * And link rating between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLinkRatingBetween(Integer value1, Integer value2) {
            addCriterion("link_rating between", value1, value2, "linkRating");
            return (Criteria) this;
        }

        /**
         * And link rating not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLinkRatingNotBetween(Integer value1, Integer value2) {
            addCriterion("link_rating not between", value1, value2, "linkRating");
            return (Criteria) this;
        }

        /**
         * And link updated is null criteria.
         *
         * @return the criteria
         */
        public Criteria andLinkUpdatedIsNull() {
            addCriterion("link_updated is null");
            return (Criteria) this;
        }

        /**
         * And link updated is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andLinkUpdatedIsNotNull() {
            addCriterion("link_updated is not null");
            return (Criteria) this;
        }

        /**
         * And link updated equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkUpdatedEqualTo(Date value) {
            addCriterion("link_updated =", value, "linkUpdated");
            return (Criteria) this;
        }

        /**
         * And link updated not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkUpdatedNotEqualTo(Date value) {
            addCriterion("link_updated <>", value, "linkUpdated");
            return (Criteria) this;
        }

        /**
         * And link updated greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkUpdatedGreaterThan(Date value) {
            addCriterion("link_updated >", value, "linkUpdated");
            return (Criteria) this;
        }

        /**
         * And link updated greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("link_updated >=", value, "linkUpdated");
            return (Criteria) this;
        }

        /**
         * And link updated less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkUpdatedLessThan(Date value) {
            addCriterion("link_updated <", value, "linkUpdated");
            return (Criteria) this;
        }

        /**
         * And link updated less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("link_updated <=", value, "linkUpdated");
            return (Criteria) this;
        }

        /**
         * And link updated in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLinkUpdatedIn(List<Date> values) {
            addCriterion("link_updated in", values, "linkUpdated");
            return (Criteria) this;
        }

        /**
         * And link updated not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLinkUpdatedNotIn(List<Date> values) {
            addCriterion("link_updated not in", values, "linkUpdated");
            return (Criteria) this;
        }

        /**
         * And link updated between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLinkUpdatedBetween(Date value1, Date value2) {
            addCriterion("link_updated between", value1, value2, "linkUpdated");
            return (Criteria) this;
        }

        /**
         * And link updated not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLinkUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("link_updated not between", value1, value2, "linkUpdated");
            return (Criteria) this;
        }

        /**
         * And link rel is null criteria.
         *
         * @return the criteria
         */
        public Criteria andLinkRelIsNull() {
            addCriterion("link_rel is null");
            return (Criteria) this;
        }

        /**
         * And link rel is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andLinkRelIsNotNull() {
            addCriterion("link_rel is not null");
            return (Criteria) this;
        }

        /**
         * And link rel equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkRelEqualTo(String value) {
            addCriterion("link_rel =", value, "linkRel");
            return (Criteria) this;
        }

        /**
         * And link rel not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkRelNotEqualTo(String value) {
            addCriterion("link_rel <>", value, "linkRel");
            return (Criteria) this;
        }

        /**
         * And link rel greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkRelGreaterThan(String value) {
            addCriterion("link_rel >", value, "linkRel");
            return (Criteria) this;
        }

        /**
         * And link rel greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkRelGreaterThanOrEqualTo(String value) {
            addCriterion("link_rel >=", value, "linkRel");
            return (Criteria) this;
        }

        /**
         * And link rel less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkRelLessThan(String value) {
            addCriterion("link_rel <", value, "linkRel");
            return (Criteria) this;
        }

        /**
         * And link rel less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkRelLessThanOrEqualTo(String value) {
            addCriterion("link_rel <=", value, "linkRel");
            return (Criteria) this;
        }

        /**
         * And link rel like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkRelLike(String value) {
            addCriterion("link_rel like", value, "linkRel");
            return (Criteria) this;
        }

        /**
         * And link rel not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkRelNotLike(String value) {
            addCriterion("link_rel not like", value, "linkRel");
            return (Criteria) this;
        }

        /**
         * And link rel in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLinkRelIn(List<String> values) {
            addCriterion("link_rel in", values, "linkRel");
            return (Criteria) this;
        }

        /**
         * And link rel not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLinkRelNotIn(List<String> values) {
            addCriterion("link_rel not in", values, "linkRel");
            return (Criteria) this;
        }

        /**
         * And link rel between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLinkRelBetween(String value1, String value2) {
            addCriterion("link_rel between", value1, value2, "linkRel");
            return (Criteria) this;
        }

        /**
         * And link rel not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLinkRelNotBetween(String value1, String value2) {
            addCriterion("link_rel not between", value1, value2, "linkRel");
            return (Criteria) this;
        }

        /**
         * And link rss is null criteria.
         *
         * @return the criteria
         */
        public Criteria andLinkRssIsNull() {
            addCriterion("link_rss is null");
            return (Criteria) this;
        }

        /**
         * And link rss is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andLinkRssIsNotNull() {
            addCriterion("link_rss is not null");
            return (Criteria) this;
        }

        /**
         * And link rss equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkRssEqualTo(String value) {
            addCriterion("link_rss =", value, "linkRss");
            return (Criteria) this;
        }

        /**
         * And link rss not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkRssNotEqualTo(String value) {
            addCriterion("link_rss <>", value, "linkRss");
            return (Criteria) this;
        }

        /**
         * And link rss greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkRssGreaterThan(String value) {
            addCriterion("link_rss >", value, "linkRss");
            return (Criteria) this;
        }

        /**
         * And link rss greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkRssGreaterThanOrEqualTo(String value) {
            addCriterion("link_rss >=", value, "linkRss");
            return (Criteria) this;
        }

        /**
         * And link rss less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkRssLessThan(String value) {
            addCriterion("link_rss <", value, "linkRss");
            return (Criteria) this;
        }

        /**
         * And link rss less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkRssLessThanOrEqualTo(String value) {
            addCriterion("link_rss <=", value, "linkRss");
            return (Criteria) this;
        }

        /**
         * And link rss like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkRssLike(String value) {
            addCriterion("link_rss like", value, "linkRss");
            return (Criteria) this;
        }

        /**
         * And link rss not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLinkRssNotLike(String value) {
            addCriterion("link_rss not like", value, "linkRss");
            return (Criteria) this;
        }

        /**
         * And link rss in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLinkRssIn(List<String> values) {
            addCriterion("link_rss in", values, "linkRss");
            return (Criteria) this;
        }

        /**
         * And link rss not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLinkRssNotIn(List<String> values) {
            addCriterion("link_rss not in", values, "linkRss");
            return (Criteria) this;
        }

        /**
         * And link rss between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLinkRssBetween(String value1, String value2) {
            addCriterion("link_rss between", value1, value2, "linkRss");
            return (Criteria) this;
        }

        /**
         * And link rss not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLinkRssNotBetween(String value1, String value2) {
            addCriterion("link_rss not between", value1, value2, "linkRss");
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