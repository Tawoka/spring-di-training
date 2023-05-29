package com.rmorgner.di.services.env;

import com.rmorgner.di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("env")
public class QAGreetings implements GreetingService {


  @Override
  public String sayGreeting() {
    return "We will tell you, when it fails!";
  }

}
