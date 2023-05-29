package com.rmorgner.di.controllers.env;

import com.rmorgner.di.services.EnvironmentGreeting;
import com.rmorgner.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

  private final EnvironmentGreeting greetingService;

  @Autowired
  public EnvironmentController(@Qualifier("env") EnvironmentGreeting greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello(){
    return greetingService.sayEnvironmentGreeting();
  }

}
