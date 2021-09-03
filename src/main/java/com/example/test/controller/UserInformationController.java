package com.example.test.controller;

import com.example.test.entity.UserInformation;
import com.example.test.service.UserInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin
@RestController
public class UserInformationController {

    @RequestMapping(value="/userlist",method= RequestMethod.GET)
    public Map<String,Object> userInformationMap(@RequestParam(name="query" ,required = false)String query,@RequestParam(name="pagenum")String pagenum,
                                                    @RequestParam(name="pagesize" )String pagesize){
        UserInformationService userInformationService=new UserInformationService();
        userInformationService.findAllUserInformation();
        Map<String,Object>map=new HashMap<>();
        map.put("data",userInformationService.findAllUserInformation());
        map.put("status",new Integer(201));
        map.put("pagesize",Integer.parseInt(pagesize));
        map.put("total",new Integer(3));
        return  map;
    }
}
