package com.ihowq.wordpress.api.model.pojo.post;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The type Post query.
 */
public class PostQuery {
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
     * Instantiates a new Post query.
     */
    public PostQuery() {
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
         * And id is null criteria.
         *
         * @return the criteria
         */
        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        /**
         * And id is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        /**
         * And id equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        /**
         * And id not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        /**
         * And id greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        /**
         * And id greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        /**
         * And id less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        /**
         * And id less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        /**
         * And id in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        /**
         * And id not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        /**
         * And id between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        /**
         * And id not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        /**
         * And post author is null criteria.
         *
         * @return the criteria
         */
        public Criteria andPostAuthorIsNull() {
            addCriterion("post_author is null");
            return (Criteria) this;
        }

        /**
         * And post author is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andPostAuthorIsNotNull() {
            addCriterion("post_author is not null");
            return (Criteria) this;
        }

        /**
         * And post author equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostAuthorEqualTo(Long value) {
            addCriterion("post_author =", value, "postAuthor");
            return (Criteria) this;
        }

        /**
         * And post author not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostAuthorNotEqualTo(Long value) {
            addCriterion("post_author <>", value, "postAuthor");
            return (Criteria) this;
        }

        /**
         * And post author greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostAuthorGreaterThan(Long value) {
            addCriterion("post_author >", value, "postAuthor");
            return (Criteria) this;
        }

        /**
         * And post author greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostAuthorGreaterThanOrEqualTo(Long value) {
            addCriterion("post_author >=", value, "postAuthor");
            return (Criteria) this;
        }

        /**
         * And post author less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostAuthorLessThan(Long value) {
            addCriterion("post_author <", value, "postAuthor");
            return (Criteria) this;
        }

        /**
         * And post author less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostAuthorLessThanOrEqualTo(Long value) {
            addCriterion("post_author <=", value, "postAuthor");
            return (Criteria) this;
        }

        /**
         * And post author in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPostAuthorIn(List<Long> values) {
            addCriterion("post_author in", values, "postAuthor");
            return (Criteria) this;
        }

        /**
         * And post author not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPostAuthorNotIn(List<Long> values) {
            addCriterion("post_author not in", values, "postAuthor");
            return (Criteria) this;
        }

        /**
         * And post author between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPostAuthorBetween(Long value1, Long value2) {
            addCriterion("post_author between", value1, value2, "postAuthor");
            return (Criteria) this;
        }

        /**
         * And post author not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPostAuthorNotBetween(Long value1, Long value2) {
            addCriterion("post_author not between", value1, value2, "postAuthor");
            return (Criteria) this;
        }

        /**
         * And post date is null criteria.
         *
         * @return the criteria
         */
        public Criteria andPostDateIsNull() {
            addCriterion("post_date is null");
            return (Criteria) this;
        }

        /**
         * And post date is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andPostDateIsNotNull() {
            addCriterion("post_date is not null");
            return (Criteria) this;
        }

        /**
         * And post date equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostDateEqualTo(Date value) {
            addCriterion("post_date =", value, "postDate");
            return (Criteria) this;
        }

        /**
         * And post date not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostDateNotEqualTo(Date value) {
            addCriterion("post_date <>", value, "postDate");
            return (Criteria) this;
        }

        /**
         * And post date greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostDateGreaterThan(Date value) {
            addCriterion("post_date >", value, "postDate");
            return (Criteria) this;
        }

        /**
         * And post date greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostDateGreaterThanOrEqualTo(Date value) {
            addCriterion("post_date >=", value, "postDate");
            return (Criteria) this;
        }

        /**
         * And post date less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostDateLessThan(Date value) {
            addCriterion("post_date <", value, "postDate");
            return (Criteria) this;
        }

        /**
         * And post date less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostDateLessThanOrEqualTo(Date value) {
            addCriterion("post_date <=", value, "postDate");
            return (Criteria) this;
        }

        /**
         * And post date in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPostDateIn(List<Date> values) {
            addCriterion("post_date in", values, "postDate");
            return (Criteria) this;
        }

        /**
         * And post date not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPostDateNotIn(List<Date> values) {
            addCriterion("post_date not in", values, "postDate");
            return (Criteria) this;
        }

        /**
         * And post date between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPostDateBetween(Date value1, Date value2) {
            addCriterion("post_date between", value1, value2, "postDate");
            return (Criteria) this;
        }

        /**
         * And post date not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPostDateNotBetween(Date value1, Date value2) {
            addCriterion("post_date not between", value1, value2, "postDate");
            return (Criteria) this;
        }

        /**
         * And post date gmt is null criteria.
         *
         * @return the criteria
         */
        public Criteria andPostDateGmtIsNull() {
            addCriterion("post_date_gmt is null");
            return (Criteria) this;
        }

        /**
         * And post date gmt is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andPostDateGmtIsNotNull() {
            addCriterion("post_date_gmt is not null");
            return (Criteria) this;
        }

        /**
         * And post date gmt equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostDateGmtEqualTo(Date value) {
            addCriterion("post_date_gmt =", value, "postDateGmt");
            return (Criteria) this;
        }

        /**
         * And post date gmt not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostDateGmtNotEqualTo(Date value) {
            addCriterion("post_date_gmt <>", value, "postDateGmt");
            return (Criteria) this;
        }

        /**
         * And post date gmt greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostDateGmtGreaterThan(Date value) {
            addCriterion("post_date_gmt >", value, "postDateGmt");
            return (Criteria) this;
        }

        /**
         * And post date gmt greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostDateGmtGreaterThanOrEqualTo(Date value) {
            addCriterion("post_date_gmt >=", value, "postDateGmt");
            return (Criteria) this;
        }

        /**
         * And post date gmt less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostDateGmtLessThan(Date value) {
            addCriterion("post_date_gmt <", value, "postDateGmt");
            return (Criteria) this;
        }

        /**
         * And post date gmt less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostDateGmtLessThanOrEqualTo(Date value) {
            addCriterion("post_date_gmt <=", value, "postDateGmt");
            return (Criteria) this;
        }

        /**
         * And post date gmt in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPostDateGmtIn(List<Date> values) {
            addCriterion("post_date_gmt in", values, "postDateGmt");
            return (Criteria) this;
        }

        /**
         * And post date gmt not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPostDateGmtNotIn(List<Date> values) {
            addCriterion("post_date_gmt not in", values, "postDateGmt");
            return (Criteria) this;
        }

        /**
         * And post date gmt between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPostDateGmtBetween(Date value1, Date value2) {
            addCriterion("post_date_gmt between", value1, value2, "postDateGmt");
            return (Criteria) this;
        }

        /**
         * And post date gmt not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPostDateGmtNotBetween(Date value1, Date value2) {
            addCriterion("post_date_gmt not between", value1, value2, "postDateGmt");
            return (Criteria) this;
        }

        /**
         * And post status is null criteria.
         *
         * @return the criteria
         */
        public Criteria andPostStatusIsNull() {
            addCriterion("post_status is null");
            return (Criteria) this;
        }

        /**
         * And post status is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andPostStatusIsNotNull() {
            addCriterion("post_status is not null");
            return (Criteria) this;
        }

        /**
         * And post status equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostStatusEqualTo(String value) {
            addCriterion("post_status =", value, "postStatus");
            return (Criteria) this;
        }

        /**
         * And post status not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostStatusNotEqualTo(String value) {
            addCriterion("post_status <>", value, "postStatus");
            return (Criteria) this;
        }

        /**
         * And post status greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostStatusGreaterThan(String value) {
            addCriterion("post_status >", value, "postStatus");
            return (Criteria) this;
        }

        /**
         * And post status greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostStatusGreaterThanOrEqualTo(String value) {
            addCriterion("post_status >=", value, "postStatus");
            return (Criteria) this;
        }

        /**
         * And post status less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostStatusLessThan(String value) {
            addCriterion("post_status <", value, "postStatus");
            return (Criteria) this;
        }

        /**
         * And post status less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostStatusLessThanOrEqualTo(String value) {
            addCriterion("post_status <=", value, "postStatus");
            return (Criteria) this;
        }

        /**
         * And post status like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostStatusLike(String value) {
            addCriterion("post_status like", value, "postStatus");
            return (Criteria) this;
        }

        /**
         * And post status not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostStatusNotLike(String value) {
            addCriterion("post_status not like", value, "postStatus");
            return (Criteria) this;
        }

        /**
         * And post status in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPostStatusIn(List<String> values) {
            addCriterion("post_status in", values, "postStatus");
            return (Criteria) this;
        }

        /**
         * And post status not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPostStatusNotIn(List<String> values) {
            addCriterion("post_status not in", values, "postStatus");
            return (Criteria) this;
        }

        /**
         * And post status between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPostStatusBetween(String value1, String value2) {
            addCriterion("post_status between", value1, value2, "postStatus");
            return (Criteria) this;
        }

        /**
         * And post status not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPostStatusNotBetween(String value1, String value2) {
            addCriterion("post_status not between", value1, value2, "postStatus");
            return (Criteria) this;
        }

        /**
         * And comment status is null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentStatusIsNull() {
            addCriterion("comment_status is null");
            return (Criteria) this;
        }

        /**
         * And comment status is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentStatusIsNotNull() {
            addCriterion("comment_status is not null");
            return (Criteria) this;
        }

        /**
         * And comment status equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentStatusEqualTo(String value) {
            addCriterion("comment_status =", value, "commentStatus");
            return (Criteria) this;
        }

        /**
         * And comment status not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentStatusNotEqualTo(String value) {
            addCriterion("comment_status <>", value, "commentStatus");
            return (Criteria) this;
        }

        /**
         * And comment status greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentStatusGreaterThan(String value) {
            addCriterion("comment_status >", value, "commentStatus");
            return (Criteria) this;
        }

        /**
         * And comment status greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("comment_status >=", value, "commentStatus");
            return (Criteria) this;
        }

        /**
         * And comment status less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentStatusLessThan(String value) {
            addCriterion("comment_status <", value, "commentStatus");
            return (Criteria) this;
        }

        /**
         * And comment status less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentStatusLessThanOrEqualTo(String value) {
            addCriterion("comment_status <=", value, "commentStatus");
            return (Criteria) this;
        }

        /**
         * And comment status like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentStatusLike(String value) {
            addCriterion("comment_status like", value, "commentStatus");
            return (Criteria) this;
        }

        /**
         * And comment status not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentStatusNotLike(String value) {
            addCriterion("comment_status not like", value, "commentStatus");
            return (Criteria) this;
        }

        /**
         * And comment status in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentStatusIn(List<String> values) {
            addCriterion("comment_status in", values, "commentStatus");
            return (Criteria) this;
        }

        /**
         * And comment status not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentStatusNotIn(List<String> values) {
            addCriterion("comment_status not in", values, "commentStatus");
            return (Criteria) this;
        }

        /**
         * And comment status between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentStatusBetween(String value1, String value2) {
            addCriterion("comment_status between", value1, value2, "commentStatus");
            return (Criteria) this;
        }

        /**
         * And comment status not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentStatusNotBetween(String value1, String value2) {
            addCriterion("comment_status not between", value1, value2, "commentStatus");
            return (Criteria) this;
        }

        /**
         * And ping status is null criteria.
         *
         * @return the criteria
         */
        public Criteria andPingStatusIsNull() {
            addCriterion("ping_status is null");
            return (Criteria) this;
        }

        /**
         * And ping status is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andPingStatusIsNotNull() {
            addCriterion("ping_status is not null");
            return (Criteria) this;
        }

        /**
         * And ping status equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPingStatusEqualTo(String value) {
            addCriterion("ping_status =", value, "pingStatus");
            return (Criteria) this;
        }

        /**
         * And ping status not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPingStatusNotEqualTo(String value) {
            addCriterion("ping_status <>", value, "pingStatus");
            return (Criteria) this;
        }

        /**
         * And ping status greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPingStatusGreaterThan(String value) {
            addCriterion("ping_status >", value, "pingStatus");
            return (Criteria) this;
        }

        /**
         * And ping status greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPingStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ping_status >=", value, "pingStatus");
            return (Criteria) this;
        }

        /**
         * And ping status less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPingStatusLessThan(String value) {
            addCriterion("ping_status <", value, "pingStatus");
            return (Criteria) this;
        }

        /**
         * And ping status less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPingStatusLessThanOrEqualTo(String value) {
            addCriterion("ping_status <=", value, "pingStatus");
            return (Criteria) this;
        }

        /**
         * And ping status like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPingStatusLike(String value) {
            addCriterion("ping_status like", value, "pingStatus");
            return (Criteria) this;
        }

        /**
         * And ping status not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPingStatusNotLike(String value) {
            addCriterion("ping_status not like", value, "pingStatus");
            return (Criteria) this;
        }

        /**
         * And ping status in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPingStatusIn(List<String> values) {
            addCriterion("ping_status in", values, "pingStatus");
            return (Criteria) this;
        }

        /**
         * And ping status not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPingStatusNotIn(List<String> values) {
            addCriterion("ping_status not in", values, "pingStatus");
            return (Criteria) this;
        }

        /**
         * And ping status between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPingStatusBetween(String value1, String value2) {
            addCriterion("ping_status between", value1, value2, "pingStatus");
            return (Criteria) this;
        }

        /**
         * And ping status not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPingStatusNotBetween(String value1, String value2) {
            addCriterion("ping_status not between", value1, value2, "pingStatus");
            return (Criteria) this;
        }

        /**
         * And post password is null criteria.
         *
         * @return the criteria
         */
        public Criteria andPostPasswordIsNull() {
            addCriterion("post_password is null");
            return (Criteria) this;
        }

        /**
         * And post password is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andPostPasswordIsNotNull() {
            addCriterion("post_password is not null");
            return (Criteria) this;
        }

        /**
         * And post password equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostPasswordEqualTo(String value) {
            addCriterion("post_password =", value, "postPassword");
            return (Criteria) this;
        }

        /**
         * And post password not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostPasswordNotEqualTo(String value) {
            addCriterion("post_password <>", value, "postPassword");
            return (Criteria) this;
        }

        /**
         * And post password greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostPasswordGreaterThan(String value) {
            addCriterion("post_password >", value, "postPassword");
            return (Criteria) this;
        }

        /**
         * And post password greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("post_password >=", value, "postPassword");
            return (Criteria) this;
        }

        /**
         * And post password less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostPasswordLessThan(String value) {
            addCriterion("post_password <", value, "postPassword");
            return (Criteria) this;
        }

        /**
         * And post password less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostPasswordLessThanOrEqualTo(String value) {
            addCriterion("post_password <=", value, "postPassword");
            return (Criteria) this;
        }

        /**
         * And post password like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostPasswordLike(String value) {
            addCriterion("post_password like", value, "postPassword");
            return (Criteria) this;
        }

        /**
         * And post password not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostPasswordNotLike(String value) {
            addCriterion("post_password not like", value, "postPassword");
            return (Criteria) this;
        }

        /**
         * And post password in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPostPasswordIn(List<String> values) {
            addCriterion("post_password in", values, "postPassword");
            return (Criteria) this;
        }

        /**
         * And post password not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPostPasswordNotIn(List<String> values) {
            addCriterion("post_password not in", values, "postPassword");
            return (Criteria) this;
        }

        /**
         * And post password between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPostPasswordBetween(String value1, String value2) {
            addCriterion("post_password between", value1, value2, "postPassword");
            return (Criteria) this;
        }

        /**
         * And post password not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPostPasswordNotBetween(String value1, String value2) {
            addCriterion("post_password not between", value1, value2, "postPassword");
            return (Criteria) this;
        }

        /**
         * And post name is null criteria.
         *
         * @return the criteria
         */
        public Criteria andPostNameIsNull() {
            addCriterion("post_name is null");
            return (Criteria) this;
        }

        /**
         * And post name is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andPostNameIsNotNull() {
            addCriterion("post_name is not null");
            return (Criteria) this;
        }

        /**
         * And post name equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostNameEqualTo(String value) {
            addCriterion("post_name =", value, "postName");
            return (Criteria) this;
        }

        /**
         * And post name not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostNameNotEqualTo(String value) {
            addCriterion("post_name <>", value, "postName");
            return (Criteria) this;
        }

        /**
         * And post name greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostNameGreaterThan(String value) {
            addCriterion("post_name >", value, "postName");
            return (Criteria) this;
        }

        /**
         * And post name greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostNameGreaterThanOrEqualTo(String value) {
            addCriterion("post_name >=", value, "postName");
            return (Criteria) this;
        }

        /**
         * And post name less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostNameLessThan(String value) {
            addCriterion("post_name <", value, "postName");
            return (Criteria) this;
        }

        /**
         * And post name less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostNameLessThanOrEqualTo(String value) {
            addCriterion("post_name <=", value, "postName");
            return (Criteria) this;
        }

        /**
         * And post name like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostNameLike(String value) {
            addCriterion("post_name like", value, "postName");
            return (Criteria) this;
        }

        /**
         * And post name not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostNameNotLike(String value) {
            addCriterion("post_name not like", value, "postName");
            return (Criteria) this;
        }

        /**
         * And post name in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPostNameIn(List<String> values) {
            addCriterion("post_name in", values, "postName");
            return (Criteria) this;
        }

        /**
         * And post name not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPostNameNotIn(List<String> values) {
            addCriterion("post_name not in", values, "postName");
            return (Criteria) this;
        }

        /**
         * And post name between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPostNameBetween(String value1, String value2) {
            addCriterion("post_name between", value1, value2, "postName");
            return (Criteria) this;
        }

        /**
         * And post name not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPostNameNotBetween(String value1, String value2) {
            addCriterion("post_name not between", value1, value2, "postName");
            return (Criteria) this;
        }

        /**
         * And post modified is null criteria.
         *
         * @return the criteria
         */
        public Criteria andPostModifiedIsNull() {
            addCriterion("post_modified is null");
            return (Criteria) this;
        }

        /**
         * And post modified is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andPostModifiedIsNotNull() {
            addCriterion("post_modified is not null");
            return (Criteria) this;
        }

        /**
         * And post modified equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostModifiedEqualTo(Date value) {
            addCriterion("post_modified =", value, "postModified");
            return (Criteria) this;
        }

        /**
         * And post modified not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostModifiedNotEqualTo(Date value) {
            addCriterion("post_modified <>", value, "postModified");
            return (Criteria) this;
        }

        /**
         * And post modified greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostModifiedGreaterThan(Date value) {
            addCriterion("post_modified >", value, "postModified");
            return (Criteria) this;
        }

        /**
         * And post modified greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("post_modified >=", value, "postModified");
            return (Criteria) this;
        }

        /**
         * And post modified less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostModifiedLessThan(Date value) {
            addCriterion("post_modified <", value, "postModified");
            return (Criteria) this;
        }

        /**
         * And post modified less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostModifiedLessThanOrEqualTo(Date value) {
            addCriterion("post_modified <=", value, "postModified");
            return (Criteria) this;
        }

        /**
         * And post modified in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPostModifiedIn(List<Date> values) {
            addCriterion("post_modified in", values, "postModified");
            return (Criteria) this;
        }

        /**
         * And post modified not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPostModifiedNotIn(List<Date> values) {
            addCriterion("post_modified not in", values, "postModified");
            return (Criteria) this;
        }

        /**
         * And post modified between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPostModifiedBetween(Date value1, Date value2) {
            addCriterion("post_modified between", value1, value2, "postModified");
            return (Criteria) this;
        }

        /**
         * And post modified not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPostModifiedNotBetween(Date value1, Date value2) {
            addCriterion("post_modified not between", value1, value2, "postModified");
            return (Criteria) this;
        }

        /**
         * And post modified gmt is null criteria.
         *
         * @return the criteria
         */
        public Criteria andPostModifiedGmtIsNull() {
            addCriterion("post_modified_gmt is null");
            return (Criteria) this;
        }

        /**
         * And post modified gmt is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andPostModifiedGmtIsNotNull() {
            addCriterion("post_modified_gmt is not null");
            return (Criteria) this;
        }

        /**
         * And post modified gmt equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostModifiedGmtEqualTo(Date value) {
            addCriterion("post_modified_gmt =", value, "postModifiedGmt");
            return (Criteria) this;
        }

        /**
         * And post modified gmt not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostModifiedGmtNotEqualTo(Date value) {
            addCriterion("post_modified_gmt <>", value, "postModifiedGmt");
            return (Criteria) this;
        }

        /**
         * And post modified gmt greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostModifiedGmtGreaterThan(Date value) {
            addCriterion("post_modified_gmt >", value, "postModifiedGmt");
            return (Criteria) this;
        }

        /**
         * And post modified gmt greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostModifiedGmtGreaterThanOrEqualTo(Date value) {
            addCriterion("post_modified_gmt >=", value, "postModifiedGmt");
            return (Criteria) this;
        }

        /**
         * And post modified gmt less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostModifiedGmtLessThan(Date value) {
            addCriterion("post_modified_gmt <", value, "postModifiedGmt");
            return (Criteria) this;
        }

        /**
         * And post modified gmt less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostModifiedGmtLessThanOrEqualTo(Date value) {
            addCriterion("post_modified_gmt <=", value, "postModifiedGmt");
            return (Criteria) this;
        }

        /**
         * And post modified gmt in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPostModifiedGmtIn(List<Date> values) {
            addCriterion("post_modified_gmt in", values, "postModifiedGmt");
            return (Criteria) this;
        }

        /**
         * And post modified gmt not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPostModifiedGmtNotIn(List<Date> values) {
            addCriterion("post_modified_gmt not in", values, "postModifiedGmt");
            return (Criteria) this;
        }

        /**
         * And post modified gmt between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPostModifiedGmtBetween(Date value1, Date value2) {
            addCriterion("post_modified_gmt between", value1, value2, "postModifiedGmt");
            return (Criteria) this;
        }

        /**
         * And post modified gmt not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPostModifiedGmtNotBetween(Date value1, Date value2) {
            addCriterion("post_modified_gmt not between", value1, value2, "postModifiedGmt");
            return (Criteria) this;
        }

        /**
         * And post parent is null criteria.
         *
         * @return the criteria
         */
        public Criteria andPostParentIsNull() {
            addCriterion("post_parent is null");
            return (Criteria) this;
        }

        /**
         * And post parent is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andPostParentIsNotNull() {
            addCriterion("post_parent is not null");
            return (Criteria) this;
        }

        /**
         * And post parent equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostParentEqualTo(Long value) {
            addCriterion("post_parent =", value, "postParent");
            return (Criteria) this;
        }

        /**
         * And post parent not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostParentNotEqualTo(Long value) {
            addCriterion("post_parent <>", value, "postParent");
            return (Criteria) this;
        }

        /**
         * And post parent greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostParentGreaterThan(Long value) {
            addCriterion("post_parent >", value, "postParent");
            return (Criteria) this;
        }

        /**
         * And post parent greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostParentGreaterThanOrEqualTo(Long value) {
            addCriterion("post_parent >=", value, "postParent");
            return (Criteria) this;
        }

        /**
         * And post parent less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostParentLessThan(Long value) {
            addCriterion("post_parent <", value, "postParent");
            return (Criteria) this;
        }

        /**
         * And post parent less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostParentLessThanOrEqualTo(Long value) {
            addCriterion("post_parent <=", value, "postParent");
            return (Criteria) this;
        }

        /**
         * And post parent in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPostParentIn(List<Long> values) {
            addCriterion("post_parent in", values, "postParent");
            return (Criteria) this;
        }

        /**
         * And post parent not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPostParentNotIn(List<Long> values) {
            addCriterion("post_parent not in", values, "postParent");
            return (Criteria) this;
        }

        /**
         * And post parent between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPostParentBetween(Long value1, Long value2) {
            addCriterion("post_parent between", value1, value2, "postParent");
            return (Criteria) this;
        }

        /**
         * And post parent not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPostParentNotBetween(Long value1, Long value2) {
            addCriterion("post_parent not between", value1, value2, "postParent");
            return (Criteria) this;
        }

        /**
         * And guid is null criteria.
         *
         * @return the criteria
         */
        public Criteria andGuidIsNull() {
            addCriterion("guid is null");
            return (Criteria) this;
        }

        /**
         * And guid is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andGuidIsNotNull() {
            addCriterion("guid is not null");
            return (Criteria) this;
        }

        /**
         * And guid equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andGuidEqualTo(String value) {
            addCriterion("guid =", value, "guid");
            return (Criteria) this;
        }

        /**
         * And guid not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andGuidNotEqualTo(String value) {
            addCriterion("guid <>", value, "guid");
            return (Criteria) this;
        }

        /**
         * And guid greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andGuidGreaterThan(String value) {
            addCriterion("guid >", value, "guid");
            return (Criteria) this;
        }

        /**
         * And guid greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andGuidGreaterThanOrEqualTo(String value) {
            addCriterion("guid >=", value, "guid");
            return (Criteria) this;
        }

        /**
         * And guid less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andGuidLessThan(String value) {
            addCriterion("guid <", value, "guid");
            return (Criteria) this;
        }

        /**
         * And guid less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andGuidLessThanOrEqualTo(String value) {
            addCriterion("guid <=", value, "guid");
            return (Criteria) this;
        }

        /**
         * And guid like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andGuidLike(String value) {
            addCriterion("guid like", value, "guid");
            return (Criteria) this;
        }

        /**
         * And guid not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andGuidNotLike(String value) {
            addCriterion("guid not like", value, "guid");
            return (Criteria) this;
        }

        /**
         * And guid in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andGuidIn(List<String> values) {
            addCriterion("guid in", values, "guid");
            return (Criteria) this;
        }

        /**
         * And guid not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andGuidNotIn(List<String> values) {
            addCriterion("guid not in", values, "guid");
            return (Criteria) this;
        }

        /**
         * And guid between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andGuidBetween(String value1, String value2) {
            addCriterion("guid between", value1, value2, "guid");
            return (Criteria) this;
        }

        /**
         * And guid not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andGuidNotBetween(String value1, String value2) {
            addCriterion("guid not between", value1, value2, "guid");
            return (Criteria) this;
        }

        /**
         * And menu order is null criteria.
         *
         * @return the criteria
         */
        public Criteria andMenuOrderIsNull() {
            addCriterion("menu_order is null");
            return (Criteria) this;
        }

        /**
         * And menu order is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andMenuOrderIsNotNull() {
            addCriterion("menu_order is not null");
            return (Criteria) this;
        }

        /**
         * And menu order equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andMenuOrderEqualTo(Integer value) {
            addCriterion("menu_order =", value, "menuOrder");
            return (Criteria) this;
        }

        /**
         * And menu order not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andMenuOrderNotEqualTo(Integer value) {
            addCriterion("menu_order <>", value, "menuOrder");
            return (Criteria) this;
        }

        /**
         * And menu order greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andMenuOrderGreaterThan(Integer value) {
            addCriterion("menu_order >", value, "menuOrder");
            return (Criteria) this;
        }

        /**
         * And menu order greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andMenuOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_order >=", value, "menuOrder");
            return (Criteria) this;
        }

        /**
         * And menu order less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andMenuOrderLessThan(Integer value) {
            addCriterion("menu_order <", value, "menuOrder");
            return (Criteria) this;
        }

        /**
         * And menu order less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andMenuOrderLessThanOrEqualTo(Integer value) {
            addCriterion("menu_order <=", value, "menuOrder");
            return (Criteria) this;
        }

        /**
         * And menu order in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andMenuOrderIn(List<Integer> values) {
            addCriterion("menu_order in", values, "menuOrder");
            return (Criteria) this;
        }

        /**
         * And menu order not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andMenuOrderNotIn(List<Integer> values) {
            addCriterion("menu_order not in", values, "menuOrder");
            return (Criteria) this;
        }

        /**
         * And menu order between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andMenuOrderBetween(Integer value1, Integer value2) {
            addCriterion("menu_order between", value1, value2, "menuOrder");
            return (Criteria) this;
        }

        /**
         * And menu order not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andMenuOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_order not between", value1, value2, "menuOrder");
            return (Criteria) this;
        }

        /**
         * And post type is null criteria.
         *
         * @return the criteria
         */
        public Criteria andPostTypeIsNull() {
            addCriterion("post_type is null");
            return (Criteria) this;
        }

        /**
         * And post type is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andPostTypeIsNotNull() {
            addCriterion("post_type is not null");
            return (Criteria) this;
        }

        /**
         * And post type equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostTypeEqualTo(String value) {
            addCriterion("post_type =", value, "postType");
            return (Criteria) this;
        }

        /**
         * And post type not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostTypeNotEqualTo(String value) {
            addCriterion("post_type <>", value, "postType");
            return (Criteria) this;
        }

        /**
         * And post type greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostTypeGreaterThan(String value) {
            addCriterion("post_type >", value, "postType");
            return (Criteria) this;
        }

        /**
         * And post type greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostTypeGreaterThanOrEqualTo(String value) {
            addCriterion("post_type >=", value, "postType");
            return (Criteria) this;
        }

        /**
         * And post type less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostTypeLessThan(String value) {
            addCriterion("post_type <", value, "postType");
            return (Criteria) this;
        }

        /**
         * And post type less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostTypeLessThanOrEqualTo(String value) {
            addCriterion("post_type <=", value, "postType");
            return (Criteria) this;
        }

        /**
         * And post type like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostTypeLike(String value) {
            addCriterion("post_type like", value, "postType");
            return (Criteria) this;
        }

        /**
         * And post type not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostTypeNotLike(String value) {
            addCriterion("post_type not like", value, "postType");
            return (Criteria) this;
        }

        /**
         * And post type in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPostTypeIn(List<String> values) {
            addCriterion("post_type in", values, "postType");
            return (Criteria) this;
        }

        /**
         * And post type not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPostTypeNotIn(List<String> values) {
            addCriterion("post_type not in", values, "postType");
            return (Criteria) this;
        }

        /**
         * And post type between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPostTypeBetween(String value1, String value2) {
            addCriterion("post_type between", value1, value2, "postType");
            return (Criteria) this;
        }

        /**
         * And post type not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPostTypeNotBetween(String value1, String value2) {
            addCriterion("post_type not between", value1, value2, "postType");
            return (Criteria) this;
        }

        /**
         * And post mime type is null criteria.
         *
         * @return the criteria
         */
        public Criteria andPostMimeTypeIsNull() {
            addCriterion("post_mime_type is null");
            return (Criteria) this;
        }

        /**
         * And post mime type is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andPostMimeTypeIsNotNull() {
            addCriterion("post_mime_type is not null");
            return (Criteria) this;
        }

        /**
         * And post mime type equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostMimeTypeEqualTo(String value) {
            addCriterion("post_mime_type =", value, "postMimeType");
            return (Criteria) this;
        }

        /**
         * And post mime type not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostMimeTypeNotEqualTo(String value) {
            addCriterion("post_mime_type <>", value, "postMimeType");
            return (Criteria) this;
        }

        /**
         * And post mime type greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostMimeTypeGreaterThan(String value) {
            addCriterion("post_mime_type >", value, "postMimeType");
            return (Criteria) this;
        }

        /**
         * And post mime type greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostMimeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("post_mime_type >=", value, "postMimeType");
            return (Criteria) this;
        }

        /**
         * And post mime type less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostMimeTypeLessThan(String value) {
            addCriterion("post_mime_type <", value, "postMimeType");
            return (Criteria) this;
        }

        /**
         * And post mime type less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostMimeTypeLessThanOrEqualTo(String value) {
            addCriterion("post_mime_type <=", value, "postMimeType");
            return (Criteria) this;
        }

        /**
         * And post mime type like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostMimeTypeLike(String value) {
            addCriterion("post_mime_type like", value, "postMimeType");
            return (Criteria) this;
        }

        /**
         * And post mime type not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPostMimeTypeNotLike(String value) {
            addCriterion("post_mime_type not like", value, "postMimeType");
            return (Criteria) this;
        }

        /**
         * And post mime type in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPostMimeTypeIn(List<String> values) {
            addCriterion("post_mime_type in", values, "postMimeType");
            return (Criteria) this;
        }

        /**
         * And post mime type not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPostMimeTypeNotIn(List<String> values) {
            addCriterion("post_mime_type not in", values, "postMimeType");
            return (Criteria) this;
        }

        /**
         * And post mime type between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPostMimeTypeBetween(String value1, String value2) {
            addCriterion("post_mime_type between", value1, value2, "postMimeType");
            return (Criteria) this;
        }

        /**
         * And post mime type not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPostMimeTypeNotBetween(String value1, String value2) {
            addCriterion("post_mime_type not between", value1, value2, "postMimeType");
            return (Criteria) this;
        }

        /**
         * And comment count is null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentCountIsNull() {
            addCriterion("comment_count is null");
            return (Criteria) this;
        }

        /**
         * And comment count is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentCountIsNotNull() {
            addCriterion("comment_count is not null");
            return (Criteria) this;
        }

        /**
         * And comment count equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentCountEqualTo(Long value) {
            addCriterion("comment_count =", value, "commentCount");
            return (Criteria) this;
        }

        /**
         * And comment count not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentCountNotEqualTo(Long value) {
            addCriterion("comment_count <>", value, "commentCount");
            return (Criteria) this;
        }

        /**
         * And comment count greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentCountGreaterThan(Long value) {
            addCriterion("comment_count >", value, "commentCount");
            return (Criteria) this;
        }

        /**
         * And comment count greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentCountGreaterThanOrEqualTo(Long value) {
            addCriterion("comment_count >=", value, "commentCount");
            return (Criteria) this;
        }

        /**
         * And comment count less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentCountLessThan(Long value) {
            addCriterion("comment_count <", value, "commentCount");
            return (Criteria) this;
        }

        /**
         * And comment count less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentCountLessThanOrEqualTo(Long value) {
            addCriterion("comment_count <=", value, "commentCount");
            return (Criteria) this;
        }

        /**
         * And comment count in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentCountIn(List<Long> values) {
            addCriterion("comment_count in", values, "commentCount");
            return (Criteria) this;
        }

        /**
         * And comment count not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentCountNotIn(List<Long> values) {
            addCriterion("comment_count not in", values, "commentCount");
            return (Criteria) this;
        }

        /**
         * And comment count between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentCountBetween(Long value1, Long value2) {
            addCriterion("comment_count between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        /**
         * And comment count not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentCountNotBetween(Long value1, Long value2) {
            addCriterion("comment_count not between", value1, value2, "commentCount");
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