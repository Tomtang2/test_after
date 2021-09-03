package com.example.test.datapakage;

import com.example.test.entity.UserInformation;
import com.sun.xml.bind.v2.runtime.reflect.opt.Const;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserInformationData {
    public static List<UserInformation> userInformationData;
    private final static List<Map<String, Object>> userList = new ArrayList<>();
    static {
        List<UserInformation> list=new ArrayList<>();
        UserInformation f1=new UserInformation();
        f1.setId(1);
        f1.setUsername("李四");
        f1.setPassword("14123");
        f1.setPhone("15061884024");
        f1.setPersonalemail("dsgad@enn.com");
        f1.setMsg_status(false);

        UserInformation f2=new UserInformation();
        f2.setId(2);
        f2.setUsername("王五");
        f2.setPassword("135324");
        f2.setPhone("15061884451");
        f2.setPersonalemail("asdgad@enn.com");
        f2.setMsg_status(false);

        UserInformation f3=new UserInformation();
        f3.setId(3);
        f3.setUsername("刘能");
        f3.setPassword("123513451");
        f3.setPhone("15033045643");
        f3.setPersonalemail("1279dasc@enn.com");
        f3.setMsg_status(true);

        list.add(f1);
        list.add(f2);
        list.add(f3);
    }
}
