package com.steven.demo1.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("v2")
@Service
public class IProfileTestServiceV2Impl implements IProfileTestService {

  @Override
  public String testProfile() {
    return "profile test v2";
  }
}
