package com.rmorgner.di.controllers;

import com.rmorgner.di.services.GreetingService;
import com.rmorgner.di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FactoryInjectionControllerTest {

  GreetingService greetingService;

  @BeforeEach
  void setUp() {
    greetingService = new GreetingServiceImpl();
  }

  @Test
  void buildConstructor() {
    InjectionController instance = FactoryInjectionController.createInstance(greetingService, InjectionType.CONSTRUCTOR);
    System.out.println(instance.sayHello());
  }

  @Test
  void buildSetter() {
    InjectionController instance = FactoryInjectionController.createInstance(greetingService, InjectionType.SETTER);
    System.out.println(instance.sayHello());
  }

  @Test
  void buildProperty() {
    InjectionController instance = FactoryInjectionController.createInstance(greetingService, InjectionType.PROPERTY);
    System.out.println(instance.sayHello());
  }
}