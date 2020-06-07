package com.steven.demo1.controllers;

import com.steven.demo1.service.IProfileTestService;

import org.springframework.stereotype.Controller;

@Controller
public class ProfileTestingController {

  private final IProfileTestService profileTestService;

  public ProfileTestingController(IProfileTestService profileTestService) {
    this.profileTestService = profileTestService;
  }

  public void profileTest(){
    System.out.println(profileTestService.testProfile());
  }
}
