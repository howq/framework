package com.ihowq.wordpress.api.model.pojo.comment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The type Comment query.
 */
public class CommentQuery {
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
     * Constructs a new CommentQuery.
     */
    public CommentQuery() {
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
         * And comment id is null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentIdIsNull() {
            addCriterion("comment_ID is null");
            return (Criteria) this;
        }

        /**
         * And comment id is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_ID is not null");
            return (Criteria) this;
        }

        /**
         * And comment id equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentIdEqualTo(Long value) {
            addCriterion("comment_ID =", value, "commentId");
            return (Criteria) this;
        }

        /**
         * And comment id not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentIdNotEqualTo(Long value) {
            addCriterion("comment_ID <>", value, "commentId");
            return (Criteria) this;
        }

        /**
         * And comment id greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentIdGreaterThan(Long value) {
            addCriterion("comment_ID >", value, "commentId");
            return (Criteria) this;
        }

        /**
         * And comment id greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("comment_ID >=", value, "commentId");
            return (Criteria) this;
        }

        /**
         * And comment id less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentIdLessThan(Long value) {
            addCriterion("comment_ID <", value, "commentId");
            return (Criteria) this;
        }

        /**
         * And comment id less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentIdLessThanOrEqualTo(Long value) {
            addCriterion("comment_ID <=", value, "commentId");
            return (Criteria) this;
        }

        /**
         * And comment id in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentIdIn(List<Long> values) {
            addCriterion("comment_ID in", values, "commentId");
            return (Criteria) this;
        }

        /**
         * And comment id not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentIdNotIn(List<Long> values) {
            addCriterion("comment_ID not in", values, "commentId");
            return (Criteria) this;
        }

        /**
         * And comment id between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentIdBetween(Long value1, Long value2) {
            addCriterion("comment_ID between", value1, value2, "commentId");
            return (Criteria) this;
        }

        /**
         * And comment id not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentIdNotBetween(Long value1, Long value2) {
            addCriterion("comment_ID not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        /**
         * And comment post id is null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentPostIdIsNull() {
            addCriterion("comment_post_ID is null");
            return (Criteria) this;
        }

        /**
         * And comment post id is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentPostIdIsNotNull() {
            addCriterion("comment_post_ID is not null");
            return (Criteria) this;
        }

        /**
         * And comment post id equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentPostIdEqualTo(Long value) {
            addCriterion("comment_post_ID =", value, "commentPostId");
            return (Criteria) this;
        }

        /**
         * And comment post id not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentPostIdNotEqualTo(Long value) {
            addCriterion("comment_post_ID <>", value, "commentPostId");
            return (Criteria) this;
        }

        /**
         * And comment post id greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentPostIdGreaterThan(Long value) {
            addCriterion("comment_post_ID >", value, "commentPostId");
            return (Criteria) this;
        }

        /**
         * And comment post id greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentPostIdGreaterThanOrEqualTo(Long value) {
            addCriterion("comment_post_ID >=", value, "commentPostId");
            return (Criteria) this;
        }

        /**
         * And comment post id less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentPostIdLessThan(Long value) {
            addCriterion("comment_post_ID <", value, "commentPostId");
            return (Criteria) this;
        }

        /**
         * And comment post id less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentPostIdLessThanOrEqualTo(Long value) {
            addCriterion("comment_post_ID <=", value, "commentPostId");
            return (Criteria) this;
        }

        /**
         * And comment post id in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentPostIdIn(List<Long> values) {
            addCriterion("comment_post_ID in", values, "commentPostId");
            return (Criteria) this;
        }

        /**
         * And comment post id not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentPostIdNotIn(List<Long> values) {
            addCriterion("comment_post_ID not in", values, "commentPostId");
            return (Criteria) this;
        }

        /**
         * And comment post id between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentPostIdBetween(Long value1, Long value2) {
            addCriterion("comment_post_ID between", value1, value2, "commentPostId");
            return (Criteria) this;
        }

        /**
         * And comment post id not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentPostIdNotBetween(Long value1, Long value2) {
            addCriterion("comment_post_ID not between", value1, value2, "commentPostId");
            return (Criteria) this;
        }

        /**
         * And comment author is null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentAuthorIsNull() {
            addCriterion("comment_author is null");
            return (Criteria) this;
        }

        /**
         * And comment author is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentAuthorIsNotNull() {
            addCriterion("comment_author is not null");
            return (Criteria) this;
        }

        /**
         * And comment author equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorEqualTo(String value) {
            addCriterion("comment_author =", value, "commentAuthor");
            return (Criteria) this;
        }

        /**
         * And comment author not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorNotEqualTo(String value) {
            addCriterion("comment_author <>", value, "commentAuthor");
            return (Criteria) this;
        }

        /**
         * And comment author greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorGreaterThan(String value) {
            addCriterion("comment_author >", value, "commentAuthor");
            return (Criteria) this;
        }

        /**
         * And comment author greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("comment_author >=", value, "commentAuthor");
            return (Criteria) this;
        }

        /**
         * And comment author less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorLessThan(String value) {
            addCriterion("comment_author <", value, "commentAuthor");
            return (Criteria) this;
        }

        /**
         * And comment author less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorLessThanOrEqualTo(String value) {
            addCriterion("comment_author <=", value, "commentAuthor");
            return (Criteria) this;
        }

        /**
         * And comment author like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorLike(String value) {
            addCriterion("comment_author like", value, "commentAuthor");
            return (Criteria) this;
        }

        /**
         * And comment author not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorNotLike(String value) {
            addCriterion("comment_author not like", value, "commentAuthor");
            return (Criteria) this;
        }

        /**
         * And comment author in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentAuthorIn(List<String> values) {
            addCriterion("comment_author in", values, "commentAuthor");
            return (Criteria) this;
        }

        /**
         * And comment author not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentAuthorNotIn(List<String> values) {
            addCriterion("comment_author not in", values, "commentAuthor");
            return (Criteria) this;
        }

        /**
         * And comment author between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentAuthorBetween(String value1, String value2) {
            addCriterion("comment_author between", value1, value2, "commentAuthor");
            return (Criteria) this;
        }

        /**
         * And comment author not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentAuthorNotBetween(String value1, String value2) {
            addCriterion("comment_author not between", value1, value2, "commentAuthor");
            return (Criteria) this;
        }

        /**
         * And comment author email is null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentAuthorEmailIsNull() {
            addCriterion("comment_author_email is null");
            return (Criteria) this;
        }

        /**
         * And comment author email is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentAuthorEmailIsNotNull() {
            addCriterion("comment_author_email is not null");
            return (Criteria) this;
        }

        /**
         * And comment author email equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorEmailEqualTo(String value) {
            addCriterion("comment_author_email =", value, "commentAuthorEmail");
            return (Criteria) this;
        }

        /**
         * And comment author email not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorEmailNotEqualTo(String value) {
            addCriterion("comment_author_email <>", value, "commentAuthorEmail");
            return (Criteria) this;
        }

        /**
         * And comment author email greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorEmailGreaterThan(String value) {
            addCriterion("comment_author_email >", value, "commentAuthorEmail");
            return (Criteria) this;
        }

        /**
         * And comment author email greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorEmailGreaterThanOrEqualTo(String value) {
            addCriterion("comment_author_email >=", value, "commentAuthorEmail");
            return (Criteria) this;
        }

        /**
         * And comment author email less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorEmailLessThan(String value) {
            addCriterion("comment_author_email <", value, "commentAuthorEmail");
            return (Criteria) this;
        }

        /**
         * And comment author email less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorEmailLessThanOrEqualTo(String value) {
            addCriterion("comment_author_email <=", value, "commentAuthorEmail");
            return (Criteria) this;
        }

        /**
         * And comment author email like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorEmailLike(String value) {
            addCriterion("comment_author_email like", value, "commentAuthorEmail");
            return (Criteria) this;
        }

        /**
         * And comment author email not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorEmailNotLike(String value) {
            addCriterion("comment_author_email not like", value, "commentAuthorEmail");
            return (Criteria) this;
        }

        /**
         * And comment author email in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentAuthorEmailIn(List<String> values) {
            addCriterion("comment_author_email in", values, "commentAuthorEmail");
            return (Criteria) this;
        }

        /**
         * And comment author email not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentAuthorEmailNotIn(List<String> values) {
            addCriterion("comment_author_email not in", values, "commentAuthorEmail");
            return (Criteria) this;
        }

        /**
         * And comment author email between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentAuthorEmailBetween(String value1, String value2) {
            addCriterion("comment_author_email between", value1, value2, "commentAuthorEmail");
            return (Criteria) this;
        }

        /**
         * And comment author email not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentAuthorEmailNotBetween(String value1, String value2) {
            addCriterion("comment_author_email not between", value1, value2, "commentAuthorEmail");
            return (Criteria) this;
        }

        /**
         * And comment author url is null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentAuthorUrlIsNull() {
            addCriterion("comment_author_url is null");
            return (Criteria) this;
        }

        /**
         * And comment author url is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentAuthorUrlIsNotNull() {
            addCriterion("comment_author_url is not null");
            return (Criteria) this;
        }

        /**
         * And comment author url equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorUrlEqualTo(String value) {
            addCriterion("comment_author_url =", value, "commentAuthorUrl");
            return (Criteria) this;
        }

        /**
         * And comment author url not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorUrlNotEqualTo(String value) {
            addCriterion("comment_author_url <>", value, "commentAuthorUrl");
            return (Criteria) this;
        }

        /**
         * And comment author url greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorUrlGreaterThan(String value) {
            addCriterion("comment_author_url >", value, "commentAuthorUrl");
            return (Criteria) this;
        }

        /**
         * And comment author url greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorUrlGreaterThanOrEqualTo(String value) {
            addCriterion("comment_author_url >=", value, "commentAuthorUrl");
            return (Criteria) this;
        }

        /**
         * And comment author url less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorUrlLessThan(String value) {
            addCriterion("comment_author_url <", value, "commentAuthorUrl");
            return (Criteria) this;
        }

        /**
         * And comment author url less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorUrlLessThanOrEqualTo(String value) {
            addCriterion("comment_author_url <=", value, "commentAuthorUrl");
            return (Criteria) this;
        }

        /**
         * And comment author url like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorUrlLike(String value) {
            addCriterion("comment_author_url like", value, "commentAuthorUrl");
            return (Criteria) this;
        }

        /**
         * And comment author url not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorUrlNotLike(String value) {
            addCriterion("comment_author_url not like", value, "commentAuthorUrl");
            return (Criteria) this;
        }

        /**
         * And comment author url in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentAuthorUrlIn(List<String> values) {
            addCriterion("comment_author_url in", values, "commentAuthorUrl");
            return (Criteria) this;
        }

        /**
         * And comment author url not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentAuthorUrlNotIn(List<String> values) {
            addCriterion("comment_author_url not in", values, "commentAuthorUrl");
            return (Criteria) this;
        }

        /**
         * And comment author url between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentAuthorUrlBetween(String value1, String value2) {
            addCriterion("comment_author_url between", value1, value2, "commentAuthorUrl");
            return (Criteria) this;
        }

        /**
         * And comment author url not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentAuthorUrlNotBetween(String value1, String value2) {
            addCriterion("comment_author_url not between", value1, value2, "commentAuthorUrl");
            return (Criteria) this;
        }

        /**
         * And comment author ip is null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentAuthorIpIsNull() {
            addCriterion("comment_author_IP is null");
            return (Criteria) this;
        }

        /**
         * And comment author ip is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentAuthorIpIsNotNull() {
            addCriterion("comment_author_IP is not null");
            return (Criteria) this;
        }

        /**
         * And comment author ip equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorIpEqualTo(String value) {
            addCriterion("comment_author_IP =", value, "commentAuthorIp");
            return (Criteria) this;
        }

        /**
         * And comment author ip not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorIpNotEqualTo(String value) {
            addCriterion("comment_author_IP <>", value, "commentAuthorIp");
            return (Criteria) this;
        }

        /**
         * And comment author ip greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorIpGreaterThan(String value) {
            addCriterion("comment_author_IP >", value, "commentAuthorIp");
            return (Criteria) this;
        }

        /**
         * And comment author ip greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorIpGreaterThanOrEqualTo(String value) {
            addCriterion("comment_author_IP >=", value, "commentAuthorIp");
            return (Criteria) this;
        }

        /**
         * And comment author ip less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorIpLessThan(String value) {
            addCriterion("comment_author_IP <", value, "commentAuthorIp");
            return (Criteria) this;
        }

        /**
         * And comment author ip less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorIpLessThanOrEqualTo(String value) {
            addCriterion("comment_author_IP <=", value, "commentAuthorIp");
            return (Criteria) this;
        }

        /**
         * And comment author ip like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorIpLike(String value) {
            addCriterion("comment_author_IP like", value, "commentAuthorIp");
            return (Criteria) this;
        }

        /**
         * And comment author ip not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAuthorIpNotLike(String value) {
            addCriterion("comment_author_IP not like", value, "commentAuthorIp");
            return (Criteria) this;
        }

        /**
         * And comment author ip in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentAuthorIpIn(List<String> values) {
            addCriterion("comment_author_IP in", values, "commentAuthorIp");
            return (Criteria) this;
        }

        /**
         * And comment author ip not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentAuthorIpNotIn(List<String> values) {
            addCriterion("comment_author_IP not in", values, "commentAuthorIp");
            return (Criteria) this;
        }

        /**
         * And comment author ip between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentAuthorIpBetween(String value1, String value2) {
            addCriterion("comment_author_IP between", value1, value2, "commentAuthorIp");
            return (Criteria) this;
        }

        /**
         * And comment author ip not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentAuthorIpNotBetween(String value1, String value2) {
            addCriterion("comment_author_IP not between", value1, value2, "commentAuthorIp");
            return (Criteria) this;
        }

        /**
         * And comment date is null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentDateIsNull() {
            addCriterion("comment_date is null");
            return (Criteria) this;
        }

        /**
         * And comment date is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentDateIsNotNull() {
            addCriterion("comment_date is not null");
            return (Criteria) this;
        }

        /**
         * And comment date equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentDateEqualTo(Date value) {
            addCriterion("comment_date =", value, "commentDate");
            return (Criteria) this;
        }

        /**
         * And comment date not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentDateNotEqualTo(Date value) {
            addCriterion("comment_date <>", value, "commentDate");
            return (Criteria) this;
        }

        /**
         * And comment date greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentDateGreaterThan(Date value) {
            addCriterion("comment_date >", value, "commentDate");
            return (Criteria) this;
        }

        /**
         * And comment date greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_date >=", value, "commentDate");
            return (Criteria) this;
        }

        /**
         * And comment date less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentDateLessThan(Date value) {
            addCriterion("comment_date <", value, "commentDate");
            return (Criteria) this;
        }

        /**
         * And comment date less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentDateLessThanOrEqualTo(Date value) {
            addCriterion("comment_date <=", value, "commentDate");
            return (Criteria) this;
        }

        /**
         * And comment date in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentDateIn(List<Date> values) {
            addCriterion("comment_date in", values, "commentDate");
            return (Criteria) this;
        }

        /**
         * And comment date not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentDateNotIn(List<Date> values) {
            addCriterion("comment_date not in", values, "commentDate");
            return (Criteria) this;
        }

        /**
         * And comment date between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentDateBetween(Date value1, Date value2) {
            addCriterion("comment_date between", value1, value2, "commentDate");
            return (Criteria) this;
        }

        /**
         * And comment date not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentDateNotBetween(Date value1, Date value2) {
            addCriterion("comment_date not between", value1, value2, "commentDate");
            return (Criteria) this;
        }

        /**
         * And comment date gmt is null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentDateGmtIsNull() {
            addCriterion("comment_date_gmt is null");
            return (Criteria) this;
        }

        /**
         * And comment date gmt is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentDateGmtIsNotNull() {
            addCriterion("comment_date_gmt is not null");
            return (Criteria) this;
        }

        /**
         * And comment date gmt equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentDateGmtEqualTo(Date value) {
            addCriterion("comment_date_gmt =", value, "commentDateGmt");
            return (Criteria) this;
        }

        /**
         * And comment date gmt not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentDateGmtNotEqualTo(Date value) {
            addCriterion("comment_date_gmt <>", value, "commentDateGmt");
            return (Criteria) this;
        }

        /**
         * And comment date gmt greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentDateGmtGreaterThan(Date value) {
            addCriterion("comment_date_gmt >", value, "commentDateGmt");
            return (Criteria) this;
        }

        /**
         * And comment date gmt greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentDateGmtGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_date_gmt >=", value, "commentDateGmt");
            return (Criteria) this;
        }

        /**
         * And comment date gmt less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentDateGmtLessThan(Date value) {
            addCriterion("comment_date_gmt <", value, "commentDateGmt");
            return (Criteria) this;
        }

        /**
         * And comment date gmt less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentDateGmtLessThanOrEqualTo(Date value) {
            addCriterion("comment_date_gmt <=", value, "commentDateGmt");
            return (Criteria) this;
        }

        /**
         * And comment date gmt in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentDateGmtIn(List<Date> values) {
            addCriterion("comment_date_gmt in", values, "commentDateGmt");
            return (Criteria) this;
        }

        /**
         * And comment date gmt not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentDateGmtNotIn(List<Date> values) {
            addCriterion("comment_date_gmt not in", values, "commentDateGmt");
            return (Criteria) this;
        }

        /**
         * And comment date gmt between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentDateGmtBetween(Date value1, Date value2) {
            addCriterion("comment_date_gmt between", value1, value2, "commentDateGmt");
            return (Criteria) this;
        }

        /**
         * And comment date gmt not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentDateGmtNotBetween(Date value1, Date value2) {
            addCriterion("comment_date_gmt not between", value1, value2, "commentDateGmt");
            return (Criteria) this;
        }

        /**
         * And comment karma is null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentKarmaIsNull() {
            addCriterion("comment_karma is null");
            return (Criteria) this;
        }

        /**
         * And comment karma is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentKarmaIsNotNull() {
            addCriterion("comment_karma is not null");
            return (Criteria) this;
        }

        /**
         * And comment karma equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentKarmaEqualTo(Integer value) {
            addCriterion("comment_karma =", value, "commentKarma");
            return (Criteria) this;
        }

        /**
         * And comment karma not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentKarmaNotEqualTo(Integer value) {
            addCriterion("comment_karma <>", value, "commentKarma");
            return (Criteria) this;
        }

        /**
         * And comment karma greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentKarmaGreaterThan(Integer value) {
            addCriterion("comment_karma >", value, "commentKarma");
            return (Criteria) this;
        }

        /**
         * And comment karma greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentKarmaGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_karma >=", value, "commentKarma");
            return (Criteria) this;
        }

        /**
         * And comment karma less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentKarmaLessThan(Integer value) {
            addCriterion("comment_karma <", value, "commentKarma");
            return (Criteria) this;
        }

        /**
         * And comment karma less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentKarmaLessThanOrEqualTo(Integer value) {
            addCriterion("comment_karma <=", value, "commentKarma");
            return (Criteria) this;
        }

        /**
         * And comment karma in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentKarmaIn(List<Integer> values) {
            addCriterion("comment_karma in", values, "commentKarma");
            return (Criteria) this;
        }

        /**
         * And comment karma not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentKarmaNotIn(List<Integer> values) {
            addCriterion("comment_karma not in", values, "commentKarma");
            return (Criteria) this;
        }

        /**
         * And comment karma between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentKarmaBetween(Integer value1, Integer value2) {
            addCriterion("comment_karma between", value1, value2, "commentKarma");
            return (Criteria) this;
        }

        /**
         * And comment karma not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentKarmaNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_karma not between", value1, value2, "commentKarma");
            return (Criteria) this;
        }

        /**
         * And comment approved is null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentApprovedIsNull() {
            addCriterion("comment_approved is null");
            return (Criteria) this;
        }

        /**
         * And comment approved is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentApprovedIsNotNull() {
            addCriterion("comment_approved is not null");
            return (Criteria) this;
        }

        /**
         * And comment approved equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentApprovedEqualTo(String value) {
            addCriterion("comment_approved =", value, "commentApproved");
            return (Criteria) this;
        }

        /**
         * And comment approved not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentApprovedNotEqualTo(String value) {
            addCriterion("comment_approved <>", value, "commentApproved");
            return (Criteria) this;
        }

        /**
         * And comment approved greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentApprovedGreaterThan(String value) {
            addCriterion("comment_approved >", value, "commentApproved");
            return (Criteria) this;
        }

        /**
         * And comment approved greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentApprovedGreaterThanOrEqualTo(String value) {
            addCriterion("comment_approved >=", value, "commentApproved");
            return (Criteria) this;
        }

        /**
         * And comment approved less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentApprovedLessThan(String value) {
            addCriterion("comment_approved <", value, "commentApproved");
            return (Criteria) this;
        }

        /**
         * And comment approved less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentApprovedLessThanOrEqualTo(String value) {
            addCriterion("comment_approved <=", value, "commentApproved");
            return (Criteria) this;
        }

        /**
         * And comment approved like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentApprovedLike(String value) {
            addCriterion("comment_approved like", value, "commentApproved");
            return (Criteria) this;
        }

        /**
         * And comment approved not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentApprovedNotLike(String value) {
            addCriterion("comment_approved not like", value, "commentApproved");
            return (Criteria) this;
        }

        /**
         * And comment approved in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentApprovedIn(List<String> values) {
            addCriterion("comment_approved in", values, "commentApproved");
            return (Criteria) this;
        }

        /**
         * And comment approved not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentApprovedNotIn(List<String> values) {
            addCriterion("comment_approved not in", values, "commentApproved");
            return (Criteria) this;
        }

        /**
         * And comment approved between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentApprovedBetween(String value1, String value2) {
            addCriterion("comment_approved between", value1, value2, "commentApproved");
            return (Criteria) this;
        }

        /**
         * And comment approved not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentApprovedNotBetween(String value1, String value2) {
            addCriterion("comment_approved not between", value1, value2, "commentApproved");
            return (Criteria) this;
        }

        /**
         * And comment agent is null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentAgentIsNull() {
            addCriterion("comment_agent is null");
            return (Criteria) this;
        }

        /**
         * And comment agent is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentAgentIsNotNull() {
            addCriterion("comment_agent is not null");
            return (Criteria) this;
        }

        /**
         * And comment agent equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAgentEqualTo(String value) {
            addCriterion("comment_agent =", value, "commentAgent");
            return (Criteria) this;
        }

        /**
         * And comment agent not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAgentNotEqualTo(String value) {
            addCriterion("comment_agent <>", value, "commentAgent");
            return (Criteria) this;
        }

        /**
         * And comment agent greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAgentGreaterThan(String value) {
            addCriterion("comment_agent >", value, "commentAgent");
            return (Criteria) this;
        }

        /**
         * And comment agent greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAgentGreaterThanOrEqualTo(String value) {
            addCriterion("comment_agent >=", value, "commentAgent");
            return (Criteria) this;
        }

        /**
         * And comment agent less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAgentLessThan(String value) {
            addCriterion("comment_agent <", value, "commentAgent");
            return (Criteria) this;
        }

        /**
         * And comment agent less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAgentLessThanOrEqualTo(String value) {
            addCriterion("comment_agent <=", value, "commentAgent");
            return (Criteria) this;
        }

        /**
         * And comment agent like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAgentLike(String value) {
            addCriterion("comment_agent like", value, "commentAgent");
            return (Criteria) this;
        }

        /**
         * And comment agent not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentAgentNotLike(String value) {
            addCriterion("comment_agent not like", value, "commentAgent");
            return (Criteria) this;
        }

        /**
         * And comment agent in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentAgentIn(List<String> values) {
            addCriterion("comment_agent in", values, "commentAgent");
            return (Criteria) this;
        }

        /**
         * And comment agent not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentAgentNotIn(List<String> values) {
            addCriterion("comment_agent not in", values, "commentAgent");
            return (Criteria) this;
        }

        /**
         * And comment agent between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentAgentBetween(String value1, String value2) {
            addCriterion("comment_agent between", value1, value2, "commentAgent");
            return (Criteria) this;
        }

        /**
         * And comment agent not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentAgentNotBetween(String value1, String value2) {
            addCriterion("comment_agent not between", value1, value2, "commentAgent");
            return (Criteria) this;
        }

        /**
         * And comment type is null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentTypeIsNull() {
            addCriterion("comment_type is null");
            return (Criteria) this;
        }

        /**
         * And comment type is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentTypeIsNotNull() {
            addCriterion("comment_type is not null");
            return (Criteria) this;
        }

        /**
         * And comment type equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentTypeEqualTo(String value) {
            addCriterion("comment_type =", value, "commentType");
            return (Criteria) this;
        }

        /**
         * And comment type not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentTypeNotEqualTo(String value) {
            addCriterion("comment_type <>", value, "commentType");
            return (Criteria) this;
        }

        /**
         * And comment type greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentTypeGreaterThan(String value) {
            addCriterion("comment_type >", value, "commentType");
            return (Criteria) this;
        }

        /**
         * And comment type greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("comment_type >=", value, "commentType");
            return (Criteria) this;
        }

        /**
         * And comment type less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentTypeLessThan(String value) {
            addCriterion("comment_type <", value, "commentType");
            return (Criteria) this;
        }

        /**
         * And comment type less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentTypeLessThanOrEqualTo(String value) {
            addCriterion("comment_type <=", value, "commentType");
            return (Criteria) this;
        }

        /**
         * And comment type like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentTypeLike(String value) {
            addCriterion("comment_type like", value, "commentType");
            return (Criteria) this;
        }

        /**
         * And comment type not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentTypeNotLike(String value) {
            addCriterion("comment_type not like", value, "commentType");
            return (Criteria) this;
        }

        /**
         * And comment type in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentTypeIn(List<String> values) {
            addCriterion("comment_type in", values, "commentType");
            return (Criteria) this;
        }

        /**
         * And comment type not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentTypeNotIn(List<String> values) {
            addCriterion("comment_type not in", values, "commentType");
            return (Criteria) this;
        }

        /**
         * And comment type between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentTypeBetween(String value1, String value2) {
            addCriterion("comment_type between", value1, value2, "commentType");
            return (Criteria) this;
        }

        /**
         * And comment type not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentTypeNotBetween(String value1, String value2) {
            addCriterion("comment_type not between", value1, value2, "commentType");
            return (Criteria) this;
        }

        /**
         * And comment parent is null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentParentIsNull() {
            addCriterion("comment_parent is null");
            return (Criteria) this;
        }

        /**
         * And comment parent is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andCommentParentIsNotNull() {
            addCriterion("comment_parent is not null");
            return (Criteria) this;
        }

        /**
         * And comment parent equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentParentEqualTo(Long value) {
            addCriterion("comment_parent =", value, "commentParent");
            return (Criteria) this;
        }

        /**
         * And comment parent not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentParentNotEqualTo(Long value) {
            addCriterion("comment_parent <>", value, "commentParent");
            return (Criteria) this;
        }

        /**
         * And comment parent greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentParentGreaterThan(Long value) {
            addCriterion("comment_parent >", value, "commentParent");
            return (Criteria) this;
        }

        /**
         * And comment parent greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentParentGreaterThanOrEqualTo(Long value) {
            addCriterion("comment_parent >=", value, "commentParent");
            return (Criteria) this;
        }

        /**
         * And comment parent less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentParentLessThan(Long value) {
            addCriterion("comment_parent <", value, "commentParent");
            return (Criteria) this;
        }

        /**
         * And comment parent less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCommentParentLessThanOrEqualTo(Long value) {
            addCriterion("comment_parent <=", value, "commentParent");
            return (Criteria) this;
        }

        /**
         * And comment parent in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentParentIn(List<Long> values) {
            addCriterion("comment_parent in", values, "commentParent");
            return (Criteria) this;
        }

        /**
         * And comment parent not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCommentParentNotIn(List<Long> values) {
            addCriterion("comment_parent not in", values, "commentParent");
            return (Criteria) this;
        }

        /**
         * And comment parent between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentParentBetween(Long value1, Long value2) {
            addCriterion("comment_parent between", value1, value2, "commentParent");
            return (Criteria) this;
        }

        /**
         * And comment parent not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCommentParentNotBetween(Long value1, Long value2) {
            addCriterion("comment_parent not between", value1, value2, "commentParent");
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