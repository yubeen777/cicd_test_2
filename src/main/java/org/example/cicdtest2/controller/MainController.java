package org.example.cicdtest2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
  @GetMapping
  public String hello() {
    return "This is cicd test 2 --- real auto deployment with github actions -- version 3.0 ";
  }
}