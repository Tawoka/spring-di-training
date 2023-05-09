package com.rmorgner.di.controllers;

import com.rmorgner.di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class FactoryInjectionController {

  private final GreetingService service;

  public FactoryInjectionController(GreetingService service){
    this.service = service;
  }

  public InjectionController createInstance(InjectionType type){
    switch (type){
      case CONSTRUCTOR -> {
        return new ConstructorInjectController(service);
      }
      case PROPERTY -> {
        PropertyInjectorController propertyInjectorController = new PropertyInjectorController();
        propertyInjectorController.greetingService = service;
        return propertyInjectorController;
      }
      case SETTER -> {
        SetterInjectorController setterInjectorController = new SetterInjectorController();
        setterInjectorController.setGreetingService(service);
        return setterInjectorController;
      }
    }
    return new InjectionController() {
      @Override
      public String sayHello() {
        return "Hello from the default Implementation of the injection controller";
      }
    };
  }

}
