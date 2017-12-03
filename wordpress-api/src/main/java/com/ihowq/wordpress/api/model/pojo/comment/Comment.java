package com.ihowq.wordpress.api.model.pojo.comment;

import java.io.Serializable;
import java.util.Date;

/**
 * The type Comment.
 *
 * @author
 */
public class Comment implements Serializable {
    private static final long serialVersionUID = -7205948277806818407L;
    private Long commentId;
    private Long commentPostId;
    private String commentAuthor;
    private String commentAuthorEmail;
    private String commentAuthorUrl;
    private String commentAuthorIp;
    private Date commentDate;
    private Date commentDateGmt;
    private Integer commentKarma;
    private String commentApproved;
    private String commentAgent;
    private String commentType;
    private Long commentParent;
    private Long userId;
    private String commentContent;

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
     * Gets comment post id.
     *
     * @return the comment post id
     */
    public Long getCommentPostId() {
        return commentPostId;
    }

    /**
     * Sets comment post id.
     *
     * @param commentPostId the comment post id
     */
    public void setCommentPostId(Long commentPostId) {
        this.commentPostId = commentPostId;
    }

    /**
     * Gets comment author.
     *
     * @return the comment author
     */
    public String getCommentAuthor() {
        return commentAuthor;
    }

    /**
     * Sets comment author.
     *
     * @param commentAuthor the comment author
     */
    public void setCommentAuthor(String commentAuthor) {
        this.commentAuthor = commentAuthor;
    }

    /**
     * Gets comment author email.
     *
     * @return the comment author email
     */
    public String getCommentAuthorEmail() {
        return commentAuthorEmail;
    }

    /**
     * Sets comment author email.
     *
     * @param commentAuthorEmail the comment author email
     */
    public void setCommentAuthorEmail(String commentAuthorEmail) {
        this.commentAuthorEmail = commentAuthorEmail;
    }

    /**
     * Gets comment author url.
     *
     * @return the comment author url
     */
    public String getCommentAuthorUrl() {
        return commentAuthorUrl;
    }

    /**
     * Sets comment author url.
     *
     * @param commentAuthorUrl the comment author url
     */
    public void setCommentAuthorUrl(String commentAuthorUrl) {
        this.commentAuthorUrl = commentAuthorUrl;
    }

    /**
     * Gets comment author ip.
     *
     * @return the comment author ip
     */
    public String getCommentAuthorIp() {
        return commentAuthorIp;
    }

    /**
     * Sets comment author ip.
     *
     * @param commentAuthorIp the comment author ip
     */
    public void setCommentAuthorIp(String commentAuthorIp) {
        this.commentAuthorIp = commentAuthorIp;
    }

    /**
     * Gets comment date.
     *
     * @return the comment date
     */
    public Date getCommentDate() {
        return commentDate;
    }

    /**
     * Sets comment date.
     *
     * @param commentDate the comment date
     */
    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    /**
     * Gets comment date gmt.
     *
     * @return the comment date gmt
     */
    public Date getCommentDateGmt() {
        return commentDateGmt;
    }

    /**
     * Sets comment date gmt.
     *
     * @param commentDateGmt the comment date gmt
     */
    public void setCommentDateGmt(Date commentDateGmt) {
        this.commentDateGmt = commentDateGmt;
    }

    /**
     * Gets comment karma.
     *
     * @return the comment karma
     */
    public Integer getCommentKarma() {
        return commentKarma;
    }

    /**
     * Sets comment karma.
     *
     * @param commentKarma the comment karma
     */
    public void setCommentKarma(Integer commentKarma) {
        this.commentKarma = commentKarma;
    }

    /**
     * Gets comment approved.
     *
     * @return the comment approved
     */
    public String getCommentApproved() {
        return commentApproved;
    }

    /**
     * Sets comment approved.
     *
     * @param commentApproved the comment approved
     */
    public void setCommentApproved(String commentApproved) {
        this.commentApproved = commentApproved;
    }

    /**
     * Gets comment agent.
     *
     * @return the comment agent
     */
    public String getCommentAgent() {
        return commentAgent;
    }

    /**
     * Sets comment agent.
     *
     * @param commentAgent the comment agent
     */
    public void setCommentAgent(String commentAgent) {
        this.commentAgent = commentAgent;
    }

    /**
     * Gets comment type.
     *
     * @return the comment type
     */
    public String getCommentType() {
        return commentType;
    }

    /**
     * Sets comment type.
     *
     * @param commentType the comment type
     */
    public void setCommentType(String commentType) {
        this.commentType = commentType;
    }

    /**
     * Gets comment parent.
     *
     * @return the comment parent
     */
    public Long getCommentParent() {
        return commentParent;
    }

