package com.rmorgner.di.controllers.env;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles({"production", "EN"})
@SpringBootTest
class EnvironmentControllerTest {

  @Autowired
  EnvironmentController environmentController;

  @Test
  void sayHello() {
    System.out.println(environmentController.sayHello());
  }
}