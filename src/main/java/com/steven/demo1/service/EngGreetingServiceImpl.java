package com.steven.demo1.service;

import org.springframework.stereotype.Service;

@Service
public class EngGreetingServiceImpl implements GreetingService {

  @Override
  public String sayGreetings() {
    return "Hello world";
  }
}
