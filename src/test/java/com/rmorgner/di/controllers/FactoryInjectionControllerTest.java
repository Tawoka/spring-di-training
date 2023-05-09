package com.rmorgner.di.controllers;

import com.rmorgner.di.services.GreetingService;
import com.rmorgner.di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FactoryInjectionControllerTest {

  @Autowired
  FactoryInjectionController factoryInjectionController;

  @Test
  void buildConstructor() {
    InjectionController instance = factoryInjectionController.createInstance(InjectionType.CONSTRUCTOR);
    System.out.println(instance.sayHello());
  }

  @Test
  void buildSetter() {
    InjectionController instance = factoryInjectionController.createInstance(InjectionType.SETTER);
    System.out.println(instance.sayHello());
  }

  @Test
  void buildProperty() {
    InjectionController instance = factoryInjectionController.createInstance(InjectionType.PROPERTY);
    System.out.println(instance.sayHello());
  }
}