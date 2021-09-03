package com.example.test.service;

import com.example.test.entity.UserInformation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserInformationService {
    private UserInformation userInformation;
    public UserInformationService(){

    }
    public UserInformationService(UserInformation userInformation){
        this.userInformation=userInformation;
    }
    public Integer getId(){
        return this.userInformation.getId();
    }
    public String getUserName(){
        return this.userInformation.getUsername();
    }
    public String getPassword(){
        return this.userInformation.getPassword();
    }
    public String getPersonalEmail(){
        return this.userInformation.getPersonalemail();
    }
    public String getPhone(){
        return this.userInformation.getPhone();
    }
    public Boolean getMsg_status(){
        return this.userInformation.getMsg_status();
    }
    public UserInformation getUserInformation(){
        return this.userInformation;
    }

    public List<UserInformation> findAllUserInformation(){


        return null;
    }
}
