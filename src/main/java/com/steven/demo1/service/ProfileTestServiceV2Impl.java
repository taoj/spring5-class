package com.steven.demo1.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("v2")
@Service
public class ProfileTestServiceV2Impl implements ProfileTestService {

  @Override
  public String testProfile() {
    return "profile test v2";
  }
}
