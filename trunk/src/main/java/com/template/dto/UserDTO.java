package com.template.dto;

import com.template.model.User;

/**
 * Created by IntelliJ IDEA.
 * User: Lenovo
 * Date: 12-10-28
 * Time: 下午12:41
 */
public class UserDTO {
    private String username;
    private String password;

    public UserDTO() {
    }

    public UserDTO(User user) {
        this.username = user.username();
        this.password = user.password();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User toUser() {
        return new User(this.username, this.password);
    }
}
