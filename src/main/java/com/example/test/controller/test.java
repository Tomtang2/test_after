package com.example.test.controller;

import com.example.test.entity.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class test {

    @RequestMapping(value = "/hello")
    public Map my( String name,String sex,Integer age){
        Person person=new Person();
        person.setName("汤天宝");
        person.setSex("男");
        person.setAge(12);
        Map<String,Person>map=new HashMap<>();
        map.put("打工人",person);
        return map;
    }
}
