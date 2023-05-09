package com.rmorgner.di.controllers;

import com.rmorgner.di.services.GreetingService;

public class FactoryInjectionController {

  private FactoryInjectionController(){}

  public static InjectionController createInstance(GreetingService service, InjectionType type){
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
