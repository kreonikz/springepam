package com.epam.learnspring.model;

import com.epam.learnspring.model.enums.Role;

public class User {
    private Long id;
    private String username;
    private String password;
    private Role role;

    public User() {
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
