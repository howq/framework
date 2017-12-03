package com.ihowq.wordpress.api.model.pojo.post;

import java.io.Serializable;

/**
 * The type Post with blo bs.
 *
 * @author
 */
public class PostWithBLOBs extends Post implements Serializable {
    private static final long serialVersionUID = -7679716008217072709L;
    /**
     * 正文
     */
    private String postContent;

    /**
     * 标题
     */
    private String postTitle;

    /**
     * 摘录
     */
    private String postExcerpt;

    private String toPing;

    /**
     * 已经PING过的链接
     */
    private String pinged;

    private String postContentFiltered;

    /**
     * Gets post content.
     *
     * @return the post content
     */
    public String getPostContent() {
        return postContent;
    }

    /**
     * Sets post content.
     *
     * @param postContent the post content
     */
    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    /**
     * Gets post title.
     *
     * @return the post title
     */
    public String getPostTitle() {
        return postTitle;
    }

    /**
     * Sets post title.
     *
     * @param postTitle the post title
     */
    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    /**
     * Gets post excerpt.
     *
     * @return the post excerpt
     */
    public String getPostExcerpt() {
        return postExcerpt;
    }

    /**
     * Sets post excerpt.
     *
     * @param postExcerpt the post excerpt
     */
    public void setPostExcerpt(String postExcerpt) {
        this.postExcerpt = postExcerpt;
    }

    /**
     * Gets to ping.
     *
     * @return the to ping
     */
    public String getToPing() {
        return toPing;
    }

    /**
     * Sets to ping.
     *
     * @param toPing the to ping
     */
    public void setToPing(String toPing) {
        this.toPing = toPing;
    }

    /**
     * Gets pinged.
     *
     * @return the pinged
     */
    public String getPinged() {
        return pinged;
    }

    /**
     * Sets pinged.
     *
     * @param pinged the pinged
     */
    public void setPinged(String pinged) {
        this.pinged = pinged;
    }

    /**
     * Gets post content filtered.
     *
     * @return the post content filtered
     */
    public String getPostContentFiltered() {
        return postContentFiltered;
    }

    /**
     * Sets post content filtered.
     *
     * @param postContentFiltered the post content filtered
     */
    public void setPostContentFiltered(String postContentFiltered) {
        this.postContentFiltered = postContentFiltered;
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
        PostWithBLOBs other = (PostWithBLOBs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getPostAuthor() == null ? other.getPostAuthor() == null : this.getPostAuthor().equals(other.getPostAuthor()))
                && (this.getPostDate() == null ? other.getPostDate() == null : this.getPostDate().equals(other.getPostDate()))
                && (this.getPostDateGmt() == null ? other.getPostDateGmt() == null : this.getPostDateGmt().equals(other.getPostDateGmt()))
                && (this.getPostStatus() == null ? other.getPostStatus() == null : this.getPostStatus().equals(other.getPostStatus()))
                && (this.getCommentStatus() == null ? other.getCommentStatus() == null : this.getCommentStatus().equals(other.getCommentStatus()))
                && (this.getPingStatus() == null ? other.getPingStatus() == null : this.getPingStatus().equals(other.getPingStatus()))
                && (this.getPostPassword() == null ? other.getPostPassword() == null : this.getPostPassword().equals(other.getPostPassword()))
                && (this.getPostName() == null ? other.getPostName() == null : this.getPostName().equals(other.getPostName()))
                && (this.getPostModified() == null ? other.getPostModified() == null : this.getPostModified().equals(other.getPostModified()))
                && (this.getPostModifiedGmt() == null ? other.getPostModifiedGmt() == null : this.getPostModifiedGmt().equals(other.getPostModifiedGmt()))
                && (this.getPostParent() == null ? other.getPostParent() == null : this.getPostParent().equals(other.getPostParent()))
                && (this.getGuid() == null ? other.getGuid() == null : this.getGuid().equals(other.getGuid()))
                && (this.getMenuOrder() == null ? other.getMenuOrder() == null : this.getMenuOrder().equals(other.getMenuOrder()))
                && (this.getPostType() == null ? other.getPostType() == null : this.getPostType().equals(other.getPostType()))
                && (this.getPostMimeType() == null ? other.getPostMimeType() == null : this.getPostMimeType().equals(other.getPostMimeType()))
                && (this.getCommentCount() == null ? other.getCommentCount() == null : this.getCommentCount().equals(other.getCommentCount()))
                && (this.getPostContent() == null ? other.getPostContent() == null : this.getPostContent().equals(other.getPostContent()))
                && (this.getPostTitle() == null ? other.getPostTitle() == null : this.getPostTitle().equals(other.getPostTitle()))
                && (this.getPostExcerpt() == null ? other.getPostExcerpt() == null : this.getPostExcerpt().equals(other.getPostExcerpt()))
                && (this.getToPing() == null ? other.getToPing() == null : this.getToPing().equals(other.getToPing()))
                && (this.getPinged() == null ? other.getPinged() == null : this.getPinged().equals(other.getPinged()))
                && (this.getPostContentFiltered() == null ? other.getPostContentFiltered() == null : this.getPostContentFiltered().equals(other.getPostContentFiltered()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPostAuthor() == null) ? 0 : getPostAuthor().hashCode());
        result = prime * result + ((getPostDate() == null) ? 0 : getPostDate().hashCode());
        result = prime * result + ((getPostDateGmt() == null) ? 0 : getPostDateGmt().hashCode());
        result = prime * result + ((getPostStatus() == null) ? 0 : getPostStatus().hashCode());
        result = prime * result + ((getCommentStatus() == null) ? 0 : getCommentStatus().hashCode());
        result = prime * result + ((getPingStatus() == null) ? 0 : getPingStatus().hashCode());
        result = prime * result + ((getPostPassword() == null) ? 0 : getPostPassword().hashCode());
        result = prime * result + ((getPostName() == null) ? 0 : getPostName().hashCode());
        result = prime * result + ((getPostModified() == null) ? 0 : getPostModified().hashCode());
        result = prime * result + ((getPostModifiedGmt() == null) ? 0 : getPostModifiedGmt().hashCode());
        result = prime * result + ((getPostParent() == null) ? 0 : getPostParent().hashCode());
        result = prime * result + ((getGuid() == null) ? 0 : getGuid().hashCode());
        result = prime * result + ((getMenuOrder() == null) ? 0 : getMenuOrder().hashCode());
        result = prime * result + ((getPostType() == null) ? 0 : getPostType().hashCode());
        result = prime * result + ((getPostMimeType() == null) ? 0 : getPostMimeType().hashCode());
        result = prime * result + ((getCommentCount() == null) ? 0 : getCommentCount().hashCode());
        result = prime * result + ((getPostContent() == null) ? 0 : getPostContent().hashCode());
        result = prime * result + ((getPostTitle() == null) ? 0 : getPostTitle().hashCode());
        result = prime * result + ((getPostExcerpt() == null) ? 0 : getPostExcerpt().hashCode());
        result = prime * result + ((getToPing() == null) ? 0 : getToPing().hashCode());
        result = prime * result + ((getPinged() == null) ? 0 : getPinged().hashCode());
        result = prime * result + ((getPostContentFiltered() == null) ? 0 : getPostContentFiltered().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", postContent=").append(postContent);
        sb.append(", postTitle=").append(postTitle);
        sb.append(", postExcerpt=").append(postExcerpt);
        sb.append(", toPing=").append(toPing);
        sb.append(", pinged=").append(pinged);
        sb.append(", postContentFiltered=").append(postContentFiltered);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}