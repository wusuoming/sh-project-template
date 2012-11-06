package com.template.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Lenovo
 * Date: 12-10-31
 * Time: 下午11:14
 */
public class Role extends BasicObject {
    private String name;
    private List<Privilege> privileges = new ArrayList<Privilege>();

    public String name() {
        return name;
    }
}
