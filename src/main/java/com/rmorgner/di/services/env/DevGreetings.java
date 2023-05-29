package com.rmorgner.di.services.env;

import com.rmorgner.di.services.EnvironmentGreeting;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service("env")
public class DevGreetings implements EnvironmentGreeting {

  @Override
  public String sayEnvironmentGreeting() {
    return "Don't touch unless you know what you're doing... so DO NOT TOUCH!";
  }

}
