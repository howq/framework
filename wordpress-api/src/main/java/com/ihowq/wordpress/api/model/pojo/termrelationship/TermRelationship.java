package com.ihowq.wordpress.api.model.pojo.termrelationship;

import java.io.Serializable;

/**
 * The type Term relationship.
 */
public class TermRelationship extends TermRelationshipKey implements Serializable {
    private static final long serialVersionUID = -6502647987101044286L;
    /**
     * 排序
     */
    private Integer termOrder;

    /**
     * Gets term order.
     *
     * @return the term order
     */
    public Integer getTermOrder() {
        return termOrder;
    }

    /**
     * Sets term order.
     *
     * @param termOrder the term order
     */
    public void setTermOrder(Integer termOrder) {
        this.termOrder = termOrder;
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
        TermRelationship other = (TermRelationship) that;
        return (this.getObjectId() == null ? other.getObjectId() == null : this.getObjectId().equals(other.getObjectId()))
                && (this.getTermTaxonomyId() == null ? other.getTermTaxonomyId() == null : this.getTermTaxonomyId().equals(other.getTermTaxonomyId()))
                && (this.getTermOrder() == null ? other.getTermOrder() == null : this.getTermOrder().equals(other.getTermOrder()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getObjectId() == null) ? 0 : getObjectId().hashCode());
        result = prime * result + ((getTermTaxonomyId() == null) ? 0 : getTermTaxonomyId().hashCode());
        result = prime * result + ((getTermOrder() == null) ? 0 : getTermOrder().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", termOrder=").append(termOrder);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}