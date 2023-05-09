package com.rmorgner.di;

import com.rmorgner.di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DependencyInjectionApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private MyController controller;

	@Test
	void testGetControllerFromContext(){
		MyController controller = applicationContext.getBean(MyController.class);
		System.out.println(controller.sayHello());
	}

	@Test
	void testInjectedController(){
		System.out.println(controller.sayHello());
	}

	@Test
	void contextLoads() {

	}

}
