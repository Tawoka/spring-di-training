package com.rmorgner.di.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService{

  @Override
  public String sayGreeting() {
    return "Just don't inject properties, dude!";
  }
}
