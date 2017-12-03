package com.ihowq.wordpress.api.model.pojo.termtaxonomy;

import java.io.Serializable;

/**
 * The type Term taxonomy.
 *
 * @author
 */
public class TermTaxonomy implements Serializable {
    private static final long serialVersionUID = 5298365657367239307L;
    private Long termTaxonomyId;
    private Long termId;
    private String taxonomy;
    private Long parent;
    private Long count;
    private String description;

    /**
     * Gets term taxonomy id.
     *
     * @return the term taxonomy id
     */
    public Long getTermTaxonomyId() {
        return termTaxonomyId;
    }

    /**
     * Sets term taxonomy id.
     *
     * @param termTaxonomyId the term taxonomy id
     */
    public void setTermTaxonomyId(Long termTaxonomyId) {
        this.termTaxonomyId = termTaxonomyId;
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
     * Gets taxonomy.
     *
     * @return the taxonomy
     */
    public String getTaxonomy() {
        return taxonomy;
    }

    /**
     * Sets taxonomy.
     *
     * @param taxonomy the taxonomy
     */
    public void setTaxonomy(String taxonomy) {
        this.taxonomy = taxonomy;
    }

    /**
     * Gets parent.
     *
     * @return the parent
     */
    public Long getParent() {
        return parent;
    }

    /**
     * Sets parent.
     *
     * @param parent the parent
     */
    public void setParent(Long parent) {
        this.parent = parent;
    }

    /**
     * Gets count.
     *
     * @return the count
     */
    public Long getCount() {
        return count;
    }

    /**
     * Sets count.
     *
     * @param count the count
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
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
        TermTaxonomy other = (TermTaxonomy) that;
        return (this.getTermTaxonomyId() == null ? other.getTermTaxonomyId() == null : this.getTermTaxonomyId().equals(other.getTermTaxonomyId()))
                && (this.getTermId() == null ? other.getTermId() == null : this.getTermId().equals(other.getTermId()))
                && (this.getTaxonomy() == null ? other.getTaxonomy() == null : this.getTaxonomy().equals(other.getTaxonomy()))
                && (this.getParent() == null ? other.getParent() == null : this.getParent().equals(other.getParent()))
                && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
                && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTermTaxonomyId() == null) ? 0 : getTermTaxonomyId().hashCode());
        result = prime * result + ((getTermId() == null) ? 0 : getTermId().hashCode());
        result = prime * result + ((getTaxonomy() == null) ? 0 : getTaxonomy().hashCode());
        result = prime * result + ((getParent() == null) ? 0 : getParent().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", termTaxonomyId=").append(termTaxonomyId);
        sb.append(", termId=").append(termId);
        sb.append(", taxonomy=").append(taxonomy);
        sb.append(", parent=").append(parent);
        sb.append(", count=").append(count);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}