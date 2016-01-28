package com.nearsoft.nearsoftpair.model;

/**
 * Created by cyn on 01/28/2016.
 */
public class User {
    private String username;
    private String full_name;

    public User(String username, String full_name) {
        this.username = username;
        this.full_name = full_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }
}
