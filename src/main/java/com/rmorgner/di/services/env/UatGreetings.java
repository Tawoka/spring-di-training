package com.rmorgner.di.services.env;

import com.rmorgner.di.services.EnvironmentGreeting;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("env")
public class UatGreetings implements EnvironmentGreeting {
  @Override
  public String sayEnvironmentGreeting() {
    return "Tell me I am beautiful!";
  }
}
