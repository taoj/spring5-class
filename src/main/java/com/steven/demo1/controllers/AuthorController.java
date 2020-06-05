package com.steven.demo1.controllers;

import com.steven.demo1.repository.AuthorRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

  private final AuthorRepository authorRepository;

  public AuthorController(AuthorRepository authorRepository){
    this.authorRepository = authorRepository;
  }

  @RequestMapping("authors")
  public String listAuthors(Model model){

    model.addAttribute("authors", authorRepository.findAll());
    return "authors/list";
  }
}
