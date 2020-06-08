package com.steven.demo1.controllers;

import com.steven.demo1.service.ProfileTestService;

import org.springframework.stereotype.Controller;

@Controller
public class ProfileTestingController {

  private final ProfileTestService profileTestService;

  public ProfileTestingController(ProfileTestService profileTestService) {
    this.profileTestService = profileTestService;
  }

  public void profileTest(){
    System.out.println(profileTestService.testProfile());
  }
}
