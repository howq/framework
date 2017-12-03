package com.ihowq.wordpress.api.model.pojo.link;

import java.io.Serializable;
import java.util.Date;

/**
 * The type Link.
 *
 * @author
 */
public class Link implements Serializable {
    private static final long serialVersionUID = 8770001609421904493L;
    /**
     * 自增唯一ID
     */
    private Long linkId;

    /**
     * 链接URL
     */
    private String linkUrl;

    /**
     * 链接标题
     */
    private String linkName;

    /**
     * 链接图片
     */
    private String linkImage;

    /**
     * 链接打开方式
     */
    private String linkTarget;

    /**
     * 链接描述
     */
    private String linkDescription;

    /**
     * 是否可见（Y/N）
     */
    private String linkVisible;

    /**
     * 添加者用户ID
     */
    private Long linkOwner;

    /**
     * 评分等级
     */
    private Integer linkRating;

    private Date linkUpdated;

    /**
     * XFN关系
     */
    private String linkRel;

    /**
     * 链接RSS地址
     */
    private String linkRss;

    /**
     * XFN注释
     */
    private String linkNotes;

    /**
     * Gets link id.
     *
     * @return the link id
     */
    public Long getLinkId() {
        return linkId;
    }

    /**
     * Sets link id.
     *
     * @param linkId the link id
     */
    public void setLinkId(Long linkId) {
        this.linkId = linkId;
    }

    /**
     * Gets link url.
     *
     * @return the link url
     */
    public String getLinkUrl() {
        return linkUrl;
    }

    /**
     * Sets link url.
     *
     * @param linkUrl the link url
     */
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    /**
     * Gets link name.
     *
     * @return the link name
     */
    public String getLinkName() {
        return linkName;
    }

    /**
     * Sets link name.
     *
     * @param linkName the link name
     */
    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    /**
     * Gets link image.
     *
     * @return the link image
     */
    public String getLinkImage() {
        return linkImage;
    }

