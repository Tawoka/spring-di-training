package com.rmorgner.di.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("ES")
@SpringBootTest
class LanguageControllerTest {

  @Autowired
  LanguageController languageController;

  @Test
  void sayHello() {
    System.out.println(languageController.sayHello());
  }

}