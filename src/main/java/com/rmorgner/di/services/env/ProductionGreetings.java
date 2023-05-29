package com.rmorgner.di.services.env;

import com.rmorgner.di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("production")
@Service("env")
public class ProductionGreetings implements GreetingService {
  @Override
  public String sayGreeting() {
    return "Hello IT! Have you tried turning it off and on again?";
  }
}
