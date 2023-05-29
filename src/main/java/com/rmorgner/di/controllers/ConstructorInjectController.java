package com.rmorgner.di.controllers;

import com.rmorgner.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectController implements InjectionController {

  private final GreetingService greetingService;

  public ConstructorInjectController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello(){
    System.out.println("Constructor Injection");
    return greetingService.sayGreeting();
  }
}
