package com.rmorgner.di.controllers;

import com.rmorgner.di.services.GreetingService;

public class PropertyInjectorController implements InjectionController {

  GreetingService greetingService;

  public String sayHello(){
    System.out.println("Property Injection");
    return greetingService.sayGreeting();
  }

}
