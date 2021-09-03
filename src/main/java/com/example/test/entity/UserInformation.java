package com.example.test.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@Entity
@Component
@ConfigurationProperties(prefix = "userinformation")
public class UserInformation {
    private Integer id;
    private String  username;
    private String password;
    private String personalemail;
    private String phone;
    private Boolean msg_status;
    @Override
    public String toString() {
        return "UserInformation{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", personalemail='" + personalemail + '\'' +
                ", phone='" + phone + '\'' +
                ", msg_status=" + msg_status +
                '}';
    }

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
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPersonalemail() {
        return personalemail;
    }

    public void setPersonalemail(String personalemail) {
        this.personalemail = personalemail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getMsg_status() {
        return msg_status;
    }

    public void setMsg_status(Boolean msg_status) {
        this.msg_status = msg_status;
    }


}
