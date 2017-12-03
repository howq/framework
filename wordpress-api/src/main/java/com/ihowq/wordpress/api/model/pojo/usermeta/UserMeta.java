package com.ihowq.wordpress.api.model.pojo.usermeta;

import java.io.Serializable;

/**
 * The type User meta.
 *
 * @author
 */
public class UserMeta implements Serializable {
    private static final long serialVersionUID = -1565255068791353538L;
    private Long umetaId;
    private Long userId;
    private String metaKey;
    private String metaValue;

    /**
     * Gets umeta id.
     *
     * @return the umeta id
     */
    public Long getUmetaId() {
        return umetaId;
    }

    /**
     * Sets umeta id.
     *
     * @param umetaId the umeta id
     */
    public void setUmetaId(Long umetaId) {
        this.umetaId = umetaId;
    }

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Gets meta key.
     *
     * @return the meta key
     */
    public String getMetaKey() {
        return metaKey;
    }

    /**
     * Sets meta key.
     *
     * @param metaKey the meta key
     */
    public void setMetaKey(String metaKey) {
        this.metaKey = metaKey;
    }

    /**
     * Gets meta value.
     *
     * @return the meta value
     */
    public String getMetaValue() {
        return metaValue;
    }

    /**
     * Sets meta value.
     *
     * @param metaValue the meta value
     */
    public void setMetaValue(String metaValue) {
        this.metaValue = metaValue;
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
        UserMeta other = (UserMeta) that;
        return (this.getUmetaId() == null ? other.getUmetaId() == null : this.getUmetaId().equals(other.getUmetaId()))
                && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
                && (this.getMetaKey() == null ? other.getMetaKey() == null : this.getMetaKey().equals(other.getMetaKey()))
                && (this.getMetaValue() == null ? other.getMetaValue() == null : this.getMetaValue().equals(other.getMetaValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUmetaId() == null) ? 0 : getUmetaId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getMetaKey() == null) ? 0 : getMetaKey().hashCode());
        result = prime * result + ((getMetaValue() == null) ? 0 : getMetaValue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", umetaId=").append(umetaId);
        sb.append(", userId=").append(userId);
        sb.append(", metaKey=").append(metaKey);
        sb.append(", metaValue=").append(metaValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}