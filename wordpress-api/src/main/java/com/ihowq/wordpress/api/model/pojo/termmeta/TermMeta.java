package com.ihowq.wordpress.api.model.pojo.termmeta;

import java.io.Serializable;

/**
 * The type Term meta.
 *
 * @author
 */
public class TermMeta implements Serializable {
    private static final long serialVersionUID = -1322077081142835656L;
    /**
     * 自增唯一ID
     */
    private Long metaId;

    /**
     * 对应分类ID
     */
    private Long termId;

    /**
     * 键名
     */
    private String metaKey;

    /**
     * 键值
     */
    private String metaValue;

    /**
     * Gets meta id.
     *
     * @return the meta id
     */
    public Long getMetaId() {
        return metaId;
    }

    /**
     * Sets meta id.
     *
     * @param metaId the meta id
     */
    public void setMetaId(Long metaId) {
        this.metaId = metaId;
    }

    /**
     * Gets term id.
     *
     * @return the term id
     */
    public Long getTermId() {
        return termId;
    }

    /**
     * Sets term id.
     *
     * @param termId the term id
     */
    public void setTermId(Long termId) {
        this.termId = termId;
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
        TermMeta other = (TermMeta) that;
        return (this.getMetaId() == null ? other.getMetaId() == null : this.getMetaId().equals(other.getMetaId()))
                && (this.getTermId() == null ? other.getTermId() == null : this.getTermId().equals(other.getTermId()))
                && (this.getMetaKey() == null ? other.getMetaKey() == null : this.getMetaKey().equals(other.getMetaKey()))
                && (this.getMetaValue() == null ? other.getMetaValue() == null : this.getMetaValue().equals(other.getMetaValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMetaId() == null) ? 0 : getMetaId().hashCode());
        result = prime * result + ((getTermId() == null) ? 0 : getTermId().hashCode());
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
        sb.append(", metaId=").append(metaId);
        sb.append(", termId=").append(termId);
        sb.append(", metaKey=").append(metaKey);
        sb.append(", metaValue=").append(metaValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}