    /**
     * Sets link image.
     *
     * @param linkImage the link image
     */
    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }

    /**
     * Gets link target.
     *
     * @return the link target
     */
    public String getLinkTarget() {
        return linkTarget;
    }

    /**
     * Sets link target.
     *
     * @param linkTarget the link target
     */
    public void setLinkTarget(String linkTarget) {
        this.linkTarget = linkTarget;
    }

    /**
     * Gets link description.
     *
     * @return the link description
     */
    public String getLinkDescription() {
        return linkDescription;
    }

    /**
     * Sets link description.
     *
     * @param linkDescription the link description
     */
    public void setLinkDescription(String linkDescription) {
        this.linkDescription = linkDescription;
    }

    /**
     * Gets link visible.
     *
     * @return the link visible
     */
    public String getLinkVisible() {
        return linkVisible;
    }

    /**
     * Sets link visible.
     *
     * @param linkVisible the link visible
     */
    public void setLinkVisible(String linkVisible) {
        this.linkVisible = linkVisible;
    }

    /**
     * Gets link owner.
     *
     * @return the link owner
     */
    public Long getLinkOwner() {
        return linkOwner;
    }

    /**
     * Sets link owner.
     *
     * @param linkOwner the link owner
     */
    public void setLinkOwner(Long linkOwner) {
        this.linkOwner = linkOwner;
    }

    /**
     * Gets link rating.
     *
     * @return the link rating
     */
    public Integer getLinkRating() {
        return linkRating;
    }

    /**
     * Sets link rating.
     *
     * @param linkRating the link rating
     */
    public void setLinkRating(Integer linkRating) {
        this.linkRating = linkRating;
    }

    /**
     * Gets link updated.
     *
     * @return the link updated
     */
    public Date getLinkUpdated() {
        return linkUpdated;
    }

    /**
     * Sets link updated.
     *
     * @param linkUpdated the link updated
     */
    public void setLinkUpdated(Date linkUpdated) {
        this.linkUpdated = linkUpdated;
    }

    /**
     * Gets link rel.
     *
     * @return the link rel
     */
    public String getLinkRel() {
        return linkRel;
    }

    /**
     * Sets link rel.
     *
     * @param linkRel the link rel
     */
    public void setLinkRel(String linkRel) {
        this.linkRel = linkRel;
    }

    /**
     * Gets link rss.
     *
     * @return the link rss
     */
    public String getLinkRss() {
        return linkRss;
    }

    /**
     * Sets link rss.
     *
     * @param linkRss the link rss
     */
    public void setLinkRss(String linkRss) {
        this.linkRss = linkRss;
    }

    /**
     * Gets link notes.
     *
     * @return the link notes
     */
    public String getLinkNotes() {
        return linkNotes;
    }

    /**
     * Sets link notes.
     *
     * @param linkNotes the link notes
     */
    public void setLinkNotes(String linkNotes) {
        this.linkNotes = linkNotes;
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
        Link other = (Link) that;
        return (this.getLinkId() == null ? other.getLinkId() == null : this.getLinkId().equals(other.getLinkId()))
                && (this.getLinkUrl() == null ? other.getLinkUrl() == null : this.getLinkUrl().equals(other.getLinkUrl()))
                && (this.getLinkName() == null ? other.getLinkName() == null : this.getLinkName().equals(other.getLinkName()))
                && (this.getLinkImage() == null ? other.getLinkImage() == null : this.getLinkImage().equals(other.getLinkImage()))
                && (this.getLinkTarget() == null ? other.getLinkTarget() == null : this.getLinkTarget().equals(other.getLinkTarget()))
                && (this.getLinkDescription() == null ? other.getLinkDescription() == null : this.getLinkDescription().equals(other.getLinkDescription()))
                && (this.getLinkVisible() == null ? other.getLinkVisible() == null : this.getLinkVisible().equals(other.getLinkVisible()))
                && (this.getLinkOwner() == null ? other.getLinkOwner() == null : this.getLinkOwner().equals(other.getLinkOwner()))
                && (this.getLinkRating() == null ? other.getLinkRating() == null : this.getLinkRating().equals(other.getLinkRating()))
                && (this.getLinkUpdated() == null ? other.getLinkUpdated() == null : this.getLinkUpdated().equals(other.getLinkUpdated()))
                && (this.getLinkRel() == null ? other.getLinkRel() == null : this.getLinkRel().equals(other.getLinkRel()))
                && (this.getLinkRss() == null ? other.getLinkRss() == null : this.getLinkRss().equals(other.getLinkRss()))
                && (this.getLinkNotes() == null ? other.getLinkNotes() == null : this.getLinkNotes().equals(other.getLinkNotes()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLinkId() == null) ? 0 : getLinkId().hashCode());
        result = prime * result + ((getLinkUrl() == null) ? 0 : getLinkUrl().hashCode());
        result = prime * result + ((getLinkName() == null) ? 0 : getLinkName().hashCode());
        result = prime * result + ((getLinkImage() == null) ? 0 : getLinkImage().hashCode());
        result = prime * result + ((getLinkTarget() == null) ? 0 : getLinkTarget().hashCode());
        result = prime * result + ((getLinkDescription() == null) ? 0 : getLinkDescription().hashCode());
        result = prime * result + ((getLinkVisible() == null) ? 0 : getLinkVisible().hashCode());
        result = prime * result + ((getLinkOwner() == null) ? 0 : getLinkOwner().hashCode());
        result = prime * result + ((getLinkRating() == null) ? 0 : getLinkRating().hashCode());
        result = prime * result + ((getLinkUpdated() == null) ? 0 : getLinkUpdated().hashCode());
        result = prime * result + ((getLinkRel() == null) ? 0 : getLinkRel().hashCode());
        result = prime * result + ((getLinkRss() == null) ? 0 : getLinkRss().hashCode());
        result = prime * result + ((getLinkNotes() == null) ? 0 : getLinkNotes().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", linkId=").append(linkId);
        sb.append(", linkUrl=").append(linkUrl);
        sb.append(", linkName=").append(linkName);
        sb.append(", linkImage=").append(linkImage);
        sb.append(", linkTarget=").append(linkTarget);
        sb.append(", linkDescription=").append(linkDescription);
        sb.append(", linkVisible=").append(linkVisible);
        sb.append(", linkOwner=").append(linkOwner);
        sb.append(", linkRating=").append(linkRating);
        sb.append(", linkUpdated=").append(linkUpdated);
        sb.append(", linkRel=").append(linkRel);
        sb.append(", linkRss=").append(linkRss);
        sb.append(", linkNotes=").append(linkNotes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}