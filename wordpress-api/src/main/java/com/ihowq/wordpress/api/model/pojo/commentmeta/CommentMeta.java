package com.ihowq.wordpress.api.model.pojo.commentmeta;

import java.io.Serializable;

/**
 * The type Comment meta.
 *
 * @author
 */
public class CommentMeta implements Serializable {
    private static final long serialVersionUID = -1842995388921912775L;
    private Long metaId;
    private Long commentId;
    private String metaKey;
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
     * Gets comment id.
     *
     * @return the comment id
     */
    public Long getCommentId() {
        return commentId;
    }

    /**
     * Sets comment id.
     *
     * @param commentId the comment id
     */
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
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
        CommentMeta other = (CommentMeta) that;
        return (this.getMetaId() == null ? other.getMetaId() == null : this.getMetaId().equals(other.getMetaId()))
                && (this.getCommentId() == null ? other.getCommentId() == null : this.getCommentId().equals(other.getCommentId()))
                && (this.getMetaKey() == null ? other.getMetaKey() == null : this.getMetaKey().equals(other.getMetaKey()))
                && (this.getMetaValue() == null ? other.getMetaValue() == null : this.getMetaValue().equals(other.getMetaValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMetaId() == null) ? 0 : getMetaId().hashCode());
        result = prime * result + ((getCommentId() == null) ? 0 : getCommentId().hashCode());
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
        sb.append(", commentId=").append(commentId);
        sb.append(", metaKey=").append(metaKey);
        sb.append(", metaValue=").append(metaValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}