    /**
     * Sets comment parent.
     *
     * @param commentParent the comment parent
     */
    public void setCommentParent(Long commentParent) {
        this.commentParent = commentParent;
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
     * Gets comment content.
     *
     * @return the comment content
     */
    public String getCommentContent() {
        return commentContent;
    }

    /**
     * Sets comment content.
     *
     * @param commentContent the comment content
     */
    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
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
        Comment other = (Comment) that;
        return (this.getCommentId() == null ? other.getCommentId() == null : this.getCommentId().equals(other.getCommentId()))
                && (this.getCommentPostId() == null ? other.getCommentPostId() == null : this.getCommentPostId().equals(other.getCommentPostId()))
                && (this.getCommentAuthor() == null ? other.getCommentAuthor() == null : this.getCommentAuthor().equals(other.getCommentAuthor()))
                && (this.getCommentAuthorEmail() == null ? other.getCommentAuthorEmail() == null : this.getCommentAuthorEmail().equals(other.getCommentAuthorEmail()))
                && (this.getCommentAuthorUrl() == null ? other.getCommentAuthorUrl() == null : this.getCommentAuthorUrl().equals(other.getCommentAuthorUrl()))
                && (this.getCommentAuthorIp() == null ? other.getCommentAuthorIp() == null : this.getCommentAuthorIp().equals(other.getCommentAuthorIp()))
                && (this.getCommentDate() == null ? other.getCommentDate() == null : this.getCommentDate().equals(other.getCommentDate()))
                && (this.getCommentDateGmt() == null ? other.getCommentDateGmt() == null : this.getCommentDateGmt().equals(other.getCommentDateGmt()))
                && (this.getCommentKarma() == null ? other.getCommentKarma() == null : this.getCommentKarma().equals(other.getCommentKarma()))
                && (this.getCommentApproved() == null ? other.getCommentApproved() == null : this.getCommentApproved().equals(other.getCommentApproved()))
                && (this.getCommentAgent() == null ? other.getCommentAgent() == null : this.getCommentAgent().equals(other.getCommentAgent()))
                && (this.getCommentType() == null ? other.getCommentType() == null : this.getCommentType().equals(other.getCommentType()))
                && (this.getCommentParent() == null ? other.getCommentParent() == null : this.getCommentParent().equals(other.getCommentParent()))
                && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
                && (this.getCommentContent() == null ? other.getCommentContent() == null : this.getCommentContent().equals(other.getCommentContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCommentId() == null) ? 0 : getCommentId().hashCode());
        result = prime * result + ((getCommentPostId() == null) ? 0 : getCommentPostId().hashCode());
        result = prime * result + ((getCommentAuthor() == null) ? 0 : getCommentAuthor().hashCode());
        result = prime * result + ((getCommentAuthorEmail() == null) ? 0 : getCommentAuthorEmail().hashCode());
        result = prime * result + ((getCommentAuthorUrl() == null) ? 0 : getCommentAuthorUrl().hashCode());
        result = prime * result + ((getCommentAuthorIp() == null) ? 0 : getCommentAuthorIp().hashCode());
        result = prime * result + ((getCommentDate() == null) ? 0 : getCommentDate().hashCode());
        result = prime * result + ((getCommentDateGmt() == null) ? 0 : getCommentDateGmt().hashCode());
        result = prime * result + ((getCommentKarma() == null) ? 0 : getCommentKarma().hashCode());
        result = prime * result + ((getCommentApproved() == null) ? 0 : getCommentApproved().hashCode());
        result = prime * result + ((getCommentAgent() == null) ? 0 : getCommentAgent().hashCode());
        result = prime * result + ((getCommentType() == null) ? 0 : getCommentType().hashCode());
        result = prime * result + ((getCommentParent() == null) ? 0 : getCommentParent().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCommentContent() == null) ? 0 : getCommentContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commentId=").append(commentId);
        sb.append(", commentPostId=").append(commentPostId);
        sb.append(", commentAuthor=").append(commentAuthor);
        sb.append(", commentAuthorEmail=").append(commentAuthorEmail);
        sb.append(", commentAuthorUrl=").append(commentAuthorUrl);
        sb.append(", commentAuthorIp=").append(commentAuthorIp);
        sb.append(", commentDate=").append(commentDate);
        sb.append(", commentDateGmt=").append(commentDateGmt);
        sb.append(", commentKarma=").append(commentKarma);
        sb.append(", commentApproved=").append(commentApproved);
        sb.append(", commentAgent=").append(commentAgent);
        sb.append(", commentType=").append(commentType);
        sb.append(", commentParent=").append(commentParent);
        sb.append(", userId=").append(userId);
        sb.append(", commentContent=").append(commentContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}