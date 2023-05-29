package com.rmorgner.di.services.i18n;

import com.rmorgner.di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18nService")
public class EnglishGreeting implements GreetingService {
  @Override
  public String sayGreeting() {
    return "Hello World - EN";
  }
}
