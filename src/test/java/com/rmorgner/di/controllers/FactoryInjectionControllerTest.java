package com.rmorgner.di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FactoryInjectionControllerTest {

  @Autowired
  FactoryInjectionController controllerFactory;

  @Test
  void buildConstructor() {
    InjectionController instance = controllerFactory.createInstance(InjectionType.CONSTRUCTOR);
    System.out.println(instance.sayHello());
  }

  @Test
  void buildSetter() {
    InjectionController instance = controllerFactory.createInstance(InjectionType.SETTER);
    System.out.println(instance.sayHello());
  }

  @Test
  void buildProperty() {
    InjectionController instance = controllerFactory.createInstance(InjectionType.PROPERTY);
    System.out.println(instance.sayHello());
  }
}