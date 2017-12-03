package com.ihowq.wordpress.api.model.pojo.term;

import java.io.Serializable;

/**
 * The type Term.
 *
 * @author
 */
public class Term implements Serializable {
    private static final long serialVersionUID = -2018230385861801163L;
    private Long termId;
    private String name;
    private String slug;
    private Long termGroup;

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
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets slug.
     *
     * @return the slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * Sets slug.
     *
     * @param slug the slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * Gets term group.
     *
     * @return the term group
     */
    public Long getTermGroup() {
        return termGroup;
    }

    /**
     * Sets term group.
     *
     * @param termGroup the term group
     */
    public void setTermGroup(Long termGroup) {
        this.termGroup = termGroup;
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
        Term other = (Term) that;
        return (this.getTermId() == null ? other.getTermId() == null : this.getTermId().equals(other.getTermId()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getSlug() == null ? other.getSlug() == null : this.getSlug().equals(other.getSlug()))
                && (this.getTermGroup() == null ? other.getTermGroup() == null : this.getTermGroup().equals(other.getTermGroup()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTermId() == null) ? 0 : getTermId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSlug() == null) ? 0 : getSlug().hashCode());
        result = prime * result + ((getTermGroup() == null) ? 0 : getTermGroup().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", termId=").append(termId);
        sb.append(", name=").append(name);
        sb.append(", slug=").append(slug);
        sb.append(", termGroup=").append(termGroup);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}