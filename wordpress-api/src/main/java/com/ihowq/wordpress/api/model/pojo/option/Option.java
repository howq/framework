package com.ihowq.wordpress.api.model.pojo.option;

import java.io.Serializable;

/**
 * The type Option.
 *
 * @author
 */
public class Option implements Serializable {
    private static final long serialVersionUID = -385039858702206366L;
    /**
     * 自增唯一ID
     */
    private Long optionId;

    /**
     * 键名
     */
    private String optionName;

    /**
     * 在WordPress载入时自动载入（yes/no）
     */
    private String autoload;

    /**
     * 键值
     */
    private String optionValue;

    /**
     * Gets option id.
     *
     * @return the option id
     */
    public Long getOptionId() {
        return optionId;
    }

    /**
     * Sets option id.
     *
     * @param optionId the option id
     */
    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    /**
     * Gets option name.
     *
     * @return the option name
     */
    public String getOptionName() {
        return optionName;
    }

    /**
     * Sets option name.
     *
     * @param optionName the option name
     */
    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    /**
     * Gets autoload.
     *
     * @return the autoload
     */
    public String getAutoload() {
        return autoload;
    }

    /**
     * Sets autoload.
     *
     * @param autoload the autoload
     */
    public void setAutoload(String autoload) {
        this.autoload = autoload;
    }

    /**
     * Gets option value.
     *
     * @return the option value
     */
    public String getOptionValue() {
        return optionValue;
    }

    /**
     * Sets option value.
     *
     * @param optionValue the option value
     */
    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
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
        Option other = (Option) that;
        return (this.getOptionId() == null ? other.getOptionId() == null : this.getOptionId().equals(other.getOptionId()))
                && (this.getOptionName() == null ? other.getOptionName() == null : this.getOptionName().equals(other.getOptionName()))
                && (this.getAutoload() == null ? other.getAutoload() == null : this.getAutoload().equals(other.getAutoload()))
                && (this.getOptionValue() == null ? other.getOptionValue() == null : this.getOptionValue().equals(other.getOptionValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOptionId() == null) ? 0 : getOptionId().hashCode());
        result = prime * result + ((getOptionName() == null) ? 0 : getOptionName().hashCode());
        result = prime * result + ((getAutoload() == null) ? 0 : getAutoload().hashCode());
        result = prime * result + ((getOptionValue() == null) ? 0 : getOptionValue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", optionId=").append(optionId);
        sb.append(", optionName=").append(optionName);
        sb.append(", autoload=").append(autoload);
        sb.append(", optionValue=").append(optionValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}