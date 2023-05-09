package com.rmorgner.di.controllers;

import com.rmorgner.di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PropertyInjectorControllerTest {

  @Autowired
  PropertyInjectorController controller;

  @Test
  void sayHello(){
    System.out.println(controller.sayHello());
  }


}