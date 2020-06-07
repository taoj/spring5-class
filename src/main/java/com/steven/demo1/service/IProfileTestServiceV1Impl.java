package com.steven.demo1.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"v1", "default"})
@Service
public class IProfileTestServiceV1Impl implements IProfileTestService {

  @Override
  public String testProfile() {
    return "profile test v1.";
  }
}
