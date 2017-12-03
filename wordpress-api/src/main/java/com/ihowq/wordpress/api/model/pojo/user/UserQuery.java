package com.ihowq.wordpress.api.model.pojo.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The type User query.
 */
public class UserQuery {
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
     * Instantiates a new User query.
     */
    public UserQuery() {
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
         * And user login is null criteria.
         *
         * @return the criteria
         */
        public Criteria andUserLoginIsNull() {
            addCriterion("user_login is null");
            return (Criteria) this;
        }

        /**
         * And user login is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andUserLoginIsNotNull() {
            addCriterion("user_login is not null");
            return (Criteria) this;
        }

        /**
         * And user login equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserLoginEqualTo(String value) {
            addCriterion("user_login =", value, "userLogin");
            return (Criteria) this;
        }

        /**
         * And user login not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserLoginNotEqualTo(String value) {
            addCriterion("user_login <>", value, "userLogin");
            return (Criteria) this;
        }

        /**
         * And user login greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserLoginGreaterThan(String value) {
            addCriterion("user_login >", value, "userLogin");
            return (Criteria) this;
        }

        /**
         * And user login greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserLoginGreaterThanOrEqualTo(String value) {
            addCriterion("user_login >=", value, "userLogin");
            return (Criteria) this;
        }

        /**
         * And user login less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserLoginLessThan(String value) {
            addCriterion("user_login <", value, "userLogin");
            return (Criteria) this;
        }

        /**
         * And user login less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserLoginLessThanOrEqualTo(String value) {
            addCriterion("user_login <=", value, "userLogin");
            return (Criteria) this;
        }

        /**
         * And user login like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserLoginLike(String value) {
            addCriterion("user_login like", value, "userLogin");
            return (Criteria) this;
        }

        /**
         * And user login not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserLoginNotLike(String value) {
            addCriterion("user_login not like", value, "userLogin");
            return (Criteria) this;
        }

        /**
         * And user login in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andUserLoginIn(List<String> values) {
            addCriterion("user_login in", values, "userLogin");
            return (Criteria) this;
        }

        /**
         * And user login not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andUserLoginNotIn(List<String> values) {
            addCriterion("user_login not in", values, "userLogin");
            return (Criteria) this;
        }

        /**
         * And user login between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andUserLoginBetween(String value1, String value2) {
            addCriterion("user_login between", value1, value2, "userLogin");
            return (Criteria) this;
        }

        /**
         * And user login not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andUserLoginNotBetween(String value1, String value2) {
            addCriterion("user_login not between", value1, value2, "userLogin");
            return (Criteria) this;
        }

        /**
         * And user pass is null criteria.
         *
         * @return the criteria
         */
        public Criteria andUserPassIsNull() {
            addCriterion("user_pass is null");
            return (Criteria) this;
        }

        /**
         * And user pass is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andUserPassIsNotNull() {
            addCriterion("user_pass is not null");
            return (Criteria) this;
        }

        /**
         * And user pass equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserPassEqualTo(String value) {
            addCriterion("user_pass =", value, "userPass");
            return (Criteria) this;
        }

        /**
         * And user pass not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserPassNotEqualTo(String value) {
            addCriterion("user_pass <>", value, "userPass");
            return (Criteria) this;
        }

        /**
         * And user pass greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserPassGreaterThan(String value) {
            addCriterion("user_pass >", value, "userPass");
            return (Criteria) this;
        }

        /**
         * And user pass greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserPassGreaterThanOrEqualTo(String value) {
            addCriterion("user_pass >=", value, "userPass");
            return (Criteria) this;
        }

        /**
         * And user pass less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserPassLessThan(String value) {
            addCriterion("user_pass <", value, "userPass");
            return (Criteria) this;
        }

        /**
         * And user pass less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserPassLessThanOrEqualTo(String value) {
            addCriterion("user_pass <=", value, "userPass");
            return (Criteria) this;
        }

        /**
         * And user pass like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserPassLike(String value) {
            addCriterion("user_pass like", value, "userPass");
            return (Criteria) this;
        }

        /**
         * And user pass not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserPassNotLike(String value) {
            addCriterion("user_pass not like", value, "userPass");
            return (Criteria) this;
        }

        /**
         * And user pass in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andUserPassIn(List<String> values) {
            addCriterion("user_pass in", values, "userPass");
            return (Criteria) this;
        }

        /**
         * And user pass not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andUserPassNotIn(List<String> values) {
            addCriterion("user_pass not in", values, "userPass");
            return (Criteria) this;
        }

        /**
         * And user pass between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andUserPassBetween(String value1, String value2) {
            addCriterion("user_pass between", value1, value2, "userPass");
            return (Criteria) this;
        }

        /**
         * And user pass not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andUserPassNotBetween(String value1, String value2) {
            addCriterion("user_pass not between", value1, value2, "userPass");
            return (Criteria) this;
        }

        /**
         * And user nicename is null criteria.
         *
         * @return the criteria
         */
        public Criteria andUserNicenameIsNull() {
            addCriterion("user_nicename is null");
            return (Criteria) this;
        }

        /**
         * And user nicename is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andUserNicenameIsNotNull() {
            addCriterion("user_nicename is not null");
            return (Criteria) this;
        }

        /**
         * And user nicename equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserNicenameEqualTo(String value) {
            addCriterion("user_nicename =", value, "userNicename");
            return (Criteria) this;
        }

        /**
         * And user nicename not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserNicenameNotEqualTo(String value) {
            addCriterion("user_nicename <>", value, "userNicename");
            return (Criteria) this;
        }

        /**
         * And user nicename greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserNicenameGreaterThan(String value) {
            addCriterion("user_nicename >", value, "userNicename");
            return (Criteria) this;
        }

        /**
         * And user nicename greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserNicenameGreaterThanOrEqualTo(String value) {
            addCriterion("user_nicename >=", value, "userNicename");
            return (Criteria) this;
        }

        /**
         * And user nicename less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserNicenameLessThan(String value) {
            addCriterion("user_nicename <", value, "userNicename");
            return (Criteria) this;
        }

        /**
         * And user nicename less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserNicenameLessThanOrEqualTo(String value) {
            addCriterion("user_nicename <=", value, "userNicename");
            return (Criteria) this;
        }

        /**
         * And user nicename like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserNicenameLike(String value) {
            addCriterion("user_nicename like", value, "userNicename");
            return (Criteria) this;
        }

        /**
         * And user nicename not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserNicenameNotLike(String value) {
            addCriterion("user_nicename not like", value, "userNicename");
            return (Criteria) this;
        }

        /**
         * And user nicename in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andUserNicenameIn(List<String> values) {
            addCriterion("user_nicename in", values, "userNicename");
            return (Criteria) this;
        }

        /**
         * And user nicename not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andUserNicenameNotIn(List<String> values) {
            addCriterion("user_nicename not in", values, "userNicename");
            return (Criteria) this;
        }

        /**
         * And user nicename between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andUserNicenameBetween(String value1, String value2) {
            addCriterion("user_nicename between", value1, value2, "userNicename");
            return (Criteria) this;
        }

        /**
         * And user nicename not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andUserNicenameNotBetween(String value1, String value2) {
            addCriterion("user_nicename not between", value1, value2, "userNicename");
            return (Criteria) this;
        }

        /**
         * And user email is null criteria.
         *
         * @return the criteria
         */
        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        /**
         * And user email is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        /**
         * And user email equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        /**
         * And user email not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        /**
         * And user email greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        /**
         * And user email greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        /**
         * And user email less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        /**
         * And user email less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        /**
         * And user email like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        /**
         * And user email not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        /**
         * And user email in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        /**
         * And user email not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        /**
         * And user email between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        /**
         * And user email not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        /**
         * And user url is null criteria.
         *
         * @return the criteria
         */
        public Criteria andUserUrlIsNull() {
            addCriterion("user_url is null");
            return (Criteria) this;
        }

        /**
         * And user url is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andUserUrlIsNotNull() {
            addCriterion("user_url is not null");
            return (Criteria) this;
        }

        /**
         * And user url equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserUrlEqualTo(String value) {
            addCriterion("user_url =", value, "userUrl");
            return (Criteria) this;
        }

        /**
         * And user url not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserUrlNotEqualTo(String value) {
            addCriterion("user_url <>", value, "userUrl");
            return (Criteria) this;
        }

        /**
         * And user url greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserUrlGreaterThan(String value) {
            addCriterion("user_url >", value, "userUrl");
            return (Criteria) this;
        }

        /**
         * And user url greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserUrlGreaterThanOrEqualTo(String value) {
            addCriterion("user_url >=", value, "userUrl");
            return (Criteria) this;
        }

        /**
         * And user url less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserUrlLessThan(String value) {
            addCriterion("user_url <", value, "userUrl");
            return (Criteria) this;
        }

        /**
         * And user url less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserUrlLessThanOrEqualTo(String value) {
            addCriterion("user_url <=", value, "userUrl");
            return (Criteria) this;
        }

        /**
         * And user url like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserUrlLike(String value) {
            addCriterion("user_url like", value, "userUrl");
            return (Criteria) this;
        }

        /**
         * And user url not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserUrlNotLike(String value) {
            addCriterion("user_url not like", value, "userUrl");
            return (Criteria) this;
        }

        /**
         * And user url in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andUserUrlIn(List<String> values) {
            addCriterion("user_url in", values, "userUrl");
            return (Criteria) this;
        }

        /**
         * And user url not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andUserUrlNotIn(List<String> values) {
            addCriterion("user_url not in", values, "userUrl");
            return (Criteria) this;
        }

        /**
         * And user url between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andUserUrlBetween(String value1, String value2) {
            addCriterion("user_url between", value1, value2, "userUrl");
            return (Criteria) this;
        }

        /**
         * And user url not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andUserUrlNotBetween(String value1, String value2) {
            addCriterion("user_url not between", value1, value2, "userUrl");
            return (Criteria) this;
        }

        /**
         * And user registered is null criteria.
         *
         * @return the criteria
         */
        public Criteria andUserRegisteredIsNull() {
            addCriterion("user_registered is null");
            return (Criteria) this;
        }

        /**
         * And user registered is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andUserRegisteredIsNotNull() {
            addCriterion("user_registered is not null");
            return (Criteria) this;
        }

        /**
         * And user registered equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserRegisteredEqualTo(Date value) {
            addCriterion("user_registered =", value, "userRegistered");
            return (Criteria) this;
        }

        /**
         * And user registered not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserRegisteredNotEqualTo(Date value) {
            addCriterion("user_registered <>", value, "userRegistered");
            return (Criteria) this;
        }

        /**
         * And user registered greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserRegisteredGreaterThan(Date value) {
            addCriterion("user_registered >", value, "userRegistered");
            return (Criteria) this;
        }

        /**
         * And user registered greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserRegisteredGreaterThanOrEqualTo(Date value) {
            addCriterion("user_registered >=", value, "userRegistered");
            return (Criteria) this;
        }

        /**
         * And user registered less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserRegisteredLessThan(Date value) {
            addCriterion("user_registered <", value, "userRegistered");
            return (Criteria) this;
        }

        /**
         * And user registered less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserRegisteredLessThanOrEqualTo(Date value) {
            addCriterion("user_registered <=", value, "userRegistered");
            return (Criteria) this;
        }

        /**
         * And user registered in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andUserRegisteredIn(List<Date> values) {
            addCriterion("user_registered in", values, "userRegistered");
            return (Criteria) this;
        }

        /**
         * And user registered not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andUserRegisteredNotIn(List<Date> values) {
            addCriterion("user_registered not in", values, "userRegistered");
            return (Criteria) this;
        }

        /**
         * And user registered between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andUserRegisteredBetween(Date value1, Date value2) {
            addCriterion("user_registered between", value1, value2, "userRegistered");
            return (Criteria) this;
        }

        /**
         * And user registered not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andUserRegisteredNotBetween(Date value1, Date value2) {
            addCriterion("user_registered not between", value1, value2, "userRegistered");
            return (Criteria) this;
        }

        /**
         * And user activation key is null criteria.
         *
         * @return the criteria
         */
        public Criteria andUserActivationKeyIsNull() {
            addCriterion("user_activation_key is null");
            return (Criteria) this;
        }

        /**
         * And user activation key is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andUserActivationKeyIsNotNull() {
            addCriterion("user_activation_key is not null");
            return (Criteria) this;
        }

        /**
         * And user activation key equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserActivationKeyEqualTo(String value) {
            addCriterion("user_activation_key =", value, "userActivationKey");
            return (Criteria) this;
        }

        /**
         * And user activation key not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserActivationKeyNotEqualTo(String value) {
            addCriterion("user_activation_key <>", value, "userActivationKey");
            return (Criteria) this;
        }

        /**
         * And user activation key greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserActivationKeyGreaterThan(String value) {
            addCriterion("user_activation_key >", value, "userActivationKey");
            return (Criteria) this;
        }

        /**
         * And user activation key greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserActivationKeyGreaterThanOrEqualTo(String value) {
            addCriterion("user_activation_key >=", value, "userActivationKey");
            return (Criteria) this;
        }

        /**
         * And user activation key less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserActivationKeyLessThan(String value) {
            addCriterion("user_activation_key <", value, "userActivationKey");
            return (Criteria) this;
        }

        /**
         * And user activation key less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserActivationKeyLessThanOrEqualTo(String value) {
            addCriterion("user_activation_key <=", value, "userActivationKey");
            return (Criteria) this;
        }

        /**
         * And user activation key like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserActivationKeyLike(String value) {
            addCriterion("user_activation_key like", value, "userActivationKey");
            return (Criteria) this;
        }

        /**
         * And user activation key not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserActivationKeyNotLike(String value) {
            addCriterion("user_activation_key not like", value, "userActivationKey");
            return (Criteria) this;
        }

        /**
         * And user activation key in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andUserActivationKeyIn(List<String> values) {
            addCriterion("user_activation_key in", values, "userActivationKey");
            return (Criteria) this;
        }

        /**
         * And user activation key not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andUserActivationKeyNotIn(List<String> values) {
            addCriterion("user_activation_key not in", values, "userActivationKey");
            return (Criteria) this;
        }

        /**
         * And user activation key between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andUserActivationKeyBetween(String value1, String value2) {
            addCriterion("user_activation_key between", value1, value2, "userActivationKey");
            return (Criteria) this;
        }

        /**
         * And user activation key not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andUserActivationKeyNotBetween(String value1, String value2) {
            addCriterion("user_activation_key not between", value1, value2, "userActivationKey");
            return (Criteria) this;
        }

        /**
         * And user status is null criteria.
         *
         * @return the criteria
         */
        public Criteria andUserStatusIsNull() {
            addCriterion("user_status is null");
            return (Criteria) this;
        }

        /**
         * And user status is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andUserStatusIsNotNull() {
            addCriterion("user_status is not null");
            return (Criteria) this;
        }

        /**
         * And user status equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserStatusEqualTo(Integer value) {
            addCriterion("user_status =", value, "userStatus");
            return (Criteria) this;
        }

        /**
         * And user status not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserStatusNotEqualTo(Integer value) {
            addCriterion("user_status <>", value, "userStatus");
            return (Criteria) this;
        }

        /**
         * And user status greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserStatusGreaterThan(Integer value) {
            addCriterion("user_status >", value, "userStatus");
            return (Criteria) this;
        }

        /**
         * And user status greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_status >=", value, "userStatus");
            return (Criteria) this;
        }

        /**
         * And user status less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserStatusLessThan(Integer value) {
            addCriterion("user_status <", value, "userStatus");
            return (Criteria) this;
        }

        /**
         * And user status less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUserStatusLessThanOrEqualTo(Integer value) {
            addCriterion("user_status <=", value, "userStatus");
            return (Criteria) this;
        }

        /**
         * And user status in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andUserStatusIn(List<Integer> values) {
            addCriterion("user_status in", values, "userStatus");
            return (Criteria) this;
        }

        /**
         * And user status not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andUserStatusNotIn(List<Integer> values) {
            addCriterion("user_status not in", values, "userStatus");
            return (Criteria) this;
        }

        /**
         * And user status between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andUserStatusBetween(Integer value1, Integer value2) {
            addCriterion("user_status between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        /**
         * And user status not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andUserStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("user_status not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        /**
         * And display name is null criteria.
         *
         * @return the criteria
         */
        public Criteria andDisplayNameIsNull() {
            addCriterion("display_name is null");
            return (Criteria) this;
        }

        /**
         * And display name is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andDisplayNameIsNotNull() {
            addCriterion("display_name is not null");
            return (Criteria) this;
        }

        /**
         * And display name equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andDisplayNameEqualTo(String value) {
            addCriterion("display_name =", value, "displayName");
            return (Criteria) this;
        }

        /**
         * And display name not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andDisplayNameNotEqualTo(String value) {
            addCriterion("display_name <>", value, "displayName");
            return (Criteria) this;
        }

        /**
         * And display name greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andDisplayNameGreaterThan(String value) {
            addCriterion("display_name >", value, "displayName");
            return (Criteria) this;
        }

        /**
         * And display name greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andDisplayNameGreaterThanOrEqualTo(String value) {
            addCriterion("display_name >=", value, "displayName");
            return (Criteria) this;
        }

        /**
         * And display name less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andDisplayNameLessThan(String value) {
            addCriterion("display_name <", value, "displayName");
            return (Criteria) this;
        }

        /**
         * And display name less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andDisplayNameLessThanOrEqualTo(String value) {
            addCriterion("display_name <=", value, "displayName");
            return (Criteria) this;
        }

        /**
         * And display name like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andDisplayNameLike(String value) {
            addCriterion("display_name like", value, "displayName");
            return (Criteria) this;
        }

        /**
         * And display name not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andDisplayNameNotLike(String value) {
            addCriterion("display_name not like", value, "displayName");
            return (Criteria) this;
        }

        /**
         * And display name in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andDisplayNameIn(List<String> values) {
            addCriterion("display_name in", values, "displayName");
            return (Criteria) this;
        }

        /**
         * And display name not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andDisplayNameNotIn(List<String> values) {
            addCriterion("display_name not in", values, "displayName");
            return (Criteria) this;
        }

        /**
         * And display name between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andDisplayNameBetween(String value1, String value2) {
            addCriterion("display_name between", value1, value2, "displayName");
            return (Criteria) this;
        }

        /**
         * And display name not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andDisplayNameNotBetween(String value1, String value2) {
            addCriterion("display_name not between", value1, value2, "displayName");
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