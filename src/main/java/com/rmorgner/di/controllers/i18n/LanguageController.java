package com.rmorgner.di.controllers.i18n;

import com.rmorgner.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class LanguageController {

  private GreetingService greetingService;

  public LanguageController(@Qualifier("i18nService") GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello(){
    return greetingService.sayGreeting();
  }

}
