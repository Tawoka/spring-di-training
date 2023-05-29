package com.rmorgner.di.services.env;

import com.rmorgner.di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("env")
public class UatGreetings implements GreetingService {
  @Override
  public String sayGreeting() {
    return "Tell me I am beautiful!";
  }
}
