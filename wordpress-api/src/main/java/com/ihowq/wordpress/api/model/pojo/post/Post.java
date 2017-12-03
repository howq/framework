package com.ihowq.wordpress.api.model.pojo.post;

import java.io.Serializable;
import java.util.Date;

/**
 * The type Post.
 *
 * @author
 */
public class Post implements Serializable {
    private static final long serialVersionUID = -2416545440652139280L;
    private Long id;
    private Long postAuthor;
    private Date postDate;
    private Date postDateGmt;
    private String postStatus;
    private String commentStatus;
    private String pingStatus;
    private String postPassword;
    private String postName;
    private Date postModified;
    private Date postModifiedGmt;
    private Long postParent;
    private String guid;
    private Integer menuOrder;
    private String postType;
    private String postMimeType;
    private Long commentCount;

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
     * Gets post author.
     *
     * @return the post author
     */
    public Long getPostAuthor() {
        return postAuthor;
    }

    /**
     * Sets post author.
     *
     * @param postAuthor the post author
     */
    public void setPostAuthor(Long postAuthor) {
        this.postAuthor = postAuthor;
    }

    /**
     * Gets post date.
     *
     * @return the post date
     */
    public Date getPostDate() {
        return postDate;
    }

    /**
     * Sets post date.
     *
     * @param postDate the post date
     */
    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    /**
     * Gets post date gmt.
     *
     * @return the post date gmt
     */
    public Date getPostDateGmt() {
        return postDateGmt;
    }

    /**
     * Sets post date gmt.
     *
     * @param postDateGmt the post date gmt
     */
    public void setPostDateGmt(Date postDateGmt) {
        this.postDateGmt = postDateGmt;
    }

    /**
     * Gets post status.
     *
     * @return the post status
     */
    public String getPostStatus() {
        return postStatus;
    }

    /**
     * Sets post status.
     *
     * @param postStatus the post status
     */
    public void setPostStatus(String postStatus) {
        this.postStatus = postStatus;
    }

    /**
     * Gets comment status.
     *
     * @return the comment status
     */
    public String getCommentStatus() {
        return commentStatus;
    }

    /**
     * Sets comment status.
     *
     * @param commentStatus the comment status
     */
    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    /**
     * Gets ping status.
     *
     * @return the ping status
     */
    public String getPingStatus() {
        return pingStatus;
    }

    /**
     * Sets ping status.
     *
     * @param pingStatus the ping status
     */
    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    /**
     * Gets post password.
     *
     * @return the post password
     */
    public String getPostPassword() {
        return postPassword;
    }

    /**
     * Sets post password.
     *
     * @param postPassword the post password
     */
    public void setPostPassword(String postPassword) {
        this.postPassword = postPassword;
    }

    /**
     * Gets post name.
     *
     * @return the post name
     */
    public String getPostName() {
        return postName;
    }

    /**
     * Sets post name.
     *
     * @param postName the post name
     */
    public void setPostName(String postName) {
        this.postName = postName;
    }

    /**
     * Gets post modified.
     *
     * @return the post modified
     */
    public Date getPostModified() {
        return postModified;
    }

    /**
     * Sets post modified.
     *
     * @param postModified the post modified
     */
    public void setPostModified(Date postModified) {
        this.postModified = postModified;
    }

    /**
     * Gets post modified gmt.
     *
     * @return the post modified gmt
     */
    public Date getPostModifiedGmt() {
        return postModifiedGmt;
    }

    /**
     * Sets post modified gmt.
     *
     * @param postModifiedGmt the post modified gmt
     */
    public void setPostModifiedGmt(Date postModifiedGmt) {
        this.postModifiedGmt = postModifiedGmt;
    }

    /**
     * Gets post parent.
     *
     * @return the post parent
     */
    public Long getPostParent() {
        return postParent;
    }

    /**
     * Sets post parent.
     *
     * @param postParent the post parent
     */
    public void setPostParent(Long postParent) {
        this.postParent = postParent;
    }

    /**
     * Gets guid.
     *
     * @return the guid
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets guid.
     *
     * @param guid the guid
     */
    public void setGuid(String guid) {
        this.guid = guid;
    }

    /**
     * Gets menu order.
     *
     * @return the menu order
     */
    public Integer getMenuOrder() {
        return menuOrder;
    }

    /**
     * Sets menu order.
     *
     * @param menuOrder the menu order
     */
    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

    /**
     * Gets post type.
     *
     * @return the post type
     */
    public String getPostType() {
        return postType;
    }

    /**
     * Sets post type.
     *
     * @param postType the post type
     */
    public void setPostType(String postType) {
        this.postType = postType;
    }

    /**
     * Gets post mime type.
     *
     * @return the post mime type
     */
    public String getPostMimeType() {
        return postMimeType;
    }

    /**
     * Sets post mime type.
     *
     * @param postMimeType the post mime type
     */
    public void setPostMimeType(String postMimeType) {
        this.postMimeType = postMimeType;
    }

    /**
     * Gets comment count.
     *
     * @return the comment count
     */
    public Long getCommentCount() {
        return commentCount;
    }

    /**
     * Sets comment count.
     *
     * @param commentCount the comment count
     */
    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
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
        Post other = (Post) that;
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
                && (this.getCommentCount() == null ? other.getCommentCount() == null : this.getCommentCount().equals(other.getCommentCount()));
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
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", postAuthor=").append(postAuthor);
        sb.append(", postDate=").append(postDate);
        sb.append(", postDateGmt=").append(postDateGmt);
        sb.append(", postStatus=").append(postStatus);
        sb.append(", commentStatus=").append(commentStatus);
        sb.append(", pingStatus=").append(pingStatus);
        sb.append(", postPassword=").append(postPassword);
        sb.append(", postName=").append(postName);
        sb.append(", postModified=").append(postModified);
        sb.append(", postModifiedGmt=").append(postModifiedGmt);
        sb.append(", postParent=").append(postParent);
        sb.append(", guid=").append(guid);
        sb.append(", menuOrder=").append(menuOrder);
        sb.append(", postType=").append(postType);
        sb.append(", postMimeType=").append(postMimeType);
        sb.append(", commentCount=").append(commentCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}