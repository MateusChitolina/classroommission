package com.classroommission.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/teste")
public class Teste {

  @GetMapping("/teste-get")
  public String getAll(@RequestParam String param) {
      return "a";
  }
  
}
