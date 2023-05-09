package com.rmorgner.di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SetterInjectorControllerTest {

  @Autowired
  SetterInjectorController setterInjectorController;

  @Test
  void sayHello(){
    System.out.println(setterInjectorController.sayHello());
  }

}