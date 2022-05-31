package com.kimprj.springbootpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//RestFul

@RestController
@RequestMapping("/books")
public class BookController {

  @GetMapping
  public String getById() {
    System.out.println("springBoot is runing...");
    return "spring boot is runing...";
  }
}
