package com.template.model;


import com.template.utils.GUIDGenerator;

/**
 * Created by IntelliJ IDEA.
 * User: alexzhong
 * Date: 7/6/11
 * Time: 4:14 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class BasicObject {
    private Integer id;
    private Integer version;
    private Boolean active = Boolean.TRUE;
    private String guid = GUIDGenerator.guid();

    public Boolean getActive() {
        return active;
    }

    public String getGuid() {
        return guid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BasicObject)) return false;

        BasicObject that = (BasicObject) o;

        if (guid != null ? !guid.equals(that.guid) : that.guid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return guid != null ? guid.hashCode() : 0;
    }
}
