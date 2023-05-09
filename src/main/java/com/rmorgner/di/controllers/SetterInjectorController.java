package com.rmorgner.di.controllers;

import com.rmorgner.di.services.GreetingService;

public class SetterInjectorController implements InjectionController{

  private GreetingService greetingService;

  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello(){
    System.out.println("Setter Injection");
    return greetingService.sayGreeting();
  }
}
