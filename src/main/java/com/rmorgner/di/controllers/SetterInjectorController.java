package com.rmorgner.di.controllers;

import com.rmorgner.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectorController implements InjectionController{

  private GreetingService greetingService;

  @Autowired
  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello(){
    System.out.println("Setter Injection");
    return greetingService.sayGreeting();
  }
}
