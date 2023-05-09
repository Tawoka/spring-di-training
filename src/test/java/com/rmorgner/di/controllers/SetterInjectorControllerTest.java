package com.rmorgner.di.controllers;

import com.rmorgner.di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SetterInjectorControllerTest {

  @Autowired
  SetterInjectorController setterInjectorController;

  @Test
  void sayHello(){
    System.out.println(setterInjectorController.sayHello());
  }

}