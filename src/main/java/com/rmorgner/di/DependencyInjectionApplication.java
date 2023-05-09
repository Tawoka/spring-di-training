package com.rmorgner.di;

import com.rmorgner.di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

		MyController controller = context.getBean(MyController.class);

		System.out.println("I'm in the main method");

		System.out.println(controller.sayHello());
	}

}
