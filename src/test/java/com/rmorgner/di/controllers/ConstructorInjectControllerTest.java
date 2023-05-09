package com.rmorgner.di.controllers;

import com.rmorgner.di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectControllerTest {

  ConstructorInjectController controller;

  @BeforeEach
  void setUp() {
    controller = new ConstructorInjectController(new GreetingServiceImpl());
  }

  @Test
  void sayHello() {
    System.out.println(controller.sayHello());
  }
}