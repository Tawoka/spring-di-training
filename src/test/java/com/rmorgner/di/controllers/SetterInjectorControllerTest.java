package com.rmorgner.di.controllers;

import com.rmorgner.di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectorControllerTest {

  SetterInjectorController setterInjectorController;

  @BeforeEach
  void setup(){
    setterInjectorController = new SetterInjectorController();
    setterInjectorController.setGreetingService(new GreetingServiceImpl());
  }

  @Test
  void sayHello(){
    System.out.println(setterInjectorController.sayHello());
  }

}