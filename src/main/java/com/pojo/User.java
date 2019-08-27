package com.pojo;

public class User {
    private Integer id;

    private String username;

    private String userpassword;

    private String usertype;

    private String userstatue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype == null ? null : usertype.trim();
    }

    public String getUserstatue() {
        return userstatue;
    }

    public void setUserstatue(String userstatue) {
        this.userstatue = userstatue == null ? null : userstatue.trim();
    }
}