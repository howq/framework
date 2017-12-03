package com.ihowq.wordpress.api.model.pojo.termrelationship;

import java.io.Serializable;

/**
 * The type Term relationship key.
 *
 * @author
 */
public class TermRelationshipKey implements Serializable {
    private static final long serialVersionUID = -1406813415019981506L;
    private Long objectId;
    private Long termTaxonomyId;

    /**
     * Gets object id.
     *
     * @return the object id
     */
    public Long getObjectId() {
        return objectId;
    }

    /**
     * Sets object id.
     *
     * @param objectId the object id
     */
    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

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
        TermRelationshipKey other = (TermRelationshipKey) that;
        return (this.getObjectId() == null ? other.getObjectId() == null : this.getObjectId().equals(other.getObjectId()))
                && (this.getTermTaxonomyId() == null ? other.getTermTaxonomyId() == null : this.getTermTaxonomyId().equals(other.getTermTaxonomyId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getObjectId() == null) ? 0 : getObjectId().hashCode());
        result = prime * result + ((getTermTaxonomyId() == null) ? 0 : getTermTaxonomyId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", objectId=").append(objectId);
        sb.append(", termTaxonomyId=").append(termTaxonomyId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}