package com.example.test.controller;

import com.alibaba.fastjson.JSON;
import com.example.test.entity.LoginInformation;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@CrossOrigin
public class LoginInfoController {
    @RequestMapping(value="/userinformation",method=RequestMethod.POST)
    public String  login(@RequestBody HashMap<String,Object> s){
        System.out.println(s);
        LoginInformation loginInformation=new LoginInformation();
        loginInformation.setUsername("ttb");
        loginInformation.setPassword("123456");
        loginInformation.setToken("022232324325432");
        String userJson = JSON.toJSONString(loginInformation);
        return userJson;
    }
    @RequestMapping(value="/test")
    public String test()
    {
        return "hello";
    }
}
