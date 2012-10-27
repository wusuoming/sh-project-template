package com.template.utils;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * User: alexzhong
 * Date: 7/6/11
 * Time: 4:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class GUIDGenerator {

    public static String guid() {
        return UUID.randomUUID().toString();
    }
}
