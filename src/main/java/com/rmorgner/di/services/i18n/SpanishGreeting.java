package com.rmorgner.di.services.i18n;

import com.rmorgner.di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class SpanishGreeting implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hola Mundo - ES";
  }

}
