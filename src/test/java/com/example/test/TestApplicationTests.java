package com.example.test;

import com.example.test.entity.UserInformation;
import com.example.test.service.UserInformationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {
	@Autowired
	UserInformation userInformation;

	@Test
	void contextLoads() {
		System.out.println(userInformation);
	}

	@Test
	void UserInformationLoads(){
		UserInformationService userInformationService=new UserInformationService();
		System.out.println(userInformationService.findAllUserInformation());
	}

}
