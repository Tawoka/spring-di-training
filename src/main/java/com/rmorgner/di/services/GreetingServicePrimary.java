package com.rmorgner.di.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimary implements GreetingService{

  @Autowired
  public GreetingServicePrimary() {
  }

  @Override
  public String sayGreeting() {
    return "Hello from the Primary Bean!";
  }
}
