package com.steven.demo1.controllers;

import com.steven.demo1.service.GreetingService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class QualifierTestController {

  private final GreetingService engGreetingService;
  private final GreetingService chnGreetingService;


  public QualifierTestController(@Qualifier("engGreetingServiceImpl") GreetingService engGreetingService,
      @Qualifier("chnGreetingServiceImpl") GreetingService chnGreetingService) {
    this.engGreetingService = engGreetingService;
    this.chnGreetingService = chnGreetingService;
  }

  public void chnGreetings(){
    System.out.println("Chinese Greetings");
    System.out.println(chnGreetingService.sayGreetings());
  }

  public void engGreetings(){
    System.out.println("English Greetings");
    System.out.println(engGreetingService.sayGreetings());
  }
}
