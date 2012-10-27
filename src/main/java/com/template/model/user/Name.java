package com.template.model.user;

/**
 * Created by IntelliJ IDEA.
 * User: MYCO
 * Date: 11-7-7
 * Time: 下午10:02
 * To change this template use File | Settings | File Templates.
 */
public class Name {
    private String firstName;
    private String middleName;
    private String lastName;
    private String nickName;

    public Name() {
    }

    public Name(String firstName, String middleName, String lastName, String nickName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickName = nickName;
    }
}
