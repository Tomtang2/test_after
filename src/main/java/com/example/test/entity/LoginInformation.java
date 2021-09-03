package com.example.test.entity;

import org.springframework.stereotype.Controller;

import javax.persistence.Entity;
//登陆用户实体类
@Entity
public class LoginInformation {
    private String username;
    private String password;
    private String token;
    @Override
    public String toString() {
        return "LoginInformation{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", token='" + token + '\'' +
                '}';
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }



}
