package org.example.cicdtest2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
  @GetMapping
  public String hello() {
    return "This is cicd test2 ---- auto deplotment with github actions";
  }
}
