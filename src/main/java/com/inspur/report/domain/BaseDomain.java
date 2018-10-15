package com.inspur.report.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseDomain implements Serializable {

//    private static final long serialVersionUID = -5366633233978016471L;

    private Map<String, Object> extAttrs;

    public Object getExtAttr(String key) {
        return null != extAttrs ? extAttrs.get(key) : null;
    }

    public String getExtAttrString(String key) {
        return null != extAttrs ? (String) extAttrs.get(key) : null;
    }

    public Integer getExtAttrInteger(String key) {
        return null != extAttrs ? ((BigDecimal) extAttrs.get(key)).intValue() : null;
    }

    public Long getExtAttrLong(String key) {
        return null != extAttrs ? ((BigDecimal) extAttrs.get(key)).longValue() : null;
    }

    public Float getExtAttrFloat(String key) {
        return null != extAttrs ? ((BigDecimal) extAttrs.get(key)).floatValue() : null;
    }

    public Double getExtAttrDouble(String key) {
        return null != extAttrs ? ((BigDecimal) extAttrs.get(key)).doubleValue() : null;
    }

    public BigDecimal getExtAttrBigDecimal(String key) {
        return null != extAttrs ? (BigDecimal) extAttrs.get(key) : null;
    }

    public byte[] getExtAttrbyties(String key) {
        return null != extAttrs ? (byte[]) extAttrs.get(key) : null;
    }

    public void addExtAttr(String key, Object value) {
        if (null == this.extAttrs) {
            this.extAttrs = new HashMap<>();
        }
        this.extAttrs.put(key, value);
    }

    public void removeExtAttr(String key) {
        if (null != this.extAttrs) {
            this.extAttrs.remove(key);
        }
    }

    public Map<String, Object> getExtAttrs() {
        return extAttrs;
    }

}
