package com.rmorgner.di.controllers;

import com.rmorgner.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectorController implements InjectionController {

  @SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
  @Qualifier("propertyGreetingService")
  @Autowired
  GreetingService greetingService;

  public String sayHello(){
    System.out.println("Property Injection");
    return greetingService.sayGreeting();
  }

}
