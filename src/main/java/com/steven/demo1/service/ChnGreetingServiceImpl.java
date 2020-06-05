package com.steven.demo1.service;

import org.springframework.stereotype.Service;

@Service
public class ChnGreetingServiceImpl implements GreetingService {

  @Override
  public String sayGreetings() {
    return "你好！";
  }
}
