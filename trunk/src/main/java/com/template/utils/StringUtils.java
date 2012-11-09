package com.template.utils;

/**
 * Created by IntelliJ IDEA.
 * User: Zhong Gang
 * Date: 12-11-9
 * Time: 下午7:39
 */
public class StringUtils {

    public static boolean isEmpty(String value) {
        return value == null || value.trim().equals("");
    }
}
