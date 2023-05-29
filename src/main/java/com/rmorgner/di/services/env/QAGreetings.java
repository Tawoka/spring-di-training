package com.rmorgner.di.services.env;

import com.rmorgner.di.services.EnvironmentGreeting;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("env")
public class QAGreetings implements EnvironmentGreeting {

  @Override
  public String sayEnvironmentGreeting() {
    return "We will tell you, when it fails!";
  }

}
