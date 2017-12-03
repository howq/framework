package com.ihowq.wordpress.api.model.pojo.user;

import java.io.Serializable;
import java.util.Date;

/**
 * The type User.
 *
 * @author
 */
public class User implements Serializable {
    private static final long serialVersionUID = 5106601631364474666L;
    private Long id;
    private String userLogin;
    private String userPass;
    private String userNicename;
    private String userEmail;
    private String userUrl;
    private Date userRegistered;
    private String userActivationKey;
    private Integer userStatus;
    private String displayName;

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets user login.
     *
     * @return the user login
     */
    public String getUserLogin() {
        return userLogin;
    }

    /**
     * Sets user login.
     *
     * @param userLogin the user login
     */
    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    /**
     * Gets user pass.
     *
     * @return the user pass
     */
    public String getUserPass() {
        return userPass;
    }

    /**
     * Sets user pass.
     *
     * @param userPass the user pass
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    /**
     * Gets user nicename.
     *
     * @return the user nicename
     */
    public String getUserNicename() {
        return userNicename;
    }

    /**
     * Sets user nicename.
     *
     * @param userNicename the user nicename
     */
    public void setUserNicename(String userNicename) {
        this.userNicename = userNicename;
    }

    /**
     * Gets user email.
     *
     * @return the user email
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * Sets user email.
     *
     * @param userEmail the user email
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * Gets user url.
     *
     * @return the user url
     */
    public String getUserUrl() {
        return userUrl;
    }

    /**
     * Sets user url.
     *
     * @param userUrl the user url
     */
    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    /**
     * Gets user registered.
     *
     * @return the user registered
     */
    public Date getUserRegistered() {
        return userRegistered;
    }

    /**
     * Sets user registered.
     *
     * @param userRegistered the user registered
     */
    public void setUserRegistered(Date userRegistered) {
        this.userRegistered = userRegistered;
    }

    /**
     * Gets user activation key.
     *
     * @return the user activation key
     */
    public String getUserActivationKey() {
        return userActivationKey;
    }

    /**
     * Sets user activation key.
     *
     * @param userActivationKey the user activation key
     */
    public void setUserActivationKey(String userActivationKey) {
        this.userActivationKey = userActivationKey;
    }

    /**
     * Gets user status.
     *
     * @return the user status
     */
    public Integer getUserStatus() {
        return userStatus;
    }

    /**
     * Sets user status.
     *
     * @param userStatus the user status
     */
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * Gets display name.
     *
     * @return the display name
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets display name.
     *
     * @param displayName the display name
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getUserLogin() == null ? other.getUserLogin() == null : this.getUserLogin().equals(other.getUserLogin()))
                && (this.getUserPass() == null ? other.getUserPass() == null : this.getUserPass().equals(other.getUserPass()))
                && (this.getUserNicename() == null ? other.getUserNicename() == null : this.getUserNicename().equals(other.getUserNicename()))
                && (this.getUserEmail() == null ? other.getUserEmail() == null : this.getUserEmail().equals(other.getUserEmail()))
                && (this.getUserUrl() == null ? other.getUserUrl() == null : this.getUserUrl().equals(other.getUserUrl()))
                && (this.getUserRegistered() == null ? other.getUserRegistered() == null : this.getUserRegistered().equals(other.getUserRegistered()))
                && (this.getUserActivationKey() == null ? other.getUserActivationKey() == null : this.getUserActivationKey().equals(other.getUserActivationKey()))
                && (this.getUserStatus() == null ? other.getUserStatus() == null : this.getUserStatus().equals(other.getUserStatus()))
                && (this.getDisplayName() == null ? other.getDisplayName() == null : this.getDisplayName().equals(other.getDisplayName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserLogin() == null) ? 0 : getUserLogin().hashCode());
        result = prime * result + ((getUserPass() == null) ? 0 : getUserPass().hashCode());
        result = prime * result + ((getUserNicename() == null) ? 0 : getUserNicename().hashCode());
        result = prime * result + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        result = prime * result + ((getUserUrl() == null) ? 0 : getUserUrl().hashCode());
        result = prime * result + ((getUserRegistered() == null) ? 0 : getUserRegistered().hashCode());
        result = prime * result + ((getUserActivationKey() == null) ? 0 : getUserActivationKey().hashCode());
        result = prime * result + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        result = prime * result + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userLogin=").append(userLogin);
        sb.append(", userPass=").append(userPass);
        sb.append(", userNicename=").append(userNicename);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userUrl=").append(userUrl);
        sb.append(", userRegistered=").append(userRegistered);
        sb.append(", userActivationKey=").append(userActivationKey);
        sb.append(", userStatus=").append(userStatus);
        sb.append(", displayName=").append(displayName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}